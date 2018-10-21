package in.vishwavijay.example.beanvalidation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import in.vishwavijay.example.beanvalidation.pojo.Employee;

public class ValidEmployeeValidator implements ConstraintValidator<ValidEmployee, Employee> {

	@Override
	public boolean isValid(Employee employee, ConstraintValidatorContext context) {
		return !(employee.getAddress1().isEmpty() && employee.getAddress2().isEmpty() && employee.getAddress3().isEmpty());
	}

}
