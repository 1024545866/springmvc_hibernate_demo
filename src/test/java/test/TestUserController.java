package test;


import java.util.List;

import org.andy.work.controllers.UserController;
import org.andy.work.entity.AcctUser;
import org.andy.work.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {  "classpath:spring-mvc.xml","classpath:spring.xml",
   "classpath:spring-hibernate.xml" })
public class TestUserController {
  

  private static final Logger LOGGER = Logger
      .getLogger(TestUserService.class);

  @Autowired
  private UserController userController;
  
  @Test
  public void findUser() {
    
    List<AcctUser>  list = userController.find();
    
    LOGGER.info(JSON.toJSON(list));
    
  }
  
  
}
