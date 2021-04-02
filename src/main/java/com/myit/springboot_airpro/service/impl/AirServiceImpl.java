package com.myit.springboot_airpro.service.impl;

import com.myit.springboot_airpro.dao.AirMapper;
import com.myit.springboot_airpro.pojo.Air;
import com.myit.springboot_airpro.service.AirService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AirServiceImpl implements AirService {
    @Resource
    private AirMapper airMapper;
    @Override
    public List<Air> selectAll() {
        return airMapper.selectAir();
    }
}
