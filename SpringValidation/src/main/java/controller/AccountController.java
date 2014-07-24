package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import entities.Account;

@Controller
@RequestMapping(value = "/account")
public class AccountController {

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(ModelMap mm) {
		mm.addAttribute("acc", new Account());
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(
			@ModelAttribute(value = "acc") Account acc,
			BindingResult bindingResult, 
			ModelMap mm) {
		AccountValidator accValidator = new AccountValidator();
		accValidator.validate(acc, bindingResult);
		if (bindingResult.hasErrors()) {
			return "register";
		} else {
			mm.addAttribute("acc", acc);
			return "result";
		}
	}

}
