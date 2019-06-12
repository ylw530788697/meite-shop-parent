package com.mayikt.weixin.entity;

import lombok.Data;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/06/02 11:30
 */
@Data
public class AppEntity {
    private String appId;

    private String appName;

    public AppEntity(
    ){
        super();
    }

    public AppEntity(String appId,String appName){
        super();
        this.appId=appId;
        this.appName=appName;
    }

    public static void main(String[] args) {
        AppEntity appEntity = new AppEntity();
    }


}
