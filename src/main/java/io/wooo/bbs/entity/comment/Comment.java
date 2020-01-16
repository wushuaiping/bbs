package io.wooo.bbs.entity.comment;

import io.wooo.bbs.entity.BaseEntity;
import io.wooo.bbs.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 评论表
 *
 * @author wb-wsp312690
 * @version 1.0.0
 * @date 2020-01-15 17:17:25
 **/
@Entity
@Table(name = "bbs_comment")
@Setter
@Getter
public class Comment extends BaseEntity {

    /**
     * 评论内容
     */
    private String comment;

    /**
     * 评论的主题
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private Posts posts;

    /**
     * 评论用户
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User createUser;
}
