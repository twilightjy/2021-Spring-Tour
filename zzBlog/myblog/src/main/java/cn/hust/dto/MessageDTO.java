package cn.hust.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**留言列表
 * @author: zz
 * @date: 2021-04-13
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageDTO {

    /**
     * 主键id
     */
    private Integer id;

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
    private Integer time;

}
