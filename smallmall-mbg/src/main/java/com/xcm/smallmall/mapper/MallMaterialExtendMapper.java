package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallMaterialExtend;
import com.xcm.smallmall.model.MallMaterialExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallMaterialExtendMapper {
    long countByExample(MallMaterialExtendExample example);

    int deleteByExample(MallMaterialExtendExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallMaterialExtend record);

    int insertSelective(MallMaterialExtend record);

    List<MallMaterialExtend> selectByExample(MallMaterialExtendExample example);

    MallMaterialExtend selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallMaterialExtend record, @Param("example") MallMaterialExtendExample example);

    int updateByExample(@Param("record") MallMaterialExtend record, @Param("example") MallMaterialExtendExample example);

    int updateByPrimaryKeySelective(MallMaterialExtend record);

    int updateByPrimaryKey(MallMaterialExtend record);
}