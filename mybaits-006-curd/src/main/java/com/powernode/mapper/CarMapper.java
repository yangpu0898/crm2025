package com.powernode.mapper;

import com.powernode.bean.Car;

import java.util.List;

public interface CarMapper {
    List<Car> selectByCarType(String carType);
}
