package com.accompania.rest;

import com.accompania.domain.User;
import com.accompania.rest.annotation.RestController;
import com.accompania.rest.annotation.request.Get;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

/**
 * @author beauchef on 2016-10-12.
 */
@RestController("/users")
public class UserController {

  private static final User JOHN = new User(1L, "John", "Doe");
  private static final User JANE = new User(2L, "Jane", "White");

  private static final Map<Long, User> USERS;
  static {
    Map<Long, User> users = new HashMap<>();
    users.put(JOHN.getId(), JOHN);
    users.put(JANE.getId(), JANE);
    USERS = Collections.unmodifiableMap(users);
  }

  @Get("/")
  public List<User> users() {
    return new ArrayList<>(USERS.values());
  }

  @Get("/{userId}")
  public User user(@PathVariable Long userId) {
    return USERS.get(userId);
  }

}
