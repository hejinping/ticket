package com.guolun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Administrator on 2019/2/18 0018.
 */
@EnableTransactionManagement
@SpringBootApplication
public class SysProviderApplication  {
    public static void main(String[] args) {
        SpringApplication.run(SysProviderApplication.class);
    }


}
