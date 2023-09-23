package com.miracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle.dto.UserDto;
import com.miracle.mapper.UserMapper;

@Service
public class UserService implements com.miracle.frame.Service<String, UserDto> {
	@Autowired
	UserMapper mapper;
	
	public void register(UserDto v) throws Exception {
		mapper.insert(v);
	}
	public void remove(String k) throws Exception {
		mapper.delete(k);
	}
	public void modify(UserDto v) throws Exception {
		mapper.update(v);
	}
	public UserDto choice(String k) throws Exception {
		return mapper.select(k);
	}
	public List<UserDto> choiceall() throws Exception {
		return mapper.selectall();
	}
}
