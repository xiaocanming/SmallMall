package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallAccountHead;
import com.xcm.smallmall.model.MallAccountHeadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallAccountHeadMapper {
    long countByExample(MallAccountHeadExample example);

    int deleteByExample(MallAccountHeadExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallAccountHead record);

    int insertSelective(MallAccountHead record);

    List<MallAccountHead> selectByExample(MallAccountHeadExample example);

    MallAccountHead selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallAccountHead record, @Param("example") MallAccountHeadExample example);

    int updateByExample(@Param("record") MallAccountHead record, @Param("example") MallAccountHeadExample example);

    int updateByPrimaryKeySelective(MallAccountHead record);

    int updateByPrimaryKey(MallAccountHead record);
}