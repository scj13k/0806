package com.offcn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.mapper.ShiroUserMapper;
import com.offcn.pojo.ShiroUser;
import com.offcn.pojo.ShiroUserExample;
import com.offcn.service.ShiroUserService;

@Service
public class ShiroUserServiceImpl implements ShiroUserService{

	@Autowired
	private ShiroUserMapper mapper;
	
	public List<ShiroUser> findAllUser() {
		ShiroUserExample example = new ShiroUserExample();
		List<ShiroUser> list = mapper.selectByExample(example);
		return list;
	}

}












