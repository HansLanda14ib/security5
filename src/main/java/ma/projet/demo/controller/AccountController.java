package ma.projet.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {

	@GetMapping("/myAccount")
	public ModelAndView getAccountDetails() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("myaccount");
		return modelAndView;
	}

}
