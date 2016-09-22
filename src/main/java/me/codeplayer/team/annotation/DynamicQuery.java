package me.codeplayer.team.annotation;

import java.lang.annotation.*;

/**
 * 【支持动态查询】<br>
 * 标识指定方法或参数支持动态查询
 * 
 * @date 2015年8月14日
 * @since 1.0
 * @author Ready
 */
@Retention(RetentionPolicy.CLASS)
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
