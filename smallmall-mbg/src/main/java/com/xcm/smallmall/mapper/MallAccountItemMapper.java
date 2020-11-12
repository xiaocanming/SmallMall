package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallAccountItem;
import com.xcm.smallmall.model.MallAccountItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallAccountItemMapper {
    long countByExample(MallAccountItemExample example);

    int deleteByExample(MallAccountItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallAccountItem record);

    int insertSelective(MallAccountItem record);

    List<MallAccountItem> selectByExample(MallAccountItemExample example);

    MallAccountItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallAccountItem record, @Param("example") MallAccountItemExample example);

    int updateByExample(@Param("record") MallAccountItem record, @Param("example") MallAccountItemExample example);

    int updateByPrimaryKeySelective(MallAccountItem record);

    int updateByPrimaryKey(MallAccountItem record);
}