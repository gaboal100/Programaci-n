Algoritmo Orden_mayor_menor
	Escribir "Dame 3 números para ordenarlos de mayor a menor"
	Leer a, b, c
	
	Si a = b O a = c O b = c Entonces
		Escribir "Dos números o más son iguales"
	SiNo
		Si a > b Entonces
			Si b > c Entonces
				Escribir "Orden M-m: " a " > " b " > " c
				Escribir "Orden M-m: " c " > " b " > " a
			SiNo
				Escribir "Orden M-m: " a " > " c " > " b
				Escribir "Orden M-m: " b " > " c " > " a
			FinSi
		SiNo
			Si b > c Entonces
				Si a > c Entonces
					Escribir "Orden M-m: " b " > " a " > " c
					Escribir "Orden m-M: " c " > " a " > " b
				SiNo
					Escribir "Orden M-m: " b " > " c " > " a
					Escribir "Orden m-M: " a " > " c " > " b
				FinSi
			SiNo
				Si b > a Entonces
					Escribir "Orden M-m: " c " > " b " > " a
					Escribir "Orden m-M: " a " > " b " > " c
				SiNo
					Escribir "Orden M-m: " b " > " a " > " c
					Escribir "Orden m-M: " c " > " a " > " b
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
