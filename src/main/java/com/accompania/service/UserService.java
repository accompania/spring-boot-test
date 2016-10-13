package com.accompania.service;

import com.accompania.domain.User;

import java.util.List;

/**
 * @author beauchef on 2016-10-13.
 */
public interface UserService {

  List<User> getUsers();
  User getUser(Long userId);

}
