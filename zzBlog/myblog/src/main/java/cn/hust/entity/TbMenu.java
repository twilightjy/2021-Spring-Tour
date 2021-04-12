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
    public class TbMenu implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 主键
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 菜单名
     */
      private String name;

      /**
     * 菜单路径
     */
      private String path;

      /**
     * 组件
     */
      private String component;

      /**
     * 菜单icon
     */
      private String icon;

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
     * 排序
     */
      private Integer orderNum;

      /**
     * 父id
     */
      private Integer parentId;

      /**
     * 是否禁用 0否1是
     */
      private Boolean isDisable;

      /**
     * 是否隐藏  0否1是
     */
      private Boolean isHidden;


}
