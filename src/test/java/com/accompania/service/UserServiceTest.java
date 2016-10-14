package com.accompania.service;

import com.accompania.domain.User;
import com.accompania.service.impl.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Useless tests, to test build infrastructure.
 * @author beauchef on 2016-10-13.
 */
public class UserServiceTest {

  UserService serviceToTest = new UserServiceImpl();

  @Test
  public void givenUserService_whenSearchingListOfUsers_thenGetNonEmptyList() {
    List<User> users = serviceToTest.getUsers();
    Assert.assertFalse("Expected a non-empty list, but result was empty.", users.isEmpty());
  }

  @Test
  public void givenUserService_whenSearchingExistingUser_thenGetUserBack() {
    User user = serviceToTest.getUser(1L);
    Assert.assertNotNull("Expected a user back, but got null.", user);
  }

  @Test
  public void givenUserService_whenSearchingNonExistingUser_thenGetNullBack() {
    User user = serviceToTest.getUser(999L);
    Assert.assertNull("Expected to get null back, but got a user instead.", user);
  }

}
