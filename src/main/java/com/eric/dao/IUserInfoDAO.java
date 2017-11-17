package com.eric.dao;
import com.eric.entity.UserInfo;
public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);
}