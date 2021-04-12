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
    public class TbUserInfo implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 用户ID
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 用户昵称
     */
      private String nickname;

      /**
     * 用户头像
     */
      private String avatar;

      /**
     * 用户简介
     */
      private String intro;

      /**
     * 个人网站
     */
      private String webSite;

      /**
     * 创建时间
     */
        @TableField(fill = FieldFill.INSERT)
      private LocalDateTime createTime;

      /**
     * 更新时间
     */
        @TableField(fill = FieldFill.INSERT_UPDATE)
      private LocalDateTime updateTime;

      /**
     * 是否禁用
     */
      private Boolean isDisable;


}
