package com.sekorm.smprog.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sekorm.common.beans.DataReturn;
import com.sekorm.common.spms.beans.DataTableReturn;
import com.sekorm.common.util.BeanHelper;
import com.sekorm.dubbo.spms.beans.ioms.OnDetailDO;
import com.sekorm.smprog.common.Constants;
import com.sekorm.smprog.service.OnProgramService;
import com.sekorm.smprog.vo.OnProgramSearchVO;

/**
 * PROGRAM定制 Controller
 *
 * @author polite_lu
 * @date 2019-01-18
 *
 */
@Controller
@RequestMapping("/prog")
public class ProgController extends MainController {

    private final Logger logger = LoggerFactory.getLogger(ProgController.class);

    @Autowired
    private OnProgramService onProgramService;


    /**
     * 分页查询待添加到PROGRAM定制列表的ON
     * @author polite_lu
     * @date 2019/1/18
     * @param searchVO
     * @param request
     * @return
     */
    @RequestMapping(value = "/getPendAddOnList",method = {RequestMethod.POST})
    @ResponseBody
    public DataReturn getPendAddOnList(OnProgramSearchVO searchVO, HttpServletRequest request) {
        try {
            BeanHelper.beanAttributeValueTrim(searchVO);
        } catch (Exception e) {
            logger.error("去除前后空格异常",e);
        }
        if (searchVO.getiDisplayStart() == null) {
            searchVO.setiDisplayStart(0);
        }
        if (searchVO.getiDisplayLength() == null) {
            searchVO.setiDisplayLength(10);
        }
        Integer spId = getSpId();
        searchVO.setSpId(spId);
        searchVO.setCategoryId(Constants.CATEGORY_PROGRAM);
        DataTableReturn dtr = onProgramService.getPendAddOnList(searchVO);

        return DataReturn.newSuccessfull(dtr);
    }


    /**
     * 分页查询已添加到PROGRAM定制列表的ON
     * @author polite_lu
     * @date 2019/1/18
     * @param searchVO
     * @param request
     * @return
     */
    @RequestMapping(value = "/getPageList",method = {RequestMethod.POST})
    @ResponseBody
    public DataReturn getPageList(OnProgramSearchVO searchVO, HttpServletRequest request) {
        try {
            BeanHelper.beanAttributeValueTrim(searchVO);
        } catch (Exception e) {
            logger.error("去除前后空格异常",e);
        }
        if (searchVO.getiDisplayStart() == null) {
            searchVO.setiDisplayStart(0);
        }
        if (searchVO.getiDisplayLength() == null) {
            searchVO.setiDisplayLength(20);
        }
        Integer spId = getSpId();
        searchVO.setSpId(spId);
        searchVO.setCategoryId(Constants.CATEGORY_PROGRAM);
        DataTableReturn dtr = onProgramService.getPageList(searchVO);

        return DataReturn.newSuccessfull(dtr);
    }

    /**
     * 添加PROGRAM定制服务（添加到列表）
     * @author polite_lu
     * @date 2019/1/18
     * @param onId
     * @param request
     * @return
     */
    @RequestMapping(value = "/addToCategoryList",method = {RequestMethod.POST})
    @ResponseBody
    public DataReturn addToCategoryList(Integer onId, HttpServletRequest request) {
        DataReturn dataReturn = null;
        try {
            dataReturn = onProgramService.addToCategoryList(onId, getUserLoginVO());
        } catch (Exception e) {
            logger.error("添加PROGRAM定制服务失败",e);
            return new DataReturn(Constants.API_STATUS_FAIL);
        }
        return dataReturn;

    }


    /**
     * PROGRAM模板详情
     * @author polite_lu
     * @date 2019/1/18
     * @param id TempLate ID
     * @param request
     * @return
     */
    @RequestMapping(value = "/getProgramTempLate",method = {RequestMethod.POST})
    @ResponseBody
    public DataReturn getProgramTempLate(Integer onId, HttpServletRequest request) {
        Map<String, Object> programTempLate = onProgramService.getProgramTempLate(onId);

        return DataReturn.newSuccessfull(programTempLate);
    }

    /**
     * 编辑PROGRAM模板
     * @author polite_lu
     * @date 2019/1/18
     * @param request
     * @return
     */
    @RequestMapping(value = "/editProgramTempLate",method = {RequestMethod.POST})
    @ResponseBody
    public DataReturn editProgramTempLate(Integer templateCode,String params, Integer onId, HttpServletRequest request) {

         onProgramService.editProgramTempLate(templateCode,params,onId,getUserLoginVO());
        return DataReturn.newSuccessfull("成功");
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
    @RequestMapping(value = "/editOperateType",method = {RequestMethod.POST})
    @ResponseBody
    public DataReturn editOperateType(Integer ocId, Integer operateType,HttpServletRequest request) {

        onProgramService.editOperateType(ocId,operateType,getUserLoginVO());

        return DataReturn.newSuccessfull("成功");
    }

    /**
     * ON详情展示
     *
     * @return
     * @author polite_lu
     * @date 2018-06-28
     */
    @RequestMapping(value = {"/getOnDetail"},method = {RequestMethod.POST})
    @ResponseBody
    public DataReturn getDetailShow( Integer onId){
        DataReturn dataReturn = new DataReturn();
        OnDetailDO onDetailDO =  onProgramService.getOnDetail(onId,getSpId()); //只能查服务商自己的
        dataReturn.setCode(Constants.API_STATUS_OK);
        dataReturn.setData(onDetailDO);
        return dataReturn;

    }

}

