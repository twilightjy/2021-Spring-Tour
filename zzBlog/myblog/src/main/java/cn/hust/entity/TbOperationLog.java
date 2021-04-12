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
    public class TbOperationLog implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 主键id
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 操作模块
     */
      private String optModule;

      /**
     * 操作类型
     */
      private String optType;

      /**
     * 操作url
     */
      private String optUrl;

      /**
     * 操作方法
     */
      private String optMethod;

      /**
     * 操作描述
     */
      private String optDesc;

      /**
     * 请求参数
     */
      private String requestParam;

      /**
     * 请求方式
     */
      private String requestMethod;

      /**
     * 返回数据
     */
      private String responseData;

      /**
     * 用户id
     */
      private Integer userId;

      /**
     * 用户昵称
     */
      private String nickname;

      /**
     * 操作ip
     */
      private String ipAddr;

      /**
     * 操作地址
     */
      private String ipSource;

      /**
     * 创建时间
     */
        @TableField(fill = FieldFill.INSERT)
      private LocalDateTime createTime;


}
