package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallTenant;
import com.xcm.smallmall.model.MallTenantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallTenantMapper {
    long countByExample(MallTenantExample example);

    int deleteByExample(MallTenantExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallTenant record);

    int insertSelective(MallTenant record);

    List<MallTenant> selectByExample(MallTenantExample example);

    MallTenant selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallTenant record, @Param("example") MallTenantExample example);

    int updateByExample(@Param("record") MallTenant record, @Param("example") MallTenantExample example);

    int updateByPrimaryKeySelective(MallTenant record);

    int updateByPrimaryKey(MallTenant record);
}