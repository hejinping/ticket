package com.guolun.sys.config.aop;

import com.guolun.sys.config.db.DataSourceContextHolder;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 拦截数据库读写
 *
 * @author
 */

@Aspect
@Component
@Order(1)
public class DataSourceAspect {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution(* com.guolun..*.*ServiceImpl.find*(..)) " +
            "|| execution(* com.guolun..*.*ServiceImpl.count*(..))" +
            "|| execution(* com.guolun..*.*ServiceImpl.sel*(..))" +
            "|| execution(* com.guolun..*.*ServiceImpl.get*(..))"
    )
    public void setReadDataSourceType() {
        //logger.debug("拦截[read]方法");
        DataSourceContextHolder.read();
    }

    @Before("execution(* com.guolun..*.*ServiceImpl.insert*(..)) " +
            "|| execution(* com.guolun..*.*ServiceImpl.save*(..))" +
            "|| execution(* com.guolun..*.*ServiceImpl.update*(..))" +
            "|| execution(* com.guolun..*.*ServiceImpl.set*(..))" +
            "|| execution(* com.guolun..*.*ServiceImpl.del*(..))")
    public void setWriteDataSourceType() {
       // logger.debug("拦截[write]操作");
        DataSourceContextHolder.write();
    }

}
