package rythmos.a.employeeSearch;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeSearch {
	@RequestMapping("/search")
	public ResponseEntity<String> id() {
return new ResponseEntity<String>("employeesearch",HttpStatus.OK);
}
}
