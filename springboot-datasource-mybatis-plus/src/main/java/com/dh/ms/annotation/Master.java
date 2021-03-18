package com.dh.ms.annotation;

import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Transactional(rollbackFor = Exception.class)
public @interface Master {
}
