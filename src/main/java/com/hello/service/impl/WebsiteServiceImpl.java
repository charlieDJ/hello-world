package com.hello.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hello.bean.Website;
import com.hello.dao.WebsiteMapper;
import com.hello.service.IWebsiteService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dengj
 * @since 2018-03-07
 */
@Service
public class WebsiteServiceImpl extends ServiceImpl<WebsiteMapper, Website> implements IWebsiteService {

}
