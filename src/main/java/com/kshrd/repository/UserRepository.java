package com.kshrd.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.kshrd.model.User;

@Repository
public interface UserRepository {

	@Insert("insert into tbuser(id, name, gender) values(#{id}, #{name}, #{gender})")
	public boolean save(User user);
	
	@Select("select id, name, gender from tbuser where id=#{id}")
	public User findById(Integer id);
	
	@Select("select id, name, gender from tbuser")
	public List<User> findAll();
	
	@Delete("delete from tbuser where id=#{id}")
	public boolean removeById(Integer id);
	
	@Update("update tbuser set name=#{name}, gender=#{gender} where id=#{id}")
	public boolean update(User user);
}
