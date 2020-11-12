package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallMaterialCurrentStock;
import com.xcm.smallmall.model.MallMaterialCurrentStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallMaterialCurrentStockMapper {
    long countByExample(MallMaterialCurrentStockExample example);

    int deleteByExample(MallMaterialCurrentStockExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallMaterialCurrentStock record);

    int insertSelective(MallMaterialCurrentStock record);

    List<MallMaterialCurrentStock> selectByExample(MallMaterialCurrentStockExample example);

    MallMaterialCurrentStock selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallMaterialCurrentStock record, @Param("example") MallMaterialCurrentStockExample example);

    int updateByExample(@Param("record") MallMaterialCurrentStock record, @Param("example") MallMaterialCurrentStockExample example);

    int updateByPrimaryKeySelective(MallMaterialCurrentStock record);

    int updateByPrimaryKey(MallMaterialCurrentStock record);
}