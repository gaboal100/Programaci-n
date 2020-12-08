Algoritmo AñoBisiesto
	Escribir "Dame un año."
	Leer año
	resto4 <- año % 4
	resto100 <- año % 100
	resto400 <- año % 400
	
	Si resto4 = 0 Y NO (resto100 = 0) O resto400 = 0 Entonces
		Escribir "El año es bisiesto."
	SiNo
		Escribir "El año no es bisiesto"
	FinSi

	
FinAlgoritmo
