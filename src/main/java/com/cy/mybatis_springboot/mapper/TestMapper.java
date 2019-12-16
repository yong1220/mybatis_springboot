package com.cy.mybatis_springboot.mapper;

import com.cy.mybatis_springboot.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {

    @Select("SELECT * FROM account WHERE id = #{id}")
    Account selectAccountById(@Param("id") int id);
}
