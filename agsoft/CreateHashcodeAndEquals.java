package com.agsoft;

import java.util.Date;

//how hashCode() and equals() methods work
public class CreateHashcodeAndEquals {
	private int id;
	private String name;
	private Date dob;

	public int hashcode() {
		// We are returning the CreateHashcodeAndEquals
		// as a hashcode value.
		// we can also return some
		// other calculated value or may
		// be memory address of the
		// Object on which it is invoked.
		// it depends on how you implement
		// hashCode() method.
		return this.id;
	}

	public boolean equals(Object obj) {
		// checking if both the object references are
		// referring to the same object.
		if (this == obj)
			return true;

		// it checks if the argument is of the
		// type CreateHashcodeAndEquals by comparing the classes
		// of the passed argument and this object.
		// if(!(obj instanceof CreateHashcodeAndEquals)) return false; ---> avoid.
		if (obj == null || obj.getClass() != this.getClass())
			return false;

		// type casting of the argument.
		CreateHashcodeAndEquals o = (CreateHashcodeAndEquals) obj;

		// comparing the state of argument with
		// the state of 'this' Object.
		return (o.name == this.name && o.id == this.id);
	}

}
