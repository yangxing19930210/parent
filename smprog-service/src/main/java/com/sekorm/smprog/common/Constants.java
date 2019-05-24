package com.sekorm.smprog.common;

/**
 * 常量定义类
 * 
 * @author xing_feng
 * 
 */
public class Constants {

	public final static int API_STATUS_OK = 0;// 调用api成功代码
	public final static int API_STATUS_FAIL = -1; // 调用api失败代码
	public final static int API_SYSTEM_EXCEPTION = -100;//系统出现异常

	public static final int CATEGORY_PROGRAM = 4;

	/** 上架 */
	public static final int CATEGORY_OP_TYPE_ON = 1;
	/** 下架 */
	public static final int CATEGORY_OP_TYPE_OFF = 0;

	public static final int CATEGORY_VERIFY_STATUS_PENDING = 0;

	public static final int CATEGORY_VERIFY_STATUS_PASSED = 1;

	public static final int CATEGORY_VERIFY_STATUS_REFUSED = 2;

}
