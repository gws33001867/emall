package com.emall.uaa;

import com.emall.uaa.dao.UserMapper;
import com.emall.uaa.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author shanganwei
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UaaApplicationTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void select() {
        List<UserEntity> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }
}
