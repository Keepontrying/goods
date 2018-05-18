package com.lyw.source.controller;

import com.lyw.source.Properties.SpringDataSource;
import com.lyw.source.dao.MenuMapper;
import com.lyw.source.entity.Menu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

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
        modelAndView.addObject("test", "梁玉武");
        return modelAndView;
    }


}
