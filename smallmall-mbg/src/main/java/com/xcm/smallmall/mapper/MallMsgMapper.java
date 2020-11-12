package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallMsg;
import com.xcm.smallmall.model.MallMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallMsgMapper {
    long countByExample(MallMsgExample example);

    int deleteByExample(MallMsgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallMsg record);

    int insertSelective(MallMsg record);

    List<MallMsg> selectByExample(MallMsgExample example);

    MallMsg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallMsg record, @Param("example") MallMsgExample example);

    int updateByExample(@Param("record") MallMsg record, @Param("example") MallMsgExample example);

    int updateByPrimaryKeySelective(MallMsg record);

    int updateByPrimaryKey(MallMsg record);
}