package com.accompania.rest.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.*;

/**
 * @author beauchef on 2016-10-13.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
@ResponseBody
@RequestMapping
public @interface RestController {

  @AliasFor(annotation = RequestMapping.class, attribute = "value")
  String[] value() default {};

  @AliasFor(annotation = RequestMapping.class, attribute = "path")
  String[] path() default {};

}
