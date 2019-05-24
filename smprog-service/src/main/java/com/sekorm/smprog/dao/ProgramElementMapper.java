package com.sekorm.smprog.dao;

import com.sekorm.smprog.model.ProgramElement;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ProgramElementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProgramElement record);

    int insertSelective(ProgramElement record);

    ProgramElement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProgramElement record);

    int updateByPrimaryKeyWithBLOBs(ProgramElement record);

    int updateByPrimaryKey(ProgramElement record);

    int deleteByOnId(@Param("onId") Integer onId);

    Map<String, Object> getProgramElements(@Param("onId") Integer onId);
}