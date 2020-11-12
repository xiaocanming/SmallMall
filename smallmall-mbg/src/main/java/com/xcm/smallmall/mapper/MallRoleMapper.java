package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallRole;
import com.xcm.smallmall.model.MallRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallRoleMapper {
    long countByExample(MallRoleExample example);

    int deleteByExample(MallRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallRole record);

    int insertSelective(MallRole record);

    List<MallRole> selectByExample(MallRoleExample example);

    MallRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallRole record, @Param("example") MallRoleExample example);

    int updateByExample(@Param("record") MallRole record, @Param("example") MallRoleExample example);

    int updateByPrimaryKeySelective(MallRole record);

    int updateByPrimaryKey(MallRole record);
}