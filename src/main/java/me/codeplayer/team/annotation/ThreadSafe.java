package me.codeplayer.team.annotation;

import java.lang.annotation.*;

/**
 * 【线程安全】<br>
 * 标识指定类或方法是非线程安全的，可直接用于多线程环境
 * 
 * @date 2015年9月23日
 * @since 1.0
 * @author Ready
 */
@Retention(RetentionPolicy.CLASS)
@Documented
@Target({ ElementType.TYPE, ElementType.METHOD })
public @interface ThreadSafe {
}
