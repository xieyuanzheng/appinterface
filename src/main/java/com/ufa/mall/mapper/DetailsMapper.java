package com.ufa.mall.mapper;

import com.ufa.mall.entity.Details;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DetailsMapper {
    @Select("SELECT * FROM details WHERE id=#{id}")
    Details queryById(@Param("id") int id);

    @Select("SELECT * FROM details")
    List<Details> queryALl();

    @Insert({"INSERT INTO details(name,description) VALUES(#{name},#{description})"})
    int add(Details detailsd);

    @Delete("DELETE FROM details WHERE id = #{id}")
    int delById(int id);

    @Update("UPDATE details SET name=#{name},description=#{description} WHERE id = #{id}")
    int updateById(Details details);



}
