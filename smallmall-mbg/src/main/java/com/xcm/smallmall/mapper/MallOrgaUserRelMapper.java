package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallOrgaUserRel;
import com.xcm.smallmall.model.MallOrgaUserRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallOrgaUserRelMapper {
    long countByExample(MallOrgaUserRelExample example);

    int deleteByExample(MallOrgaUserRelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallOrgaUserRel record);

    int insertSelective(MallOrgaUserRel record);

    List<MallOrgaUserRel> selectByExample(MallOrgaUserRelExample example);

    MallOrgaUserRel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallOrgaUserRel record, @Param("example") MallOrgaUserRelExample example);

    int updateByExample(@Param("record") MallOrgaUserRel record, @Param("example") MallOrgaUserRelExample example);

    int updateByPrimaryKeySelective(MallOrgaUserRel record);

    int updateByPrimaryKey(MallOrgaUserRel record);
}