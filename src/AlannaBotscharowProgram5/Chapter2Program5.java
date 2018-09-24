package AlannaBotscharowProgram5;

/* 
 * Alanna Botscharow
 * 9/18
 * Area and perimeter of a circle. 
 */


public class Chapter2Program5 {

	public static void main(String[] args) {
		//Formula for area: 3.1415 * radius * radius
		//Formula for perimeter:2 * 3.1415 * radius
		

		final double PI = 3.1415;
		
		double radius;
		double area;
		double perimeter;
		

		 	radius = 5.5;
	
		
		
		
			perimeter = 2 * PI * radius; 
			area = (radius*radius)*PI;
		System.out.println("The area of your circle is "+area);
		System.out.println("The perimeter/circumference of your circle is "+perimeter);
	
	
	}
}
