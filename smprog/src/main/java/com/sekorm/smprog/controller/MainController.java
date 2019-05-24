package com.sekorm.smprog.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sekorm.common.spms.security.SecurityUtils;
import com.sekorm.common.spms.security.vo.UserLoginVO;

public class MainController {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    public final static String ADD = "添加失败，服务器异常";

    public final static String DEL = "删除失败，服务器异常";

    public final static String UPD = "修改失败，服务器异常";

    public final static String QUERY = "查询失败，服务器异常";

    public final static String SUCCESS = "SUCCESS";

    /**
     * @param
     * @return
     * @describe 异常错误消息
     * @author zhangq
     * @date 2014年6月30日
     */
    public void addError(String errMsg, Exception e, HttpServletRequest request) {
        e.printStackTrace();
        log.error(errMsg, e);
        request.setAttribute("err", errMsg);
    }

    /**
     * 当前已经登录的用户ID
     *
     * @return
     */
    public Integer getUserId() {
        UserLoginVO userLoginVO = getUserLoginVO();
        return userLoginVO.getId();
    }
    
    public Integer getSpId() {
        UserLoginVO userLoginVO = getUserLoginVO();
        return userLoginVO.getSpId();
    }

    public UserLoginVO getUserLoginVO() {
        UserLoginVO userLoginVO = (UserLoginVO) SecurityUtils.getSession().getAttribute("user");
        return userLoginVO;
    }

}
