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
    public class TbComment implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 评论用户Id
     */
      private Integer userId;

      /**
     * 评论文章id
     */
      private Integer articleId;

      /**
     * 评论内容
     */
      private String commentContent;

      /**
     * 评论时间
     */
        @TableField(fill = FieldFill.INSERT)
      private LocalDateTime createTime;

      /**
     * 回复用户id
     */
      private Integer replyId;

      /**
     * 父评论id
     */
      private Integer parentId;

      /**
     * 是否删除  0否 1是
     */
      private Integer isDelete;


}
