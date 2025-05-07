package com.powernode;

import com.powernode.bean.Car;
import com.powernode.mapper.CarMapper;
import com.powernode.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MapperTest {
    @Test
    public void mapperTest001() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //Car car1 = new Car(5L, "10005", "问界M8", 500000.0, "2025-01-01", "新能源");
        // mapper实际上是daoImpl对象
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        List<Car> cars = mapper.selectByCarType("新能源");

        cars.forEach(System.out::println);
    }
}
