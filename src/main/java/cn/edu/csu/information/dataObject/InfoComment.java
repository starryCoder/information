package cn.edu.csu.information.dataObject;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class InfoComment implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_comment.create_time
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_comment.update_time
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_comment.id
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    @Id
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_comment.user_id
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_comment.news_id
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    private Integer newsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_comment.parent_id
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_comment.like_count
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    private Integer likeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_comment.content
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table info_comment
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_comment.create_time
     *
     * @return the value of info_comment.create_time
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_comment.create_time
     *
     * @param createTime the value for info_comment.create_time
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_comment.update_time
     *
     * @return the value of info_comment.update_time
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_comment.update_time
     *
     * @param updateTime the value for info_comment.update_time
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_comment.id
     *
     * @return the value of info_comment.id
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_comment.id
     *
     * @param id the value for info_comment.id
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_comment.user_id
     *
     * @return the value of info_comment.user_id
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_comment.user_id
     *
     * @param userId the value for info_comment.user_id
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_comment.news_id
     *
     * @return the value of info_comment.news_id
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    public Integer getNewsId() {
        return newsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_comment.news_id
     *
     * @param newsId the value for info_comment.news_id
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_comment.parent_id
     *
     * @return the value of info_comment.parent_id
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_comment.parent_id
     *
     * @param parentId the value for info_comment.parent_id
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_comment.like_count
     *
     * @return the value of info_comment.like_count
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_comment.like_count
     *
     * @param likeCount the value for info_comment.like_count
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_comment.content
     *
     * @return the value of info_comment.content
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_comment.content
     *
     * @param content the value for info_comment.content
     *
     * @mbg.generated Mon Mar 11 20:26:22 CST 2019
     */
    public void setContent(String content) {
        this.content = content;
    }
}