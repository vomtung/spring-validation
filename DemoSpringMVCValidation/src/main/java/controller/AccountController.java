package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="account",method=RequestMethod.GET)
public class AccountController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String index(){
		return "index";
	}
	
	
}
