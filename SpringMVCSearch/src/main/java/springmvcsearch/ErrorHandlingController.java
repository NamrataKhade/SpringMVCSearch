package springmvcsearch;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ErrorHandlingController {
	
	@RequestMapping("/error")
	public String viewError(){
		System.out.println("This is home view for error page...");
		
		String str=null;
		System.out.println("Length of string is :"+str.length());
		return "home";
	}
	
	@RequestMapping("/userex/{userId}/{userName}")
	public String pathVariableEx(@PathVariable("userId") int id,@PathVariable("userName") String name) {
		
		System.out.println("User id :"+id);
		System.out.println("UserName is: "+name);
		Integer.parseInt(name);
		return"fileform";
	}
	
	/*//Handling Exception in our  spring MVC 
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHanderNull(Model m) {
		
		m.addAttribute("msg","Null Pointer Exception has Occured....");
		return "null_error";
	}

	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)

	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionHanderNumberformat(Model m) {
		
		m.addAttribute("msg"," NumberFormatException has Occured....");
		return "null_error";
	}
	
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)

	@ExceptionHandler(value=Exception.class)
	public String exceptionHandlerAll(Model m) {
		m.addAttribute("msg"," Exception has Occured....");
		return "null_error";
	}*/
}
