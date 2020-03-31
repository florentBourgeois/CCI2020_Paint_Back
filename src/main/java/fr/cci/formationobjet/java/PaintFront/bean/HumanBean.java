package fr.cci.formationobjet.java.PaintFront.bean;

import java.beans.Transient;



public class HumanBean {
	
	private Long ID;
	private String name;
	private int age;
	
	
	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}



	
	
	public HumanBean() {	}

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
	
	@Transient
	public String getTruc() {
		return "machin";
	}

	
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
