package Exo10;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MyFunction {

	public static void main(String[] args) {
		//Function qui retourne la chaine en majuscule
		Function <String,String> f1=
				s->s.toUpperCase();
		System.out.println("---test f1----");
		System.out.println("la chaine en majuscule est : " +f1.apply("makerem"));
		//Function qui retourne la meme chaine
	    Function <String,String> f2=
						s->s;	
		System.out.println("---test f2----");
		System.out.println("la chaine est : " +f2.apply("makerem"));
		System.out.println("la chaine est : " +f2.apply(""));//retour chaine vide

		//Function qui retourne la longueur de la chaine
		Function<String,Integer> f3=
				s->s.length();
		System.out.println("---test f3----");
	    System.out.println("la longueur est : " +f3.apply("Patrick"));
	    System.out.println("la longueur est : " +f3.apply("")); //test longueur chaine vide 
	    
	    
		//Function qui prend une chaine et la retourne entre ()
	     Function<String,String> f4=
				s->s.replace("Makerem","(Makerem)");
		 System.out.println("---test f4----");
	     System.out.println("la nouvelle chaine est : " +f4.apply("Makerem"));
				 
	      //BiFunction qui permet d'identifier si une chaine se trouve dans une autre
	    BiFunction<String, String, Integer> f5=
	    		(text,mot)->text.indexOf(mot);
	    System.out.println("---test f5----");
	    System.out.println("le mot est situé en text dans la position : " +f5.apply("Good","oo"));
	    System.out.println("le mot est situé en text dans la position : " +f5.apply("hello","ma"));//n'existe pas dans la première chaine

		//
	    BiFunction<String, String, Integer> f6=
	    		(text,mot)->text.indexOf(mot);
	    System.out.println("---test f6----");
	    System.out.println("le mot est situé en text dans la position : " +f6.apply("abcdefghi","ab"));
	    System.out.println("le mot est situé en text dans la position : " +f6.apply("abcdefghi","ma"));//n'existe pas dans la première chaine
	}
}
