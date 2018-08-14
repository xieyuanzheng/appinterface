package com.ufa.mall.mapper;

import com.ufa.mall.entity.Details;
import com.ufa.mall.entity.Tracking;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TrackingMapper {

    @Insert({"INSERT INTO tracking(id,number,date,feedbackman,feedbackdept,feedbacktype,item,module,description,reason,followman,followresult,chandaono,remark) " +
            "VALUES(#{id},#{number},#{date},#{feedbackman},#{feedbackdept},#{feedbacktype},#{item},#{module},#{description},#{reason},#{followman},#{followresult},#{chandaono},#{remark})"})
    int addTracking(Tracking tracking);

    @Select("SELECT * FROM tracking WHERE id=#{id} ")
    Tracking queryById(int id);

    @Select("SELECT * FROM tracking WHERE number=#{number} ")
    Tracking queryByNumber(int number);

    @Select("SELECT * FROM tracking WHERE feedbackman=#{feedbackman}")
    List<Tracking> queryByFeedbackman(String feedbackman);

    @Select("SELECT * FROM tracking WHERE feedbackman LIKE CONCAT(CONCAT('%', #{feedbackman}), '%')")
    List<Tracking> queryLikeFeedbackman(String feedbackman);

    @Select("SELECT * FROM tracking WHERE followman=#{followman} ")
    List<Tracking> queryByFollowman(String followman);

    @Select("SELECT * FROM tracking WHERE followresult=#{followresult} ")
    List<Tracking> queryByFollowresult(String followresult);

    @Select("SELECT * FROM tracking")
    List<Tracking> queryALl();

    @Delete("DELETE FROM tracking WHERE id = #{id}")
    int delById(int id);

    @Update("UPDATE tracking SET number=#{number},date=#{date} WHERE id = #{id}")
    int updateById(Tracking tracking);

}
