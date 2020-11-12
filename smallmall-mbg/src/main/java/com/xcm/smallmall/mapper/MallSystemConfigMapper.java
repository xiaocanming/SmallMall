package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallSystemConfig;
import com.xcm.smallmall.model.MallSystemConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallSystemConfigMapper {
    long countByExample(MallSystemConfigExample example);

    int deleteByExample(MallSystemConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallSystemConfig record);

    int insertSelective(MallSystemConfig record);

    List<MallSystemConfig> selectByExample(MallSystemConfigExample example);

    MallSystemConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallSystemConfig record, @Param("example") MallSystemConfigExample example);

    int updateByExample(@Param("record") MallSystemConfig record, @Param("example") MallSystemConfigExample example);

    int updateByPrimaryKeySelective(MallSystemConfig record);

    int updateByPrimaryKey(MallSystemConfig record);
}