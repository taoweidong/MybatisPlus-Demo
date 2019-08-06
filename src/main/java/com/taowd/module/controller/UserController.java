package com.taowd.module.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;
import com.taowd.base.RestResponseBo;
import com.taowd.module.entity.User;
import com.taowd.module.service.IUserService;

/**
 * 前端控制器
 * @author Taoweidong
 * @since 2019-08-06
 */
@RestController
@RequestMapping("/user")
public class UserController {

	private static Faker FAKER = new Faker(Locale.CHINA);

	/**
	 * ITestService.
	 */
	@Autowired
	private IUserService iUserService;

	/**
	 * 查询功能
	 * @return 查询结果
	 */
	@PostMapping("/query")
	public RestResponseBo<?> query() {

		List<User> list = iUserService.list();
		list.forEach(x -> {
			x.setName(FAKER.name().fullName());
			x.setAge(FAKER.number().numberBetween(10, 70));
		});

		iUserService.updateBatchById(list);

		return RestResponseBo.ok(iUserService.list());
	}

}
