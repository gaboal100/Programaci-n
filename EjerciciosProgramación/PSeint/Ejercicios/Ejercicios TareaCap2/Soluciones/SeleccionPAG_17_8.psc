Algoritmo SeleccionPAG_17_8
	Escribir "Introduce un numero"
	Leer A
	Si a<0 Entonces
		a<-a*(-1)
	
	Fin Si
	Si a<10 Entonces
		Escribir "tiene una cifra"
	SiNo
		Si (a>10 & a <=999)  Entonces
			Escribir "tiene dos cifras"
		
		Fin Si
	Fin Si
	
FinAlgoritmo
