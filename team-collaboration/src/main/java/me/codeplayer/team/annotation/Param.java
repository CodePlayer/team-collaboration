package me.codeplayer.team.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 【方法参数信息】<br>
 * 标识当前方法所必需传入和非必需传入的参数信息
 * 
 * @package me.codeplayer.team.annotation
 * @date 2015年8月14日
 * @since 1.0
 * @author Ready
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
@Target({ ElementType.METHOD, ElementType.PARAMETER })
public @interface Param {

	/**
	 * 必须传入的参数名称数组（如果是对象的属性，请使用 <code>"object.property"</code> 的方式进行标记，如果只有一个对象属性，则可简写为 <code>".property"</code> ）
	 * 
	 * @return
	 * @since 1.0
	 * @author Ready
	 */
	String[] value();

	/**
	 * 可选（非必需）传入的参数名称数组（如果是对象的属性，请使用 <code>"object.property"</code> 的方式进行标记，如果只有一个对象属性，则可简写为 <code>".property"</code> ）
	 * 
	 * @return
	 * @since 1.0
	 * @author Ready
	 */
	String[] optional() default {};
}
