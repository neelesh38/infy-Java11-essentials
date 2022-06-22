public class F_C_K {

	public static void main(String[] args) {
        double fahrenheit = 212.0;      // Input in Fahrenheit

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);     // conversion from fahrenheit to celsius
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        
        
        //Write code here to convert temperature to Kelvin
        double  Kelvin =(( 5 *(fahrenheit - 32.0)) / 9.0)+273.15;     // conversion from fahrenheit to kelvin
        System.out.println(fahrenheit + " degree Kelvin is equal to " + Kelvin + " in Kelvin");
	}
}
