package com.accompania.rest;

import com.accompania.domain.User;
import com.accompania.rest.annotation.JsonRequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author beauchef on 2016-10-12.
 */
@RestController
public class UserController {

  @JsonRequestMapping(path = "/")
  public User home() {
    return new User("John", "Doe");
  }

}
