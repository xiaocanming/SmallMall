package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallDepotItem;
import com.xcm.smallmall.model.MallDepotItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallDepotItemMapper {
    long countByExample(MallDepotItemExample example);

    int deleteByExample(MallDepotItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallDepotItem record);

    int insertSelective(MallDepotItem record);

    List<MallDepotItem> selectByExample(MallDepotItemExample example);

    MallDepotItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallDepotItem record, @Param("example") MallDepotItemExample example);

    int updateByExample(@Param("record") MallDepotItem record, @Param("example") MallDepotItemExample example);

    int updateByPrimaryKeySelective(MallDepotItem record);

    int updateByPrimaryKey(MallDepotItem record);
}