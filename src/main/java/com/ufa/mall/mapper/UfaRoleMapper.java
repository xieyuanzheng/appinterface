package com.ufa.mall.mapper;

import com.ufa.mall.entity.UfaRole;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UfaRoleMapper {
    @Select("SELECT * FROM ufa_role WHERE id = #{id}")
    UfaRole queryById(int id);

    @Select("SELECT * FROM ufa_role ")
    List<UfaRole> queryALl();

    @Delete("DELETE FROM ufa_role WHERE id = #{id}")
    int delById(int id);

    @Update("UPDATE ufa_role SET name=#{name} WHERE id = #{id}")
    int updateById(UfaRole ufaRole);

    @Insert({"INSERT INTO ufa_role(id,name) " +
            "VALUES(#{id},#{name}"})
    int addUfaRole(UfaRole ufaRole);
}
