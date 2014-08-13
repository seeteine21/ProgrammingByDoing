import java.util.Scanner;

public class BMICalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi;
		
		System.out.print( "Your height in inches: " );
		m = keyboard.nextDouble() * .0254;
		
		System.out.print( "Your weight in lbs: " );
		kg = keyboard.nextDouble() *.45;
		
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
		
		if ( bmi < 18.5 )
		System.out.println( "BMI Category: underweight" );
		
		if ( bmi >= 18.5 && bmi < 25 )
		System.out.println( "BMI Category: normal weight" );
		
		if ( bmi >= 25 && bmi < 30 )
		System.out.println( "BMI Category: overweight" );
		
		if ( bmi >= 30 )
		System.out.println( "BMI Category: obese" );
	}
}