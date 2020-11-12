package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallMaterialCategory;
import com.xcm.smallmall.model.MallMaterialCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallMaterialCategoryMapper {
    long countByExample(MallMaterialCategoryExample example);

    int deleteByExample(MallMaterialCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallMaterialCategory record);

    int insertSelective(MallMaterialCategory record);

    List<MallMaterialCategory> selectByExample(MallMaterialCategoryExample example);

    MallMaterialCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallMaterialCategory record, @Param("example") MallMaterialCategoryExample example);

    int updateByExample(@Param("record") MallMaterialCategory record, @Param("example") MallMaterialCategoryExample example);

    int updateByPrimaryKeySelective(MallMaterialCategory record);

    int updateByPrimaryKey(MallMaterialCategory record);
}