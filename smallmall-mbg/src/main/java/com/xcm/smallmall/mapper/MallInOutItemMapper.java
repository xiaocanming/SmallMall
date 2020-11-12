package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallInOutItem;
import com.xcm.smallmall.model.MallInOutItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallInOutItemMapper {
    long countByExample(MallInOutItemExample example);

    int deleteByExample(MallInOutItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallInOutItem record);

    int insertSelective(MallInOutItem record);

    List<MallInOutItem> selectByExample(MallInOutItemExample example);

    MallInOutItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallInOutItem record, @Param("example") MallInOutItemExample example);

    int updateByExample(@Param("record") MallInOutItem record, @Param("example") MallInOutItemExample example);

    int updateByPrimaryKeySelective(MallInOutItem record);

    int updateByPrimaryKey(MallInOutItem record);
}