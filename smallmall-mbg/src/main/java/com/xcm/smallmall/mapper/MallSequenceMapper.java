package com.xcm.smallmall.mapper;

import com.xcm.smallmall.model.MallSequence;
import com.xcm.smallmall.model.MallSequenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallSequenceMapper {
    long countByExample(MallSequenceExample example);

    int deleteByExample(MallSequenceExample example);

    int deleteByPrimaryKey(String seqName);

    int insert(MallSequence record);

    int insertSelective(MallSequence record);

    List<MallSequence> selectByExample(MallSequenceExample example);

    MallSequence selectByPrimaryKey(String seqName);

    int updateByExampleSelective(@Param("record") MallSequence record, @Param("example") MallSequenceExample example);

    int updateByExample(@Param("record") MallSequence record, @Param("example") MallSequenceExample example);

    int updateByPrimaryKeySelective(MallSequence record);

    int updateByPrimaryKey(MallSequence record);
}