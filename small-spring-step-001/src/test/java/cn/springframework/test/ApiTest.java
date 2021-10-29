package test.java.cn.springframework.test;

import org.junit.Test;

import main.java.cn.springframework.BeanDefinition;
import main.java.cn.springframework.BeanFactory;
import test.java.cn.springframework.test.bean.UserService;

public class ApiTest {
	@Test
	public void test_BeanFactory() {
		// 工厂初始化
		BeanFactory beanFactory = new BeanFactory();
		// 注册bean
		BeanDefinition beanDefinition = new BeanDefinition(new UserService());
		beanFactory.registerBeanDefinition("userService", beanDefinition);

		// 获取bean
		UserService userService = (UserService) beanFactory.getBean("userService");
		userService.queryUserInfo();
	}

}
