package com.sky.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sky.jwt")  //从yaml(springboot)→jave(javabeam),自动偷取配置文件中的配置类，
@Data                                         //依靠类型分配给java(实体)类，java类的属性名字可自定义不需与配置文件中一致
public class JwtProperties {                  //充分解耦，后续在java中可以使用该数据（利用getandset方法等等）生成登录令牌

    /**
     * 管理端员工生成jwt令牌相关配置
     */
    private String adminSecretKey;
    private long adminTtl;
    private String adminTokenName;

    /**
     * 用户端微信用户生成jwt令牌相关配置
     */
    private String userSecretKey;
    private long userTtl;
    private String userTokenName;

}
