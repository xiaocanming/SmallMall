package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallSerialNumber;
import com.xcm.smallmall.model.MallSerialNumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallSerialNumberMapper {
    long countByExample(MallSerialNumberExample example);

    int deleteByExample(MallSerialNumberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallSerialNumber record);

    int insertSelective(MallSerialNumber record);

    List<MallSerialNumber> selectByExample(MallSerialNumberExample example);

    MallSerialNumber selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallSerialNumber record, @Param("example") MallSerialNumberExample example);

    int updateByExample(@Param("record") MallSerialNumber record, @Param("example") MallSerialNumberExample example);

    int updateByPrimaryKeySelective(MallSerialNumber record);

    int updateByPrimaryKey(MallSerialNumber record);
}