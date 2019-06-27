package com.taowd.controller;

import com.taowd.base.RestResponseBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.taowd.service.IUsersService;
import org.springframework.web.bind.annotation.RestController;

/**
 * 前端控制器
 * @author Taoweidong
 * @since 2019-06-27
 */
@RestController
@RequestMapping("/users")
public class UsersController {

	/**
	 * ITestService.
	 */
	@Autowired
	private IUsersService iUsersService;

	/**
	 * 查询功能
	 * @return 查询结果
	 */
	@PostMapping("/query")
	public RestResponseBo<?> query() {

		return RestResponseBo.ok(iUsersService.list());
	}

}
