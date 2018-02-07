package com.taotao.sso.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.mapper.TbUserMapper;
import com.taotao.pojo.TbUserExample;
import com.taotao.pojo.TbUserExample.Criteria;
import com.taotao.sso.service.UserService;
/**
 * 用户管理Service
 * @Title: UserServiceImpl.java
 * @Package: com.taotao.sso.service.impl
 * @Description: TODO
 * @author: Gqijian
 * @date: 2018年2月7日 下午3:51:23
 * @version: V1.0
 */
public class UserServiceImpl implements UserService {

	@Autowired
	private TbUserMapper userMapper;
	
	@Override
	public TaotaoResult checkData(String content, Integer type) {
		//创建查询条件
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		//对数据进行校验：1、2、3 分贝代表username phone email

		//用户名校验
		if(1 == type){
			criteria.andUsernameEqualTo(content);
			//电话校验
		}else if (2 == type) {
			
		}
		return null;
	}

}
