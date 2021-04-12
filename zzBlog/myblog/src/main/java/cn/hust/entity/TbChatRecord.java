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
    public class TbChatRecord implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 主键
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 用户id
     */
      private Integer userId;

      /**
     * 昵称
     */
      private String nickname;

      /**
     * 头像
     */
      private String avatar;

      /**
     * 聊天内容
     */
      private String content;

      /**
     * ip地址
     */
      private String ipAddr;

      /**
     * ip来源
     */
      private String ipSource;

      /**
     * 类型
     */
      private Integer type;

      /**
     * 创建时间
     */
        @TableField(fill = FieldFill.INSERT)
      private LocalDateTime createTime;


}
