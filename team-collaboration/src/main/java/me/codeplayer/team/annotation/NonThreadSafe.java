package me.codeplayer.team.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 【非线程安全】<br>
 * 标识指定类或方法是非线程安全的，需谨慎调用
 * 
 * @package me.codeplayer.team.annotation
 * @date 2015年9月23日
 * @since 1.0
 * @author Ready
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
@Target({ ElementType.TYPE, ElementType.METHOD })
public @interface NonThreadSafe {
}
