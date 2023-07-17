package com.tc.HAY0001.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tc.HAY0001.entity.User;

@Service
public interface UserService {

	/**
	 * 查询所有用户信息
	 * 
	 * @return
	 */
	public List<User> listUser();

	/**
	 * 根据用户id查询用户信息
	 * 
	 * @param userId
	 * @return 返回User实体信息
	 */
	public User queryByUserId(Integer userId);

	/**
	 * 新增用户信息
	 * 
	 * @param user
	 * @return
	 */
	public Integer insertUser(User user);

	/**
	 * 修改用户信息
	 * 
	 * @param user
	 * @return
	 */
	public Integer updateUser(User user);

	/**
	 * 根据用户id删除用户信息
	 * 
	 * @param userId
	 * @return
	 */
	public Integer delete(Integer userId);

}
