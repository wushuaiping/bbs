package io.wooo.bbs.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 基础entity
 *
 * @author wb-wsp312690
 * @version 1.0.0
 * @date 2020-01-15 16:45:19
 **/
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    /**
     * 创建时间
     */
    @CreatedDate
    private LocalDateTime createdDate;

    /**
     * 最后修改时间
     */
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
}
