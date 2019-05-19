package com.waterpc.test.TestSpringMybatisJavaPCApp.service;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.waterpc.test.TestSpringMybatisJavaPCApp.dao.UsersInforEntityMapper;
import com.waterpc.test.TestSpringMybatisJavaPCApp.entity.UsersInforEntity;


@Service
public class UsersInforEntityService {
	
	//private final Logger logger = LoggerFactory.getLogger(UsersInforEntityService.class);
	
	@Autowired
	private UsersInforEntityMapper usersInforMapper;
	
	//@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,readOnly=false)
	public UsersInforEntity getOneUserInfor(Long id){
		
		return usersInforMapper.selectByPrimaryKey(id);
	}
	
}
