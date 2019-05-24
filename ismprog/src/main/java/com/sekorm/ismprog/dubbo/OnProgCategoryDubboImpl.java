package com.sekorm.ismprog.dubbo;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.sekorm.smprog.dao.OnCategoryMapper;
import com.sekorm.smprog.vo.OnCategoryVO;
import com.sekorm.spms.ismprog.dubbo.beans.OnProgCategoryDI;
import com.sekorm.spms.ismprog.dubbo.declare.OnProgCategoryDubbo;

@Service
public class OnProgCategoryDubboImpl implements OnProgCategoryDubbo {
	
	@Autowired
	private OnCategoryMapper onCategoryMapper;

	@Override
	public Integer relateCateCount(Integer categoryId) {
		return onCategoryMapper.relateCateCount(categoryId);
	}

	@Override
	public Integer updateEcmVerifyStatus(OnProgCategoryDI onCategoryDI) {
		
		if(onCategoryDI == null) {
			return null;
		}
		
		OnCategoryVO onCategoryVO = new OnCategoryVO();
		BeanUtils.copyProperties(onCategoryDI, onCategoryVO);
		
		return onCategoryMapper.updateVerifyStatus(onCategoryVO);
	}

}
