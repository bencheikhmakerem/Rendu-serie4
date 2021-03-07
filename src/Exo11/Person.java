package Exo11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Person {
 
		 String firstName;
		 String lastName;
		 int age;
		 
		 
		 public Person(String firstName, String lastName, int age) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
		}
		 

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		 @Override
		public String toString() {
			return "Person: firstName=" + firstName + ", lastName=" + lastName + ", age=" + age ;
		}

	
	public static void main(String[] args) 
	{

		List<Person> person = Arrays.asList(
				new Person("Makerem","BENCHEIKH", 24),
				new Person("Nour","Jeddi", 23),
				new Person("Mahdi","Jalled", 25),
				new Person("Ahmed","BENCHEIKH", 31),
				new Person("Wejden","YAHYAOUI", 23),
				new Person("hela","Dhifli", 23));				
		
		System.out.println("\n----la liste des person au début:----");
		person.forEach(s -> System.out.println(s));
	
					 
			  Comparator<Person> comp1=
					(p1,p2)-> {
			    	 int compLastName=p1.getLastName().compareTo(p2.getLastName());
			     
			    	 return compLastName;
			     };
			     
			  Comparator<Person> comp2=
					  (p1,p2)-> {
					   int compLastName=p1.getLastName().compareTo(p2.getLastName());
					     if(compLastName==0)
					     {
					    	 return p1.getFirstName().compareTo(p2.getFirstName());
					     }
					    return compLastName;
					     };
		
		person.sort(comp1);
		System.out.println("\n------person sorted selon comp1:------");
		person.forEach(s -> System.out.println(s));
		
		person.sort(comp2);
		System.out.println("\n-----person sorted selon comp2:-------");
		person.forEach(s -> System.out.println(s));
        
		Comparator<Person> comp3 = comp2.reversed();
		person.sort(comp3);
		System.out.println("\n-----person sorted selon comp3 en ordre inverse:-------");
		person.forEach(s -> System.out.println(s));
		
		List<Person> TestSurNull = Arrays.asList(
				new Person("Makerem","BENCHEIKH", 24),
				new Person("Nour","Jeddi", 23),
				new Person("Mahdi","Jalled", 25),
				new Person("Ahmed","Ajimi", 7),
				null,
				new Person("Sarah","Ktari", 21)
				);
		
		Comparator<Person> comp4=
					Comparator.nullsLast(comp2);
		
		TestSurNull.sort(comp4);
		System.out.println("\n-----person sorted selon comp4:-------");
		TestSurNull.forEach(s -> System.out.println(s));
	
	}
}
