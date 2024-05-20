package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {
	
	
	@RequestMapping("/user/{userId}/{userName}")
	public String pathVariable(@PathVariable("userId") int id,@PathVariable("userName") String name) {
		
		System.out.println("User id :"+id);
		System.out.println("UserName is: "+name);
		//Integer.parseInt(name);
		return"fileform";
	}

}
