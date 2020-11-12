package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallUser;
import com.xcm.smallmall.model.MallUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallUserMapper {
    long countByExample(MallUserExample example);

    int deleteByExample(MallUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallUser record);

    int insertSelective(MallUser record);

    List<MallUser> selectByExample(MallUserExample example);

    MallUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallUser record, @Param("example") MallUserExample example);

    int updateByExample(@Param("record") MallUser record, @Param("example") MallUserExample example);

    int updateByPrimaryKeySelective(MallUser record);

    int updateByPrimaryKey(MallUser record);
}