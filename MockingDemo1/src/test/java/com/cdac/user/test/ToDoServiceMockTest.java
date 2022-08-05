package com.cdac.user.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.cdac.dao.ToDoService;
import com.cdac.user.ToDoServiceUser;

public class ToDoServiceMockTest {

	@Test
	public void test1() {
		ToDoService toDoServiceMockObj = mock(ToDoService.class);
		
		List<String> lstToDos = 
				Arrays.asList("eat food at Kailas" ,"visit Sinhagad",
						"visit Prati Balaji" , 
						"eat food at Shivneri Misal House");
		
		when(toDoServiceMockObj.getToDos("dummy")).thenReturn(lstToDos);
		
		ToDoServiceUser serviceUser = 
							new ToDoServiceUser(toDoServiceMockObj);
		
		List<String> lst = serviceUser.getToDosRelatedToFood("dummy");
				
		assertEquals(2, lst.size());
	}
}









