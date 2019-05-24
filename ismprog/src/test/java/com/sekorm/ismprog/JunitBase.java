package com.sekorm.ismprog;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @describe 测试基类
 * 
 * @author zhangq
 * @date 2014年6月30日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring.xml" })
public class JunitBase {

	protected final Logger log = LoggerFactory.getLogger(this.getClass());

	@Before
	public void before() {
		log.debug("--------------Start Test---" + this.getClass()
				+ "----------------------");
	}

	@After
	public void after() {
		log.debug("-----------------End Test---" + this.getClass()
				+ "--------------------");
	}

	@Test
	public  void test(){

	}
 
	
}
