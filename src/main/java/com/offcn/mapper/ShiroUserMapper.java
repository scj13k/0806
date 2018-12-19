package com.offcn.mapper;

import com.offcn.pojo.ShiroUser;
import com.offcn.pojo.ShiroUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShiroUserMapper {
    int countByExample(ShiroUserExample example);

    int deleteByExample(ShiroUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShiroUser record);

    int insertSelective(ShiroUser record);

    List<ShiroUser> selectByExample(ShiroUserExample example);

    ShiroUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShiroUser record, @Param("example") ShiroUserExample example);

    int updateByExample(@Param("record") ShiroUser record, @Param("example") ShiroUserExample example);

    int updateByPrimaryKeySelective(ShiroUser record);

    int updateByPrimaryKey(ShiroUser record);
}