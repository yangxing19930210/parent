package com.sekorm.smprog.common;

/**
 * @describe 读取配置文件的参数数据
 * 
 * @author zhangq
 * @date 2014年7月10日
 */
public class Parameter {

	// 域名+端口的应用路径
	public static String webPortUrl;
	
	public static String getWebPortUrl() {
		return webPortUrl;
	}

	public  void setWebPortUrl(String webPortUrl) {
		Parameter.webPortUrl = webPortUrl;
	}

}