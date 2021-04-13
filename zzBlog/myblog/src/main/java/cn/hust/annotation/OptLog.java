package cn.hust.annotation;

import java.lang.annotation.*;

/**
 * 操作日志注解
 *
 * @author zz
 * @date: 2021-04-13
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OptLog {

    /**
     * @return 操作类型
     */
    String optType() default "";

}
