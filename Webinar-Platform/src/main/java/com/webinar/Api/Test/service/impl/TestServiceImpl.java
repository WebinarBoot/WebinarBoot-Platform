package com.webinar.Api.Test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.webinar.Api.Test.domain.TestDomain;
import com.webinar.Api.Test.mapper.TestMapper;
import com.webinar.Api.Test.service.TestService;
import org.springframework.stereotype.Service;

/**
* @author Webinar
* @description 针对表【test】的数据库操作Service实现
* @createDate 2023-05-16 11:35:20
*/
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, TestDomain>
    implements TestService {

}




