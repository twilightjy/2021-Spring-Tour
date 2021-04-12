package cn.hust.vo;

import cn.hust.constant.StatusConst;
import lombok.Data;

import java.io.Serializable;
/**
 * 接口返回类VO
 * @author zz
 */
@Data
public class Result<T> implements Serializable {
    private boolean flag;
    private Integer code;
    private String message;
    private T data;

    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = (T) data;
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result() {
        this.flag = true;
        this.code = StatusConst.OK;
        this.message = "操作成功!";
    }


}