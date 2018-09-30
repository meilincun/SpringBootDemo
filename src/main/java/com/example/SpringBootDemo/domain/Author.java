package com.example.SpringBootDemo.domain;
/**
 * 作者实体类
 * springboot数据存储
 * @author 杨云飞
 * @date 2018年9月30日
 */
public class Author {
	private Long id;
    private String realName;
    private String nickName;
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", realName=" + realName + ", nickName=" + nickName + "]";
	}
    
}
