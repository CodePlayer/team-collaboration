package me.codeplayer.team.annotation;

import java.lang.annotation.*;

/**
 * 【只读数据】<br>
 * 如果该注解标记在方法上，则表示该方法的返回值对象不允许外部修改<br>
 * 如果该注解标记在方法的参数上，则表示方法内部不会对传入参数对象做任何修改。
 * 
 * @date 2015年8月14日
 * @since 1.0
 * @author Ready
 */
@Retention(RetentionPolicy.CLASS)
@Documented
@Target({ ElementType.METHOD, ElementType.PARAMETER })
public @interface ReadOnly {
}
