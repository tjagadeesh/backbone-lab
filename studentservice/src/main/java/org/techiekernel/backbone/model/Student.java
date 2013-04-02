package org.techiekernel.backbone.model;

import java.io.Serializable;

public class Student{
	private long id;
	private String rollNo;
	private String name;
	private String standard;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", rollNo=" + rollNo + ", name=" + name
				+ ", standard=" + standard + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			if (this.id == ((Student) obj).id)
				return true;
		}
		return false;

	}

}
