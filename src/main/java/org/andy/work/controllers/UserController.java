package org.andy.work.controllers;

import java.util.List;

import org.andy.work.entity.AcctUser;
import org.andy.work.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**  
 * @version 2.2  
 * 描述： 用户Controller
 */
@Controller
public class UserController {

  private static final Logger LOGGER = Logger.getLogger(UserController.class);
  
  @Autowired
  private UserService userService;
  
  @RequestMapping(value="/showInfo/{userId}", method = {RequestMethod.GET})
  public String showUserInfo(ModelMap modelMap, @PathVariable String userId){
    LOGGER.info("查询用户：" + userId);
    AcctUser userInfo = userService.load(userId);
    modelMap.addAttribute("userInfo", userInfo);
    return "/user/showInfo";
  }
  
  @RequestMapping(value="/showInfos", method = {RequestMethod.GET})
  public @ResponseBody List<AcctUser> showUserInfos(){
    LOGGER.info("查询用户全部用户");
    List<AcctUser> userInfos = userService.findAll();
    return userInfos;
  }
  
  @RequestMapping(value="/list", method = {RequestMethod.GET})
  public @ResponseBody List<AcctUser> find(){
    LOGGER.info("查询用户全部用户");
    List<AcctUser> userInfos = userService.findAll();
    return userInfos;
  }
  
  
}