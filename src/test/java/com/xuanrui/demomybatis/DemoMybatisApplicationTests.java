package com.xuanrui.demomybatis;

import com.xuanrui.demomybatis.model.Role;
import com.xuanrui.demomybatis.model.User;
import com.xuanrui.demomybatis.service.RoleService;
import com.xuanrui.demomybatis.service.UserService;
import com.xuanrui.demomybatis.vo.UserLinkRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoMybatisApplicationTests {


	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@Test
	public void contextLoads() {
		User userById = userService.findUserById(6);
		userById.setCity("广州");
		userService.updateUser(userById);
//		userService.insertUser(userById);
//		List<User> allUser = userService.findAllUser();
//		for (User u : allUser){
//			System.out.println(u.toString());
//		}
		System.out.println("-------");
	}

	@Test
	public void role(){
		Role role = roleService.findRole(1);
		System.out.println(role);

//		Role role = roleService.selectUserById(1001);
//		role.setRolename("主管");
//		roleService.insertRole(role);
		System.out.println(role.toString());
	}

	@Test
	public void login(){
		String name = "maliu";
		String password = "123456";
		User user = userService.loginUser(name, password);
		if (user == null){
			System.out.println("无");
		}
		System.out.println("有");
	}


	@Test
	public void userRole(){
		String name = "maliu";
		String rolename = "设计师管理";
		UserLinkRole userLinkRole = roleService.selectUserRole(name, rolename);
		if (userLinkRole == null){
			System.out.println("空");
		}
		System.out.println("---------");

	}

	@Test
	public void test1(){
		String str = 'a' + " world!" + 3;
		System.out.println(str);
	}
}
