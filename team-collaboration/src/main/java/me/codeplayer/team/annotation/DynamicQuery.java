package me.codeplayer.team.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 【支持动态查询】<br>
 * 标识指定方法或参数支持动态查询
 * 
 * @package me.codeplayer.team.annotation.
 * @date 2015年8月14日
 * @since 1.0
 * @author Ready
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
@Target({ ElementType.METHOD, ElementType.PARAMETER })
public @interface DynamicQuery {

	/**
	 * 允许动态查询的参数属性信息
	 * 
	 * @return
	 * @since 1.0
	 * @author Ready
	 */
	String[] value() default {};
}
