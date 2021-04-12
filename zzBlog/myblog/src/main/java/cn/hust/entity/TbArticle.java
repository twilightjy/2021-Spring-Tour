package cn.hust.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zz
 * @since 2021-04-12
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class TbArticle implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 作者
     */
      private Integer userId;

      /**
     * 文章分类
     */
      private Integer categoryId;

      /**
     * 文章缩略图
     */
      private String articleCover;

      /**
     * 标题
     */
      private String articleTitle;

      /**
     * 内容
     */
      private String articleContent;

      /**
     * 发表时间
     */
        @TableField(fill = FieldFill.INSERT)
      private LocalDateTime createTime;

      /**
     * 更新时间
     */
        @TableField(fill = FieldFill.INSERT_UPDATE)
      private LocalDateTime updateTime;

      /**
     * 是否置顶 0否 1是
     */
      private Boolean isTop;

      /**
     * 是否为草稿 0否 1是
     */
      private Boolean isDraft;

      /**
     * 是否删除  0否 1是
     */
      private Boolean isDelete;


}
