package com.emall.uaa.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.emall.uaa.dao.UserMapper;
import com.emall.uaa.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Objects;

/**
 * @author shanganwei
 */
public class UserDetailServiceImpl implements UserDetailsService {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserEntity userEntity = userMapper.selectOne(new QueryWrapper<UserEntity>().eq("username", userName));
        if (Objects.nonNull(userEntity)) {
            return User.builder().username(userEntity.getUsername()).password(userEntity.getPassword()).build();
        }
        throw new UsernameNotFoundException("user not found");
    }
}
