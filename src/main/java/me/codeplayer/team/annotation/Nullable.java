package me.codeplayer.team.annotation;

import java.lang.annotation.*;

/**
 * 【可以为null】<br>
 * 标识指定参数允许为null。如果该注解标记在方法上，表示其所有参数均可以为null。
 * 
 * @date 2015年8月14日
 * @since 1.0
 * @author Ready
 */
@Retention(RetentionPolicy.CLASS)
@Documented
@Target({ ElementType.PARAMETER, ElementType.METHOD })
public @interface Nullable {

	/**
	 * 如果为null时，其等价的值
	 * <p>
	 * 如果方法的参数指定了非空值，则表示该参数的默认值；
	 * 如果没有手动指定，则表示默认值为null；
	 * 如果手动指定为""，则表示默认值为""。
	 * </p>
	 * 
	 * @return
	 */
	String value() default "";
}
