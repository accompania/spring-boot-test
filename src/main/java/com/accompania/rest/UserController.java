package com.accompania.rest;

import com.accompania.domain.User;
import com.accompania.rest.annotation.RestController;
import com.accompania.rest.annotation.request.Get;
import com.accompania.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

/**
 * @author beauchef on 2016-10-12.
 */
@RestController("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @Get("/")
  public List<User> users() {
    return userService.getUsers();
  }

  @Get("/{userId}")
  public User user(@PathVariable Long userId) {
    return userService.getUser(userId);
  }

}
