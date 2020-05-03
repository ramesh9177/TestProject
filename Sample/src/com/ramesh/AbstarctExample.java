package com.ramesh;

  abstract class HelloAbstract 
{
	
	abstract void mySal();	
	
	 void myName()
	{
		System.out.println("My name is Ramesh Chennu");
	}

}

 class Ramesh extends HelloAbstract
 {
	 void mySal()
	 {
		 System.out.println("Ramesh Salary is 11000000");
	 }
	 
 }
 
 class Ganesh extends HelloAbstract
 {
	 
	 void mySal()
	 {
		 System.out.println("Ganesh Salary is 2202000");
		 
	 }
	 
 }
 
 public class AbstarctExample
 {
	 public static void main(String args[])
	 {
		 HelloAbstract hr=new Ramesh();
		 HelloAbstract hg=new Ganesh();
		 hr.myName();
		 hr.mySal();
		 hg.mySal();
		 
		 
		 
		 
	 }
 }
 
/*
 * class Ganesh extends AbstarctExample { void salary() {
 * System.out.println("Ganesh Salary is 2000000"); } }
 */
