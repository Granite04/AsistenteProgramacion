package ventanas.cambiarManteniendoResolucionCordenadas;

import java.awt.EventQueue;
import java.awt.Rectangle;

public class Funciones {
	
	//Cambiar (Protected --> Public) para funcionar
	
	protected static void cambioVentana(Rectangle Cordenada, int x, int y) {
		cordenadas(Cordenada);
		resolucion(x, y);
	}
	
	protected static void cordenadas(Rectangle Cordenada) {
		Variables.cordX = (int)Cordenada.getX();
    	Variables.cordY = (int)Cordenada.getY();
	}
	
	protected static void resolucion(int x, int y) {
		Variables.resolucionX = x;
		Variables.resolucionY = y;
	}
	
	protected static void abrirFrame1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	protected static void abrirFrame2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
