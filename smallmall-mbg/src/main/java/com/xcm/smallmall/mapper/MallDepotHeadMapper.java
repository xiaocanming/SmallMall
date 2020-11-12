package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallDepotHead;
import com.xcm.smallmall.model.MallDepotHeadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallDepotHeadMapper {
    long countByExample(MallDepotHeadExample example);

    int deleteByExample(MallDepotHeadExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallDepotHead record);

    int insertSelective(MallDepotHead record);

    List<MallDepotHead> selectByExample(MallDepotHeadExample example);

    MallDepotHead selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallDepotHead record, @Param("example") MallDepotHeadExample example);

    int updateByExample(@Param("record") MallDepotHead record, @Param("example") MallDepotHeadExample example);

    int updateByPrimaryKeySelective(MallDepotHead record);

    int updateByPrimaryKey(MallDepotHead record);
}