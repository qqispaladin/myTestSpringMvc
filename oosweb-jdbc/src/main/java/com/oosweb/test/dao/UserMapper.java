package com.oosweb.test.dao;

import org.apache.ibatis.annotations.Insert;

public interface UserMapper {
	
	@Insert("insert into beauty.roles(role_id,role_code,role_name)values('4','4','3')")
	public void save(); 
}
