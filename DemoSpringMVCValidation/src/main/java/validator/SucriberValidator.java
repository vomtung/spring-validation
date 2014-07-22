package validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import entity.Sucriber;

public class SucriberValidator implements Validator {
	
	public boolean supports(Class clazz) {
        return Sucriber.class.equals(clazz);
    }

    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "userName", "account.username.empty");
        ValidationUtils.rejectIfEmpty(e, "password", "account.password.empty");
        /*Person p = (Person) obj;
        if (p.getAge() < 0) {
            e.rejectValue("age", "negativevalue");
        } else if (p.getAge() > 110) {
            e.rejectValue("age", "too.darn.old");
        }*/
    }
}
