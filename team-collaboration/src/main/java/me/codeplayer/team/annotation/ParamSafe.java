package me.codeplayer.team.annotation;

import java.lang.annotation.*;

/**
 * 【参数安全】<br>
 * 标识指定方法内部已经对传入的外部参数进行数据合法性的安全检查
 * 
 * @package me.codeplayer.team.annotation
 * @date 2015年8月14日
 * @since 1.0
 * @author Ready
 */
@Retention(RetentionPolicy.CLASS)
@Documented
@Target(ElementType.METHOD)
public @interface ParamSafe {
}
