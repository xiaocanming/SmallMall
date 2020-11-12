package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallOrganization;
import com.xcm.smallmall.model.MallOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallOrganizationMapper {
    long countByExample(MallOrganizationExample example);

    int deleteByExample(MallOrganizationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallOrganization record);

    int insertSelective(MallOrganization record);

    List<MallOrganization> selectByExample(MallOrganizationExample example);

    MallOrganization selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallOrganization record, @Param("example") MallOrganizationExample example);

    int updateByExample(@Param("record") MallOrganization record, @Param("example") MallOrganizationExample example);

    int updateByPrimaryKeySelective(MallOrganization record);

    int updateByPrimaryKey(MallOrganization record);
}