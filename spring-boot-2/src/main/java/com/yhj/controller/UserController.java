package com.yhj.controller;

import com.yhj.config.AppConfig;
import com.yhj.pojo.User;
import com.yhj.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by YHJ on 2016/9/3.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
    @Resource
    private AppConfig appConfig;

    @RequestMapping("/save")
    public String insert(User user){
        userService.insert(user);
        return "redirect:/user/find";
    }

    @RequestMapping("/update")
    public String update(User user){
        userService.update(user);
        return "redirect:/user/find";
    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        userService.delete(id);
        return "redirect:/user/find";
    }

    @RequestMapping("/find")
    public String find(User user, ModelMap modelMap){
        List<User> users =  userService.find(user);
        modelMap.put("users",users);
        return "/user/index";
    }

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.put("app",appConfig);
        return "/index";
    }

    @RequestMapping("/findByJson")
    @ResponseBody
    public List<User> findByJson(User user){
        return userService.find(user);
    }
}
