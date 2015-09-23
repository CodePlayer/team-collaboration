package me.codeplayer.team.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 【可以为null】<br>
 * 标识指定参数允许为null。如果该注解标记在方法上，表示其所有参数均可以为null。
 * 
 * @package me.codeplayer.team.annotation.
 * @date 2015年8月14日
 * @since 1.0
 * @author Ready
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
@Target({ ElementType.PARAMETER, ElementType.METHOD })
public @interface Nullable {
}
