package com.mayikt.weixin.service;

import com.mayikt.weixin.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/06/02 11:37
 */
public interface WeiXinService {
    @GetMapping("/getApp")
    public AppEntity getApp();

}
