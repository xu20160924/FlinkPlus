package com.fp.core.annotation;

import java.lang.annotation.*;

/**
 * @author: Denial.AO
 * @date: 2020年12月01日11:18:08
 * @description: PrintToLog
 **/
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintToLog {
}
