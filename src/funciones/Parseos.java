package funciones;

public class Parseos {
	
	protected static int stringToInt(String numero) {
		int num = 0;
		try {
			num = Integer.parseInt(numero);
		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return num;
	}
	
	protected static double stringToDouble(String numero) {
		double num = 0;
		try {
			num = Double.parseDouble(numero);
		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return num;
	}
	
	protected static String intToString(int numero) {
		return Integer.toString(numero);
	}
	
	protected static String doubleToString(double numero) {
		return Double.toString(numero);
	}
	
	protected static String charToString(char caracter) {
		return Character.toString(caracter);
	}
	
	protected static char stringToChar(String caracter) {
		return caracter.charAt(0);
	}
	
	protected static String booleanToString(boolean valor) {
		return Boolean.toString(valor);
	}
	
	protected static boolean stringToBoolean(String valor) {
		return Boolean.parseBoolean(valor);
	}
	
	protected static String floatToString(float numero) {
		return Float.toString(numero);
	}
	
	protected static float stringToFloat(String numero) {
		float num = 0;
		try {
			num = Float.parseFloat(numero);
		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return num;
	}
	
	protected static String longToString(long numero) {
		return Long.toString(numero);
	}
	
	protected static long stringToLong(String numero) {
		long num = 0;
		try {
			num = Long.parseLong(numero);
		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return num;
	}
	
	protected static String shortToString(short numero) {
		return Short.toString(numero);
	}
	
	protected static short stringToShort(String numero) {
		short num = 0;
		try {
			num = Short.parseShort(numero);
		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return num;
	}
	
	protected static String byteToString(byte numero) {
		return Byte.toString(numero);
	}
	
	protected static byte stringToByte(String numero) {
		byte num = 0;
		try {
			num = Byte.parseByte(numero);
		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return num;
	}
	
}
