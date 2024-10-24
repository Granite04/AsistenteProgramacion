package funciones;

public class Validaciones {
	
	protected static boolean isInt(String num) {
		boolean isNum = false;
		try {
			Integer.parseInt(num);
			isNum = true;
		} catch (Exception e) {}
		return isNum;
	}
	
	protected static boolean isDouble(String num) {
		boolean isNum = false;
		try {
			Double.parseDouble(num);
			isNum = true;
		} catch (Exception e) {}
		return isNum;
	}
	
	protected static boolean isFloat(String num) {
		boolean isNum = false;
		try {
			Float.parseFloat(num);
			isNum = true;
		} catch (Exception e) {}
		return isNum;
	}
	
	
	
}
