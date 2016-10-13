package com.accompania.domain;

import lombok.Value;

import java.io.Serializable;

/**
 * @author beauchef on 2016-10-13.
 */
@Value
public class User implements Serializable {

  private String firstName;
  private String lastName;

}
