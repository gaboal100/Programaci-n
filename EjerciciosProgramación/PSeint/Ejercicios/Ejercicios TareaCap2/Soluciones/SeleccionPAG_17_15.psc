Algoritmo SeleccionPAG_17_15
	Escribir "Introduce Nota"
	Leer N
	Si N>10	| N<0 Entonces
		Escribir"Error"
	
	SiNo
		Si N>=9 Entonces
			Escribir "Sobresaliente"
		SiNo
			Si N>=7 Entonces
				escribir "Notable"
			SiNo
				Si N>=6 Entonces
					escribir "Bien"
				SiNo
					Si N>=5 Entonces
						escribir "Aprobado"
					SiNo
						escribir "Suspenso"
					Fin Si
				Fin Si
			Fin Si
		Fin Si
		
	Fin Si
	
	
	
	
FinAlgoritmo
