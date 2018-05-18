package com.lyw.source.controller;

import com.lyw.source.Properties.SpringDataSource;
import com.lyw.source.dao.MenuMapper;
import com.lyw.source.entity.Menu;
import com.lyw.source.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.DateUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 类描述：采购清单维护
 *
 * @author liangyuwu
 * @Time 2018/5/16 14:09
 */
@RestController
@RequestMapping("/order")
public class GoodsController {

    private static Logger logger = LoggerFactory.getLogger(GoodsController.class);

    @Autowired(required = false)
    MenuMapper menuMapper;
    @Autowired
    SpringDataSource springDataSource;

    @RequestMapping("test")
    public String test() {
        return "hell";
    }


    @RequestMapping("/menu/{id}")
    @ResponseBody
    protected ModelAndView getMenu(@PathVariable("id") Integer id) {
        String d =springDataSource.getDriverClassName();
        Menu menu = menuMapper.selectByPrimaryKey(id);
        ModelAndView modelAndView = new ModelAndView("goods/index");
        modelAndView.addObject("username", "梁玉武");
        modelAndView.addObject("password", "lyw021600");
        modelAndView.addObject("userList", getUserList(1));
        return modelAndView;
    }

    public List<User> getUserList(Integer userId) {
        List<User> rows = new ArrayList<>();

        User user = new User();
        user.setUserName("供货商1");
        user.setEmailTopic("我们这边有新到一批货源，有兴趣观看吗");
        user.setEmailDays(new Date());

        User user1 = new User();
        user1.setUserName("小敏超时");
        user1.setEmailTopic("北京航贸邮箱");
        user1.setEmailDays(new Date());

        rows.add(user);
        rows.add(user1);

        return rows;
    }

}
