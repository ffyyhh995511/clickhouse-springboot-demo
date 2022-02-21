package org.fyh.clickhouse.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author fangyunhe
 * @version 1.0
 * @Description
 * @time 2022/2/16 16:21
 */
@Data
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String userName;
    private String passWord;
    private String phone;
    private String email;
    private String createDay;
}