package com.myit.springboot_airpro.dao;

import com.myit.springboot_airpro.pojo.Air;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AirMapper {
    @Select("select * from air_quality_index order by monitorTime desc")
    public List<Air> selectAir();
    @Select("select * from air_quality_index where district=#{district} order by monitorTime desc")
    public List<Air> selectList(@Param("district") String district);
}
