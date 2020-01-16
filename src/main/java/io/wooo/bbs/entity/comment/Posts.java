package io.wooo.bbs.entity.comment;

import io.wooo.bbs.entity.BaseEntity;
import io.wooo.bbs.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * 帖子表
 *
 * @author wb-wsp312690
 * @version 1.0.0
 * @date 2020-01-15 16:32:36
 **/
@Entity
@Table(name = "bbs_posts")
@Setter
@Getter
public class Posts extends BaseEntity {

    /**
     * BBS标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 评论列表
     */
    @OneToMany(fetch = FetchType.LAZY)
    private List<Comment> comments;

    /**
     * 发表主题的用户
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User createUser;
}
