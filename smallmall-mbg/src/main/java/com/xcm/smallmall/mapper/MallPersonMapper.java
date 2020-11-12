package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallPerson;
import com.xcm.smallmall.model.MallPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallPersonMapper {
    long countByExample(MallPersonExample example);

    int deleteByExample(MallPersonExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallPerson record);

    int insertSelective(MallPerson record);

    List<MallPerson> selectByExample(MallPersonExample example);

    MallPerson selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallPerson record, @Param("example") MallPersonExample example);

    int updateByExample(@Param("record") MallPerson record, @Param("example") MallPersonExample example);

    int updateByPrimaryKeySelective(MallPerson record);

    int updateByPrimaryKey(MallPerson record);
}