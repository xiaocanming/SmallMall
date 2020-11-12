package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallPlatformConfig;
import com.xcm.smallmall.model.MallPlatformConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallPlatformConfigMapper {
    long countByExample(MallPlatformConfigExample example);

    int deleteByExample(MallPlatformConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallPlatformConfig record);

    int insertSelective(MallPlatformConfig record);

    List<MallPlatformConfig> selectByExample(MallPlatformConfigExample example);

    MallPlatformConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallPlatformConfig record, @Param("example") MallPlatformConfigExample example);

    int updateByExample(@Param("record") MallPlatformConfig record, @Param("example") MallPlatformConfigExample example);

    int updateByPrimaryKeySelective(MallPlatformConfig record);

    int updateByPrimaryKey(MallPlatformConfig record);
}