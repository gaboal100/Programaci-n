Algoritmo SeleccionPAG_17_14
	Escribir "Introduce año"
	Leer A

	Si (A%4=0 ) & (A%100!=0 ) |(A%400=0 ) Entonces
		
		Escribir "Bisiesto"
	SiNo
		Escribir " No Bisiesto"
	
	Fin Si
	
	
	
FinAlgoritmo
