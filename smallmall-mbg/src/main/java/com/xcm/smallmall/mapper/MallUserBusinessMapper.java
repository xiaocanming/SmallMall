package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallUserBusiness;
import com.xcm.smallmall.model.MallUserBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallUserBusinessMapper {
    long countByExample(MallUserBusinessExample example);

    int deleteByExample(MallUserBusinessExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallUserBusiness record);

    int insertSelective(MallUserBusiness record);

    List<MallUserBusiness> selectByExample(MallUserBusinessExample example);

    MallUserBusiness selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallUserBusiness record, @Param("example") MallUserBusinessExample example);

    int updateByExample(@Param("record") MallUserBusiness record, @Param("example") MallUserBusinessExample example);

    int updateByPrimaryKeySelective(MallUserBusiness record);

    int updateByPrimaryKey(MallUserBusiness record);
}