package com.itlucky.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: itlucky
 * @Date: 2020/1/8 10:48 下午
 * @Description: TODO
 * @Version: V1.0
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String code;
}
