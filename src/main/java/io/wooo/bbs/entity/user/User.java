package io.wooo.bbs.entity.user;

import io.wooo.bbs.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * 用户表
 *
 * @author wb-wsp312690
 * @version 1.0.0
 * @date 2020-01-15 17:28:14
 **/
@Entity
@Table(name = "bbs_user")
@Setter
@Getter
public class User extends BaseEntity {

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 用户名-默认使用手机号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 最后登录时间
     */
    private LocalDateTime lastLoginDate;

    /**
     * 最后登录地点
     */
    private String lastLoginLocation;
}
