package in.vishwavijay.example.beanvalidation.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import in.vishwavijay.example.beanvalidation.validator.ValidEmployee;

@ValidEmployee
public class Employee {
	
	private String name;
	@Min(18) @Max(100)
	private int age;
	private String address1;
	private String address2;
	private String address3;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address1=" + address1 + ", address2=" + address2
				+ ", address3=" + address3 + "]";
	}
	
}
