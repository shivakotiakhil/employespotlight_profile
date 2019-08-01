package rythmos.a.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rythmos.a.Main;

@RestController
public class EmployeMain {

	@RequestMapping("/main")
	public List<Main> id() {

		List<Main> mainList = new ArrayList<>();
		Main main = new Main("1", "test", "trsha@akjhga.com");
		mainList.add(main);
		return mainList;

	}
}