package com.sekorm.smprog.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sekorm.common.beans.DataReturn;
import com.sekorm.common.spms.beans.DataTableReturn;
import com.sekorm.common.spms.security.vo.UserLoginVO;
import com.sekorm.common.util.JacksonUtils;
import com.sekorm.dubbo.ecm.beans.ipn.OnCategoryDI;
import com.sekorm.dubbo.ecm.declare.ipn.OnCategoryDubbo;
import com.sekorm.dubbo.spms.beans.ioms.OnDetailDO;
import com.sekorm.dubbo.spms.declare.ioms.OnInfoDubbo;
import com.sekorm.smprog.common.Constants;
import com.sekorm.smprog.dao.OnCategoryMapper;
import com.sekorm.smprog.dao.ProgramElementMapper;
import com.sekorm.smprog.model.OnCategory;
import com.sekorm.smprog.model.ProgramElement;
import com.sekorm.smprog.vo.OnProgramSearchVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @author polite_lu
 * @aate 2019-01-18
 */
@Service
public class OnProgramService {


    private final Logger logger = LoggerFactory.getLogger(OnProgramService.class);

    @Reference(timeout = 1500)
    private OnInfoDubbo onInfoDubbo;

    @Reference
    private OnCategoryDubbo onCategoryDubbo;



    @Autowired
    private ProgramElementMapper programElementMapper;

    @Autowired
    private OnCategoryMapper onCategoryMapper;

    private ObjectMapper objectMapper = new ObjectMapper();


    /**
     * 分页查询待添加到PCB定制列表的ON
     *
     * @param searchVO
     * @param request
     * @return
     * @author polite_lu
     * @date 2019/1/18
     */
    public DataTableReturn getPendAddOnList(OnProgramSearchVO searchVO) {
        DataTableReturn dtr = new DataTableReturn();
       
        return dtr;
    }

    /**
     * 分页查询已添加到PCB定制列表的ON
     *
     * @param searchVO
     * @param request
     * @return
     * @author polite_lu
     * @date 2019/1/18
     */
    public DataTableReturn getPageList(OnProgramSearchVO searchVO) {
        DataTableReturn dtr = new DataTableReturn();
        
        return dtr;
    }


    /**
     * 编辑可编程参数
     *
     * @param templateCode 模板code
     * @param params
     * @param userLoginVO
     * @return
     * @author polite_lu
     * @date 2019/1/18
     */
    @Transactional
    public DataReturn editProgramTempLate(Integer templateCode, String params,Integer onId, UserLoginVO userLoginVO) {
      
        return new DataReturn();
    }

    /**
     * ON详情展示
     *
     * @return
     * @author polite_lu
     * @date 2019/1/18
     */
    public OnDetailDO getOnDetail(Integer onId, Integer spId) {
        return onInfoDubbo.getDetailByOnId(spId, onId);
    }


    /**
     * 某个可编程ON的可设置的模板参数详情
     *
     * @param onId
     * @return
     * @author polite_lu
     * @date 2019/2/15
     */
    public Map<String, Object> getProgramTempLate(Integer onId) {
        Map<String, Object> map = programElementMapper.getProgramElements(onId);
        return map;
    }

    /**
     * 添加PCB定制服务（添加到列表）
     *
     * @param onId
     * @param spId
     * @return
     * @author polite_lu
     * @date 2019/2/15
     */
    public DataReturn addToCategoryList(Integer onId, UserLoginVO userLoginVO) {
       
        return new DataReturn(Constants.API_STATUS_OK);
    }

    /**
     * 上架或下架
     * @author polite_lu
     * @date 2019/1/21
     * @param ocId on_category 表id
     * @param operateType 0 -下架 1-上架
     * @param userLoginVO
     * @return
     */
    public DataReturn editOperateType(Integer ocId, Integer operateType, UserLoginVO userLoginVO) {
       

        return new DataReturn(Constants.API_STATUS_OK);
    }

    /**
     * 单个提交审核
     * @author polite_lu
     * @date 2019/2/1
     * @param onCategory
     *
     */
    public void submitOnCategoryToEcm(OnCategory onCategory) {
        
    }


}
