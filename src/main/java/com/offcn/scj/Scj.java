package com.offcn.scj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.mapper.ShiroUserMapper;
import com.offcn.pojo.ShiroUser;
import com.offcn.pojo.ShiroUserExample;
import com.offcn.pojo.ShiroUserExample.Criteria;

@Service
public class Scj {
	@Autowired
	ShiroUserMapper shiroUserMapper;

	public List<ShiroUser> findById() {
		ShiroUserExample example = new ShiroUserExample();
		Criteria createCriteria = example.createCriteria();
		Criteria andIdEqualTo = createCriteria.andIdEqualTo(1);
		List<ShiroUser> list = shiroUserMapper.selectByExample(example);
		return list;

	}
	//修改

	public void ssdddd() {
		System.out.println("ssdddd");
	}
	public void ss() {
		System.out.println("dddfgf");

	}
//adssd
}
