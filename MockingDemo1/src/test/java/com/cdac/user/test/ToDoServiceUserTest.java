package com.cdac.user.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.cdac.dao.ToDoService;
import com.cdac.daoimpl.ToDoServiceImplStub;
import com.cdac.user.ToDoServiceUser;

public class ToDoServiceUserTest {

	private ToDoService daoimpl = new ToDoServiceImplStub();
	
	private ToDoServiceUser serviceUser = new ToDoServiceUser(daoimpl);
	
	@Test
	public void getToDosRelatedToFoodTest() {
		
		List<String> lst = serviceUser.getToDosRelatedToFood("dummy");
		
		assertEquals(1,lst.size());
	}
}







