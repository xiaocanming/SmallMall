package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallFunction;
import com.xcm.smallmall.model.MallFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallFunctionMapper {
    long countByExample(MallFunctionExample example);

    int deleteByExample(MallFunctionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallFunction record);

    int insertSelective(MallFunction record);

    List<MallFunction> selectByExample(MallFunctionExample example);

    MallFunction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallFunction record, @Param("example") MallFunctionExample example);

    int updateByExample(@Param("record") MallFunction record, @Param("example") MallFunctionExample example);

    int updateByPrimaryKeySelective(MallFunction record);

    int updateByPrimaryKey(MallFunction record);
}