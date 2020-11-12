package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallUnit;
import com.xcm.smallmall.model.MallUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallUnitMapper {
    long countByExample(MallUnitExample example);

    int deleteByExample(MallUnitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallUnit record);

    int insertSelective(MallUnit record);

    List<MallUnit> selectByExample(MallUnitExample example);

    MallUnit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallUnit record, @Param("example") MallUnitExample example);

    int updateByExample(@Param("record") MallUnit record, @Param("example") MallUnitExample example);

    int updateByPrimaryKeySelective(MallUnit record);

    int updateByPrimaryKey(MallUnit record);
}