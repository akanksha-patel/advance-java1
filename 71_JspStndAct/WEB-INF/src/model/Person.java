package model;

public class Person {
	private String name;
	private int age;

	//It is required when you use jspUseBean tag
	public Person(){
	
	}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}

	//it is required when you use jsp:getProperty tag
	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;	
	}
}
