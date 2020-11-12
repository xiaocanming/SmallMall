package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallMaterialInitialStock;
import com.xcm.smallmall.model.MallMaterialInitialStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallMaterialInitialStockMapper {
    long countByExample(MallMaterialInitialStockExample example);

    int deleteByExample(MallMaterialInitialStockExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallMaterialInitialStock record);

    int insertSelective(MallMaterialInitialStock record);

    List<MallMaterialInitialStock> selectByExample(MallMaterialInitialStockExample example);

    MallMaterialInitialStock selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallMaterialInitialStock record, @Param("example") MallMaterialInitialStockExample example);

    int updateByExample(@Param("record") MallMaterialInitialStock record, @Param("example") MallMaterialInitialStockExample example);

    int updateByPrimaryKeySelective(MallMaterialInitialStock record);

    int updateByPrimaryKey(MallMaterialInitialStock record);
}