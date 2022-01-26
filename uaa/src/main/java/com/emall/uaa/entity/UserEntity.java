package com.emall.uaa.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * @author shanganwei
 */
@Data
@SuperBuilder
public class UserEntity extends BaseEntity{

    private Integer id;

    private String username;

    private String password;
}
