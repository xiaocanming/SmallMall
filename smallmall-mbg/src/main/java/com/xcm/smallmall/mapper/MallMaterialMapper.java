package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallMaterial;
import com.xcm.smallmall.model.MallMaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallMaterialMapper {
    long countByExample(MallMaterialExample example);

    int deleteByExample(MallMaterialExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallMaterial record);

    int insertSelective(MallMaterial record);

    List<MallMaterial> selectByExample(MallMaterialExample example);

    MallMaterial selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallMaterial record, @Param("example") MallMaterialExample example);

    int updateByExample(@Param("record") MallMaterial record, @Param("example") MallMaterialExample example);

    int updateByPrimaryKeySelective(MallMaterial record);

    int updateByPrimaryKey(MallMaterial record);
}