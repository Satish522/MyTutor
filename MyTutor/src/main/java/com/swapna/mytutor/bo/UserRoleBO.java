package com.swapna.mytutor.bo;

public class UserRoleBO {
	
	private int roleId;
	private String roleName;
	private String privilege;
	
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
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	@Override
	public String toString() {
		return "UserRoleBO [roleId=" + roleId + ", roleName=" + roleName + ", privilege=" + privilege + "]";
	}
	
	
}
