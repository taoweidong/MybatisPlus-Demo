package com.taowd.module.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * </p>
 * @author Taoweidong
 * @since 2019-08-06
 */
@TableName("pms_user")
public class User extends Model<User> {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private String id;

	private String name;

	private String sex;

	private Integer age;

	public String getId() {

		return id;
	}

	public void setId(String id) {

		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getSex() {

		return sex;
	}

	public void setSex(String sex) {

		this.sex = sex;
	}

	public Integer getAge() {

		return age;
	}

	public void setAge(Integer age) {

		this.age = age;
	}

	@Override
	protected Serializable pkVal() {

		return this.id;
	}

	@Override
	public String toString() {

		return "User{" + "id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "}";
	}
}
