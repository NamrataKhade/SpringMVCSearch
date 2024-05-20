package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvcsearch.entites.Student;

@Controller
public class RegisterController {

	@RequestMapping("/complex")
	public String showForm() {
		return"register_complex_form";
	}

	@RequestMapping(path="/registerform", method=RequestMethod.POST)
/*	public String formRegister(@RequestParam("name") String name,@RequestParam("id") Long id)
	
	{
		System.out.println(name);
		System.out.println(id);
		return "success";
	}*/
	
  public String formRegister(@ModelAttribute("student") Student student,BindingResult result)
  {
		if(result.hasErrors()) {
			return "register_complex_form";
		}
		
		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";	
	}
}
