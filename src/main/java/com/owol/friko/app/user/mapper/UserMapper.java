package com.owol.friko.app.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.owol.friko.app.user.vo.User;


@Mapper
public interface UserMapper {
   
    User getUserByUserNo(@Param("userNo") String userNo);
}