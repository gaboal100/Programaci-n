Algoritmo A�oBisiesto
	Escribir "Dame un a�o."
	Leer a�o
	resto4 <- a�o % 4
	resto100 <- a�o % 100
	resto400 <- a�o % 400
	
	Si resto4 = 0 Y NO (resto100 = 0) O resto400 = 0 Entonces
		Escribir "El a�o es bisiesto."
	SiNo
		Escribir "El a�o no es bisiesto"
	FinSi

	
FinAlgoritmo
