package com.sekorm.smprog.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sekorm.smprog.model.OnCategory;
import com.sekorm.smprog.vo.OnCategoryVO;
import com.sekorm.smprog.vo.OnProgramSearchVO;

public interface OnCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OnCategory record);

    int insertSelective(OnCategory record);

    OnCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OnCategory record);

    int updateByPrimaryKey(OnCategory record);

    int getPageListCount(@Param("searchVO") OnProgramSearchVO searchVO);

    List<Map<String, Object>> getPageList(@Param("searchVO") OnProgramSearchVO searchVO);

    int getPendAddOnListCount(@Param("searchVO") OnProgramSearchVO searchVO);

    List<Map<String, Object>> getPendAddOnList(@Param("searchVO") OnProgramSearchVO searchVO);
    
    /**
     * @des 类别关联ON的个数
     * @author lanva_xu
     * @date 2019年1月19日
     * @param categoryId 类别ID
     * @return
     */
    Integer relateCateCount(@Param("categoryId") Integer categoryId);
    
    /**
     * @des 更新ecm审核结果
     * @author lanva_xu
     * @date 2019年1月21日
     * @param onCategoryVO
     * @return
     */
    Integer updateVerifyStatus(@Param("record") OnCategoryVO onCategoryVO);



    int updateTemplateCodeByOnId(@Param("templateCode") Integer templateCode,
                                 @Param("onId") Integer onId,
                                 @Param("categoryId") Integer categoryId);

    /**
     * 根据onId 查询
     * @param onId
     * @return
     */
    OnCategory getCategoryByOnId(@Param("onId") Integer onId, @Param("categoryId") Integer categoryId);
}