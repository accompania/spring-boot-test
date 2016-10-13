package com.accompania.rest.annotation.request;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author beauchef on 2016-10-13.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@RequestMapping(method = RequestMethod.GET, produces = "application/json")
public @interface Get {

  @AliasFor(annotation = RequestMapping.class, attribute = "value")
  String[] value() default {};

  @AliasFor(annotation = RequestMapping.class, attribute = "path")
  String[] path() default {};

  @AliasFor(annotation = RequestMapping.class, attribute = "params")
  String[] params() default {};

  @AliasFor(annotation = RequestMapping.class, attribute = "headers")
  String[] headers() default {};

  @AliasFor(annotation = RequestMapping.class, attribute = "consumes")
  String[] consumes() default {};

  @AliasFor(annotation = RequestMapping.class, attribute = "produces")
  String[] produces() default {};

}

