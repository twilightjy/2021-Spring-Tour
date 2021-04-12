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
    public class TbMessage implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 主键id
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 用户ip
     */
      private String ipAddress;

      /**
     * 用户地址
     */
      private String ipSource;

      /**
     * 昵称
     */
      private String nickname;

      /**
     * 头像
     */
      private String avatar;

      /**
     * 留言内容
     */
      private String messageContent;

      /**
     * 弹幕速度
     */
      private Boolean time;

      /**
     * 发布时间
     */
        @TableField(fill = FieldFill.INSERT)
      private LocalDateTime createTime;


}
