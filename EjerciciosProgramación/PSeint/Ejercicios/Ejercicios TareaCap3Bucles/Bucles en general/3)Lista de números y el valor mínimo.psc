Algoritmo ListaDeNumeros
	Escribir "Dame un n�mero."
	Leer n1
	Aux1 <- n1
	Mientras No (n1 = 0) Hacer
		Escribir "Dame un n�mero."
		Leer n1
		Si n1 < Aux1 Y No(n1 = 0) Entonces
			Aux1 <- n1
		FinSi
	Fin Mientras
	Escribir "Valor m�nimo: " Aux1
FinAlgoritmo
