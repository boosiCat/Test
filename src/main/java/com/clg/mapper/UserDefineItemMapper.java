package com.clg.mapper;

import com.clg.entity.UserDefinedItem;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author cailiugen
 * @Date 2019/7/22
 */
public interface UserDefineItemMapper {

    @Select("select * from user_defined_item where id = #{id,jdbcType=VARCHAR}")
    UserDefinedItem selectById(String id);

    @Select("select * from ${table} where id = #{id,jdbcType=VARCHAR}")
    UserDefinedItem select(@Param("table") String table, @Param("id") String id);

    @Select("select * from user_defined_item where id = #{id,jdbcType=VARCHAR} and user_id = #{userId,jdbcType=VARCHAR}")
    UserDefinedItem selective(@Param("userId") String userId, @Param("id") String id);

}
