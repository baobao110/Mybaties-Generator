package com.mapper;

import com.domain.commodity;
import com.domain.commodityWithBLOBs;

public interface commodityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(commodityWithBLOBs record);

    int insertSelective(commodityWithBLOBs record);

    commodityWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(commodityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(commodityWithBLOBs record);

    int updateByPrimaryKey(commodity record);
}