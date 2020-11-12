package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallAccount;
import com.xcm.smallmall.model.MallAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallAccountMapper {
    long countByExample(MallAccountExample example);

    int deleteByExample(MallAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallAccount record);

    int insertSelective(MallAccount record);

    List<MallAccount> selectByExample(MallAccountExample example);

    MallAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallAccount record, @Param("example") MallAccountExample example);

    int updateByExample(@Param("record") MallAccount record, @Param("example") MallAccountExample example);

    int updateByPrimaryKeySelective(MallAccount record);

    int updateByPrimaryKey(MallAccount record);
}