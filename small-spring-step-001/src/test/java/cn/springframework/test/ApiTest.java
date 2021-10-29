package test.java.cn.springframework.test;

import org.junit.Test;

import main.java.cn.springframework.BeanDefinition;
import main.java.cn.springframework.BeanFactory;
import test.java.cn.springframework.test.bean.UserService;

public class ApiTest {
	@Test
	public void test_BeanFactory() {
		// ������ʼ��
		BeanFactory beanFactory = new BeanFactory();
		// ע��bean
		BeanDefinition beanDefinition = new BeanDefinition(new UserService());
		beanFactory.registerBeanDefinition("userService", beanDefinition);

		// ��ȡbean
		UserService userService = (UserService) beanFactory.getBean("userService");
		userService.queryUserInfo();
	}

}
