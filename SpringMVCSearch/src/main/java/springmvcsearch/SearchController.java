package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String viewHome(){
		System.out.println("This is home view...");
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		System.out.println("Redirect page loaded!!!!!!");
		RedirectView redirectView = new RedirectView();
		String url="https://www.google.com/search?q=" + query;
		redirectView.setUrl(url);
		return redirectView;
	}
}
