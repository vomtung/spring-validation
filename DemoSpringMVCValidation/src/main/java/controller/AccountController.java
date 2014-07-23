package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import validator.SucriberValidator;

import javax.validation.Valid;

import entity.Sucriber;

@Controller
@RequestMapping(value = "/account")
public class AccountController {

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showForm(Map<String, Object> mm) {
		mm.put("subcriber", new Sucriber());
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute("subcriber") Sucriber sucriber,BindingResult result,Map<String, Object> mm) {

		SucriberValidator sucriberValidator = new SucriberValidator();
		sucriberValidator.validate(sucriber, result);

		if (result.hasErrors()) {
			return "register";
		} else {
			return "success";
		}
	}
}
