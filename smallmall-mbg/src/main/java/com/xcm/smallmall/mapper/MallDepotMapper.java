package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallDepot;
import com.xcm.smallmall.model.MallDepotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallDepotMapper {
    long countByExample(MallDepotExample example);

    int deleteByExample(MallDepotExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallDepot record);

    int insertSelective(MallDepot record);

    List<MallDepot> selectByExample(MallDepotExample example);

    MallDepot selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallDepot record, @Param("example") MallDepotExample example);

    int updateByExample(@Param("record") MallDepot record, @Param("example") MallDepotExample example);

    int updateByPrimaryKeySelective(MallDepot record);

    int updateByPrimaryKey(MallDepot record);
}