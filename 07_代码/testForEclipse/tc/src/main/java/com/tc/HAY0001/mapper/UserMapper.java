package com.tc.HAY0001.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.tc.HAY0001.entity.User;

@Repository
@Mapper
public interface UserMapper {

	/**
	 * 查询全部用户
	 * 
	 * @return
	 */
	public List<User> listUser();

	/**
	 * 新增用户信息
	 * 
	 * @param user 用户信息
	 * @return 返回主键id
	 */
	public Integer insertUser(User user);

	/**
	 * 根据主键userId查询对象
	 * 
	 * @param userId 用户id
	 * @return 用户信息
	 */
	public User queryByUserId(@Param("userId") Integer userId);

	/**
	 * 修改用户信息
	 * 
	 * @param user
	 * @return
	 */
	public Integer updateUser(User user);

	/**
	 * 根据用户id删除用户
	 * 
	 * @param userId
	 * @return 返回 受影响的行
	 */
	public Integer delete(@Param("userId") Integer userId);

}
