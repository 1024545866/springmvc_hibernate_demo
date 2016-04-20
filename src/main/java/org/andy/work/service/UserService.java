package org.andy.work.service;

import java.util.List;

import org.andy.work.entity.AcctUser;

/**
 * @version 2.2
 *  userService接口
 */

public interface UserService {
  AcctUser load(String id);

  AcctUser get(String id);

  List<AcctUser> findAll();

  void persist(AcctUser entity);

  String save(AcctUser entity);

  void saveOrUpdate(AcctUser entity);

  void delete(String id);

  void flush();
}