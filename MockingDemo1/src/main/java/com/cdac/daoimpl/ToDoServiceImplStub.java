package com.cdac.daoimpl;

import java.util.Arrays;
import java.util.List;

import com.cdac.dao.ToDoService;

public class ToDoServiceImplStub implements ToDoService {

	@Override
	public List<String> getToDos(String user) {
		
		List<String> lstToDos = 
				Arrays.asList("eat food at Kailas" ,"visit Sinhagad",
						"visit Prati Balaji");
		
		return lstToDos;
	}

}
