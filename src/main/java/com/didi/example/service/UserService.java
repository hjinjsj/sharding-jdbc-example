/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.didi.example.service;

import com.didi.example.dto.UserDto;
import com.didi.example.lib.MyException;

import java.util.List;

public interface UserService {
  public UserDto findById(long uid) throws MyException;

  public List<UserDto> findByIds(List<Long> uids);

  public long create(UserDto user) throws MyException;

  public boolean update(UserDto user) throws MyException;

  public boolean remove(long uid) throws MyException;
}
