package com.aoher.repository;

import com.aoher.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Find user by (where usrloginid=? and usrrowstate=?)
     * @param userLoginId user login id
     * @return User
     */
    User findByUsrLoginIdAndUsrRowState(String userLoginId, Integer usrRowState);


    /**
     * Find user by (where usrid=? and usrrowstate=?)
     * @param userLoginId user login id
     * @return User
     */
    User findByUsrIdAndUsrRowState(Long userLoginId,Integer usrRowState);
}
