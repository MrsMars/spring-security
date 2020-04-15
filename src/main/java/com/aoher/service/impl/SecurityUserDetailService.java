package com.aoher.service.impl;

import com.aoher.model.User;
import com.aoher.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.aoher.util.Constants.ROLE_ADMIN;
import static com.aoher.util.Constants.ROLE_USER;

@Service
public class SecurityUserDetailService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String userLoginId) throws UsernameNotFoundException {
        User user = userService.getUserByLoginId(userLoginId);
        if (user == null) {
            throw new UsernameNotFoundException("User " + userLoginId + " was not found in the database");
        }

        List<GrantedAuthority> grantList = new ArrayList<>();
        if(Boolean.TRUE.equals(user.getUsrIsAdmin())) {
            GrantedAuthority adminAuthority= new SimpleGrantedAuthority(ROLE_ADMIN);
            GrantedAuthority userAuthority= new SimpleGrantedAuthority(ROLE_USER);
            grantList.add(adminAuthority);
            grantList.add(userAuthority);
        }else {
            GrantedAuthority userAuthority= new SimpleGrantedAuthority(ROLE_USER);
            grantList.add(userAuthority);
        }


        return new org.springframework.security.core.userdetails.User(user.getUsrLoginId(),
                user.getUsrPassword()	, grantList);


    }
}
