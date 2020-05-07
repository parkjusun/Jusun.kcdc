package com.occamsrazor.web.admin;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AdminDao {

	public void insert(Admin admin);

	public List<Admin> selectAll();

	public Admin selectOne(String employNumber);

	public void update(Admin admin);

	public void delet(Admin admin);

}
