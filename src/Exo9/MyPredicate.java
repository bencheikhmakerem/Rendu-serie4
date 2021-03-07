package Exo9;

import java.util.function.Predicate;


public class MyPredicate {
	public static void main(String[] args) {
		
	//predicate qui retourne true si une chaine possède plus que 4 caractère
	Predicate<String> p1= 
			      	s -> s.length()>4 ;
	
		System.out.println("p1 test: " +p1.test("bonjour"));
	
		//predicate qui retourne true si la chaine est non vide
	Predicate<String> p2= 
					s-> !s.isEmpty() ;
		
	System.out.println("p2 test: " +p2.test("Makerem"));
	
	
	//predicate qui retourne true si la chaine commence par J
	Predicate<String> p3= 
			    s -> s.startsWith("J") ;	
	System.out.println("p3 test: " +p3.test("Jeudi"));
   
	//predicate qui retourne true si la longueur de la chaine est 5
   
	Predicate<String> p4= 
				s -> s.length()==5;
	
    System.out.println("p4 test: " +p4.test("Lucas"));
    
 
    //predicate qui retourne true si la longueur de la chaine est 5
    
 	Predicate<String> p5= 
 				s -> s.length()==5;
 	
     System.out.println("p5 test: " +p5.test("lundi"));
	
	
     //predicate qui retourne true si la chaine commence par J et a une longueur de 5
     
     Predicate<String> p6=
    		 	  p5.and(p3);
    		 System.out.println("p6 test: " +p6.test("Julie"));
	

}
}
