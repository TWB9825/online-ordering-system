package com.newer.pojo;

import java.util.Set;

public class Role {
	
	private int roleId;//角色id
	private String roleName;//角色名
	private Set<Module> module;//模块
	private Set<User> users;//用户
	//与用户多对一关联
	//与模块多对多关联
	public Role() {
		super();
	}

	public Role(String roleName, Set<Module> module, Set<User> users) {
		super();
		this.roleName = roleName;
		this.module = module;
		this.users = users;
	}

	public Role(int roleId, String roleName, Set<Module> module, Set<User> users) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.module = module;
		this.users = users;
	}



	public Role(int roleId) {
		super();
		this.roleId = roleId;
	}

	public int getRoleId() {
		return roleId;
	}


	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	
	public Set<Module> getModule() {
		return module;
	}

	public void setModule(Set<Module> module) {
		this.module = module;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	
	
	
	
	
}
