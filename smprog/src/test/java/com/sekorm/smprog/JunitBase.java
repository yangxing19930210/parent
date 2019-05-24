package com.sekorm.smprog;


import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sekorm.common.spms.security.vo.UserLoginVO;




/**
 * @describe 测试基类
 * 
 * @author zhangq
 * @date 2014年6月30日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring.xml","classpath:spring/spring-dubbo.xml" })
//@ContextConfiguration(locations = { "classpath:spring/spring.xml" })
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
	
	public UserLoginVO getUserLoginVO() {
		UserLoginVO userLoginVO = new UserLoginVO();
		userLoginVO.setId(1);
		userLoginVO.setMemId(83882763);
		userLoginVO.setTrueName("徐燕桂");
		userLoginVO.setMemMobile("15814033255");
		userLoginVO.setMemStatus(0);
		userLoginVO.setStatus(0);
		userLoginVO.setSpId(1);
		return userLoginVO;
	}


}
