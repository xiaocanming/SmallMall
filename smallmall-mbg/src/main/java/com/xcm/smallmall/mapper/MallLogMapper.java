package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallLog;
import com.xcm.smallmall.model.MallLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallLogMapper {
    long countByExample(MallLogExample example);

    int deleteByExample(MallLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallLog record);

    int insertSelective(MallLog record);

    List<MallLog> selectByExample(MallLogExample example);

    MallLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallLog record, @Param("example") MallLogExample example);

    int updateByExample(@Param("record") MallLog record, @Param("example") MallLogExample example);

    int updateByPrimaryKeySelective(MallLog record);

    int updateByPrimaryKey(MallLog record);
}