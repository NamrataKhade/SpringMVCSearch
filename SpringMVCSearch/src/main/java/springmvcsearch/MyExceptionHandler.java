package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

	// Handling Exception in our spring MVC
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHanderNull(Model m) {

		m.addAttribute("msg", "Null Pointer Exception has Occured....");
		return "null_error";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)

	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHanderNumberformat(Model m) {

		m.addAttribute("msg", " NumberFormatException has Occured....");
		return "null_error";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)

	@ExceptionHandler(value = Exception.class)
	public String exceptionHandlerAll(Model m) {
		m.addAttribute("msg", " Exception has Occured....");
		return "null_error";
	}
}
