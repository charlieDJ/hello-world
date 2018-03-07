package com.hello.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.google.common.collect.Lists;
import com.hello.bean.Customer;
import com.hello.bean.Website;
import com.hello.common.ServerResponse;
import com.hello.service.ICustomerService;
import com.hello.service.IWebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class HelloController {

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private IWebsiteService websiteService;

    @GetMapping("/hello")
    public ServerResponse<List<String>> sayHello(){
        return ServerResponse.createBySuccess(Lists.newArrayList("hello","myWorld","this is my","craft"));
    }

    @GetMapping("/find/{id}")
    public ServerResponse<Customer> findById(@PathVariable("id") String id){
        Optional<Customer> customer = Optional.ofNullable(customerService.selectById(id));
        if(!customer.isPresent()){
            return ServerResponse.createByErrorMessage("未查询到数据");
        }
        return ServerResponse.createBySuccess(customer.get());
    }

    @GetMapping("/web/{id}")
    public ServerResponse<List<Website>> findWeb(@PathVariable("id") String id){
        List<Website> websites = websiteService.selectList(new EntityWrapper<Website>().eq("customer_Id",id));
        if(CollectionUtils.isEmpty(websites)){
            return ServerResponse.createByErrorMessage("未查询到数据");
        }
        return ServerResponse.createBySuccess(websites);
    }
}
