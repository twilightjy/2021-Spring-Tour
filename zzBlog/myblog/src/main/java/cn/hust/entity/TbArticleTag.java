package cn.hust.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
    public class TbArticleTag implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 文章id
     */
      private Integer articleId;

      /**
     * 标签id
     */
      private Integer tagId;


}
