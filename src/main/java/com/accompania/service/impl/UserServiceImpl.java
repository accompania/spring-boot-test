package com.accompania.service.impl;

import com.accompania.domain.User;
import com.accompania.service.UserService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author beauchef on 2016-10-13.
 */
@Service
public class UserServiceImpl implements UserService {

  private static final User JOHN = new User(1L, "John", "Doe");
  private static final User JANE = new User(2L, "Jane", "White");
  private static final User BOB = new User(3L, "Bob", "Dole");

  private static final Map<Long, User> USERS;
  static {
    Map<Long, User> users = new HashMap<>();
    users.put(JOHN.getId(), JOHN);
    users.put(JANE.getId(), JANE);
    users.put(BOB.getId(), BOB);
    USERS = Collections.unmodifiableMap(users);
  }

  @Override
  public List<User> getUsers() {
    return new ArrayList<>(USERS.values());
  }

  @Override
  public User getUser(Long userId) {
    return USERS.get(userId);
  }
}
