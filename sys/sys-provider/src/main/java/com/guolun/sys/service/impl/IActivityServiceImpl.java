package com.guolun.sys.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.guolun.sys.api.IActivityService;
import com.guolun.sys.dto.Activity;
import com.guolun.sys.mapper.ActivityMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2019/2/18 0018.
 */
@Service
public class IActivityServiceImpl implements IActivityService {
    @Autowired
    private ActivityMapper activityMapper;
    @Override
    public Activity updateSelectByPrimaryKey() {
        Activity activity =activityMapper.selectByPrimaryKey(99);
        return  activity;
    }
}
