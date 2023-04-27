package ej_5;

import tp02.ejercicio2.ColaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class AnalizadorArbol {
	public int devolverMaximoPromedio(ArbolGeneral<AreaEmpresa> arbol) {
		ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<ArbolGeneral<AreaEmpresa>>();
		
		cola.encolar(arbol);
		cola.encolar(null);
		
		int promMax = -1;
		int cantNodos = 0;
		int sumAct = 0;
		int promAct;
		
		ArbolGeneral<AreaEmpresa> aux;
		
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			
			if(aux != null) {
				sumAct += aux.getDato().getTardanza();
				cantNodos++;
				if(aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<AreaEmpresa>> lHijos = aux.getHijos();
					lHijos.comenzar();
					while(!lHijos.fin()) {
						cola.encolar(lHijos.proximo());
					}
				}
			}else {
				if(!cola.esVacia()) {
					cola.encolar(null);
				}
				promAct = sumAct / cantNodos;
				if(promAct > promMax) {
					promMax = promAct;
				}
				sumAct = 0;
				cantNodos = 0;
			}
		}
		
		return promMax;
	}
}
