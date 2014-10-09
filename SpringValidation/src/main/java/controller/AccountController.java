package controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import entities.User;

@Controller
@RequestMapping(value = "/account")
public class AccountController {

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(ModelMap mm) {
		mm.addAttribute("acc", new User());
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@Valid @ModelAttribute(value = "acc")  User user,
			BindingResult bindingResult, 
			ModelMap mm) {
		AccountValidator accValidator = new AccountValidator();
		accValidator.validate(user, bindingResult);
		if (bindingResult.hasErrors()) {
			return "register";
		} else {
			mm.addAttribute("acc", user);
			return "result";
		}
	}

}
