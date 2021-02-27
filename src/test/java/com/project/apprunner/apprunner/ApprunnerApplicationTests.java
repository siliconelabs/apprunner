package com.project.apprunner.apprunner;

import org.scope.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootTest
class ApprunnerApplicationTests {

	@Test
	void contextLoads() {
	}

	private static final String NAME = "veli";

	@Test
	public void givenSingletonScope_whenSetName_thenEqualNames() {
		ApplicationContext applicationContext = SpringApplication.run(ApprunnerApplication.class);

		Person personSingletonA=(Person)applicationContext.getBean("person");
		Person personSingletonB=(Person)applicationContext.getBean("person");

/*BinarySearchImpl binarySearch =
				applicationContext.getBean(BinarySearchImpl.class);
		int result =
				binarySearch.binarySearch( 3);
		System.out.println(result);*/


		personSingletonA.setName(NAME);

		personSingletonB.setName("muhammet");
		System.out.println(personSingletonA.getName());
		System.out.println(personSingletonB.getName());


		((AbstractApplicationContext) applicationContext).close();
	}

}
