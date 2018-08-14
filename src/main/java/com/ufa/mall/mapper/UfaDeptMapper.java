package com.ufa.mall.mapper;
import com.ufa.mall.entity.UfaDept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UfaDeptMapper {
    @Select("SELECT * FROM ufa_dept WHERE id = #{id}")
    UfaDept queryById(int id);

    @Select("SELECT * FROM ufa_dept ")
    List<UfaDept> queryALl();

    @Delete("DELETE FROM ufa_dept WHERE id = #{id}")
    int delById(int id);

    @Update("UPDATE ufa_dept SET name=#{name} WHERE id = #{id}")
    int updateById(UfaDept ufaDept);

    @Insert({"INSERT INTO ufa_dept(id,name) " +
            "VALUES(#{id},#{name}"})
    int addUfaDept(UfaDept ufaDept);
}
