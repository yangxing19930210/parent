package com.sekorm.ismprog.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description ismprog启动类
 * @author lanva_xu
 * @date 2019年2月12日
 */
public class App {

    private static ApplicationContext ac;

    private final static Logger log = LoggerFactory.getLogger(App.class);

    public static ApplicationContext getAc() {
        return ac;
    }

    public static void setAc() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/spring.xml", "classpath:spring/spring-dubbo.xml");
        App.ac = ac;
    }

    public static void main(String[] args) throws Exception {
        setAc();
        log.info("smprog service start!!");
    }

}