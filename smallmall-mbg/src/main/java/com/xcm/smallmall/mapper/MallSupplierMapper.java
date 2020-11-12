package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallSupplier;
import com.xcm.smallmall.model.MallSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallSupplierMapper {
    long countByExample(MallSupplierExample example);

    int deleteByExample(MallSupplierExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallSupplier record);

    int insertSelective(MallSupplier record);

    List<MallSupplier> selectByExample(MallSupplierExample example);

    MallSupplier selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallSupplier record, @Param("example") MallSupplierExample example);

    int updateByExample(@Param("record") MallSupplier record, @Param("example") MallSupplierExample example);

    int updateByPrimaryKeySelective(MallSupplier record);

    int updateByPrimaryKey(MallSupplier record);
}