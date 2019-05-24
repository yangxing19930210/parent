package com.sekorm.spms.ismprog.dubbo.declare;

import com.sekorm.spms.ismprog.dubbo.beans.OnProgCategoryDI;

public interface OnProgCategoryDubbo {

	/**
	 * @des 查询类别是否关联了ON
	 * @author lanva_xu
	 * @date 2019年1月19日
	 * @param categoryId 类别ID
	 * @return
	 */
	Integer relateCateCount(Integer categoryId);
	
	/**
	 * @des 更新电商平台的审核结果
	 * @author lanva_xu
	 * @date 2019年1月21日
	 * @return
	 */
	Integer updateEcmVerifyStatus(OnProgCategoryDI onCategoryDI);
}
