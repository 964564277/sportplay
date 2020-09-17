package com.deyunjiaoyu.sportplay.bean;
/*
用户实体
 */
public class User {
    private int id;
    private String username;//用户名
    private String password;//密码
    private String emali;//邮箱
    private String role;//角色
    private boolean state;//状态

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", emali='" + emali + '\'' +
                ", role='" + role + '\'' +
                ", state=" + state +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmali() {
        return emali;
    }

    public void setEmali(String emali) {
        this.emali = emali;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public User( String username, String password, String emali, String role, boolean state) {

        this.username = username;
        this.password = password;
        this.emali = emali;
        this.role = role;
        this.state = state;
    }
}
