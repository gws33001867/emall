package com.emall.uaa.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author shanganwei
 */
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {

    private Long createTime;

    private String createdBy;

    private Long updatedTime;

    private String updatedBy;
}
