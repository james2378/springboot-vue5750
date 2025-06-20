package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 跟练视频：(FollowUpVideo)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "FollowUpVideo")
public class FollowUpVideo implements Serializable {

    // FollowUpVideo编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "follow_up_video_id")
    private Integer follow_up_video_id;

    // 标题名称
    @Basic
    private String title_name;
    // 视频编号
    @Basic
    private String video_number;
    // 发布日期
    @Basic
    private Timestamp release_date;
    // 视频文件
    @Basic
    private String video_file;
    // 封面图片
    @Basic
    private String cover_photo;
    // 视频介绍
    @Basic
    private String video_introduction;


    // 点赞数
    @Basic
    private Integer praise_len;












    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
