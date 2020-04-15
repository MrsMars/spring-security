package com.aoher.service.impl;

import com.aoher.model.User;
import com.aoher.repository.UserRepository;
import com.aoher.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User addNewUser(User user) {
        user.setUsrPassword(passwordEncoder.encode(user.getUsrPassword()));
        return userRepository.save(user);
    }

    @Override
    public User getUserByLoginId(String userLoginId) {
        return userRepository.findByUsrLoginIdAndUsrRowState(userLoginId, 1);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findByUsrIdAndUsrRowState(id,1);
    }
}
