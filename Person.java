
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;


public class Person{
	//Editted by Chit Hang Kwok
	// This program is to define the Person Class and inherit to all subclass. Name in this cases is the primary key for Relation.
	public class NoSuchAgeException extends Exception{}
	
	static ArrayList<Person> profile = new ArrayList<Person>();
	int Age;
	String Name;
	Image File;
	String Gender;
	String Status;
	String State;
	
	
	public Person(String Name, String Status, String Gender, int Age, String State) {
		
		this.Age = Age;
		this.Name = Name;
		//this.file = file;
		this.Gender = Gender;
		this.Status = Status;
		this.State = State;
	}	
	
	
	
	
	
	public int getAge() {
		return Age;
	}
	public void setAge(int Age) {
		this.Age = Age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public Image getFile() {
		return File;
	}
	public void setFile(Image file) {
		this.File = File;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		this.Status = Status;
	}
	public String getState() {
		return State;
	}
	public void setState(String State) {
		this.State = State;
	}
	

	// This method is to identify the relationship of Person. If they are 0 - 2 years Old They are YoungChild. For 
	// 3-16 years old they are Child. And 16-149 years old they are Adult. Age below zero or more than 150 consider to be 
	// a monster. So Throws An Exception.
	public void personidentification() {
		
		
		
		
		
		
		if (Age >= 0 && Age <=2) {
			YoungChild y = new YoungChild(Name, Status, Gender, Age, State);
			System.out.println("You have added this person as YoungChild");
				
			y.setAge(Age);
		//	y.setFile(file);
			y.setName(Name);
			y.setGender(Gender);
			y.setStatus(Status);
			y.setState(State);
			
			profile.add(y);
				
		}
		
		else if (Age <= 16 && Age > 2) {
			Child c = new Child(Name, Status, Gender, Age, State);
			System.out.println("You have added this person as Child");
				
			c.setAge(Age);
		//	c.setFile(file);
			c.setName(Name);
			c.setGender(Gender);
			c.setStatus(Status);
			c.setState(State);
			
			profile.add(c);
		}
		
		else if (Age > 16) {
			Adult a = new Adult(Name, Status, Gender, Age, State);
			System.out.println("You have added this person as Adult");
				
			a.setAge(Age);
		//	a.setFile(file);
			a.setName(Name);
			a.setGender(Gender);
			a.setStatus(Status);
			a.setState(State);
				
			profile.add(a);
		}else if (Age < 0 || Age > 150)
			try {
				throw new NoSuchAgeException();
			} catch (NoSuchAgeException e) {
				System.err.println("Please dont put Age less than zero or More than 150.");
			}
	}
	
	public String toString() {
		return (this.getName() + " " + this.getStatus()+ "" + this.getGender() + "" + this.getAge() + " " + this.getState());
	}


	
	
}
	

