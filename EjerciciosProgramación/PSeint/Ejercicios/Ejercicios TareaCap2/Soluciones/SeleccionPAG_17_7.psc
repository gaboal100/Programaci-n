Algoritmo SeleccionPAG_17_7
	Escribir "Introduce un numero"
	Leer A
	Escribir "Introduce un numero"
	Leer B
	Escribir "Introduce un numero"
	Leer C
	Si A>B & B>C Entonces
		Escribir"Números ordenados de mayor a menor ",A," ",B," ",C
		Escribir"Números ordenados de menor a mayor ",C," ",B," ",A
		
	SiNo		
		Si A>B & C>B Entonces
			Escribir"Números ordenados de mayor a menor  ",A," ",C," ",B
			Escribir"Números ordenados de  menor a mayor  ",B," ",C," ",A
		SiNo		
			Si B>A & A>C Entonces
				Escribir"Números ordenados  de mayor a menor  ",B," ",A," ",C
				Escribir"Números ordenados  de menor a mayor  ",C," ",A," ",B
			SiNo		
				Si B>C & C>A Entonces
					Escribir"Números ordenados  de mayor a menor  ",B," ",C," ",A
					Escribir"Números ordenados  de menor a mayor  ",A," ",C," ",B
				SiNo		
					Si C>A & A>B Entonces
						Escribir"Números ordenados  de mayor a menor  ",C," ",A," ",B
						Escribir"Números ordenados  de menor a mayor  ",B," ",A," ",C
					sino
						Escribir"Números ordenados  de mayor a menor  ",C," ",B," ",A
						Escribir"Números ordenados  de menor a mayor  ",A," ",B," ",C
					
					FinSi
					
				Fin Si
			Fin Si
		Fin Si
	Fin Si
		
FinAlgoritmo
