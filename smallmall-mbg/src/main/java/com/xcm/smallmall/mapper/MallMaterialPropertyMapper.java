package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallMaterialProperty;
import com.xcm.smallmall.model.MallMaterialPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallMaterialPropertyMapper {
    long countByExample(MallMaterialPropertyExample example);

    int deleteByExample(MallMaterialPropertyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallMaterialProperty record);

    int insertSelective(MallMaterialProperty record);

    List<MallMaterialProperty> selectByExample(MallMaterialPropertyExample example);

    MallMaterialProperty selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallMaterialProperty record, @Param("example") MallMaterialPropertyExample example);

    int updateByExample(@Param("record") MallMaterialProperty record, @Param("example") MallMaterialPropertyExample example);

    int updateByPrimaryKeySelective(MallMaterialProperty record);

    int updateByPrimaryKey(MallMaterialProperty record);
}