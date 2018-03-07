package com.hello.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.hello.bean.Customer;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * <p>
 * 顾客; InnoDB free: 11264 kB Mapper 接口
 * </p>
 *
 * @author dengj
 * @since 2017-11-24
 */
public interface CustomerMapper extends BaseMapper<Customer> {
    @SelectProvider(type = CustomerProvider.class, method = "findByOriginal")
    List<Customer> findByOriginal();
}
