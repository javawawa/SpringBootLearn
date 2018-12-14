package com.twosmall.mapper;

import com.twosmall.domain.LjCmsMotice;

public interface LjCmsMoticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LjCmsMotice record);

    int insertSelective(LjCmsMotice record);

    LjCmsMotice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LjCmsMotice record);

    int updateByPrimaryKeyWithBLOBs(LjCmsMotice record);

    int updateByPrimaryKey(LjCmsMotice record);
}