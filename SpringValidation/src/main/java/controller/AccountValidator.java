package controller;

import java.util.regex.Pattern;

import org.springframework.validation.*;
import org.springframework.validation.annotation.*;

import entities.*;

public class AccountValidator implements Validator {

	public boolean supports(Class<?> arg0) {
		return User.class.equals(arg0);
	}

	public void validate(Object obj, Errors error) {

		ValidationUtils.rejectIfEmpty(error, "username", "username.required");
		User acc = (User) obj;
		if (error.hasFieldErrors("age"))
			error.rejectValue("age", "age.valid");
		if (acc.getAge() > 120 || acc.getAge() < 1)
			error.rejectValue("age", "age.invalid");
		if (!EmailValidate(acc.getEmail()))
			error.rejectValue("email", "email.invalid");
	}

	private boolean EmailValidate(String hex) {
		Pattern pattern = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		return pattern.matcher(hex).matches();
	}

}
