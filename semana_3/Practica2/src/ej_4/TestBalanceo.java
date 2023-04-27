package ej_4;

import ej_3.PilaGenerica;

public class TestBalanceo {
		PilaGenerica<String> pila = new PilaGenerica<String>();
		
		public boolean testearBalanceo(String s) {
			// Cargo la pila y comparo
			int i = 0;
			boolean fin = false;
			
			while ( (i<s.length()) && (fin == false) ) {
				String c = String.valueOf(s.charAt(i));
				String ultimoCaracter = null;
				
				if( (c.equals("{")) || (c.equals("[")) || (c.equals("(")) ) {
					pila.apilar(c);
				}else {
					if(pila.esVacia()) {
						fin = true;
					}else {
						ultimoCaracter = pila.tope();
						if((c.equals(")") && ultimoCaracter.equals("(")) 
							|| (c.equals("}") 	&& ultimoCaracter.equals("{")) 
							|| (c.equals("]") && ultimoCaracter.equals("["))) {
							pila.desapilar();
						}else {
							fin = true;
						}
					}
				}
				
				i++;
			}
			
			if(fin || !pila.esVacia()) {
				return false;
			}else {
				return true;
			}
		}
				
}
