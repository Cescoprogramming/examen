
public class DNI {
	
	public static boolean dniValido(String dni) {
		
		if(dni.length() == 9) {
			if(dni.substring(0, 8).contains("[a-zA-Z]+") == false || dni.substring(8).contains("[a-zA-Z]+") == true) {
				
				int numero =  Integer.parseInt(dni.substring(0, 8));
				String letra = dni.substring(8);
				
				if (letra.equals(letraDNI(numero))) {
					return true;
					
				} else {
					
					return false;
				}
				
			} else {
				return false;
			}
			
			} else {
				return false;
			}
	}



	public static String letraDNI(int numero) {
	int resto = numero%23;
	
	String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
	
	String letra = letras[resto];
	
	return letra;
	}
}