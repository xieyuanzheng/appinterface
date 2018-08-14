package com.ufa.mall.mapper;

import com.ufa.mall.entity.UfaUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UfaUserMapper {

    @Select("SELECT * FROM ufa_user WHERE id = #{id}")
    UfaUser queryById(int id);

    @Select("SELECT * FROM ufa_user ")
    List<UfaUser> queryALl();

    @Select("SELECT telephone FROM ufa_user WHERE name=#{name}")
    String queryTele(String name);

    @Delete("DELETE FROM ufa_user WHERE id = #{id}")
    int delById(int id);

    @Update("UPDATE ufa_user SET name=#{name},telephone=#{telephone},number=#{number},deptid=#{deptid},roleid=#{roleid} WHERE id = #{id}")
    int updateById(UfaUser ufaUser);

    @Insert({"INSERT INTO ufa_user(id,name,telephone,number,deptid,roleid) " +
            "VALUES(#{id},#{name},#{telephone},#{number},#{deptid},#{roleid})"})
    int addUfaUser(UfaUser ufaUser);
}
