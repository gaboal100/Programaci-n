Algoritmo ListaDeNumeros
	Escribir "Dame un número."
	Leer n1
	Aux1 <- 0
	Contador <- 1
	Mientras No (n1 = 0) Hacer
		Si n1 > Aux1 Y No(n1 = 0) Entonces
			Aux1 <- n1
			Posición <- Contador
		FinSi
		Contador <- Contador+1
		Escribir "Dame un número."
		Leer n1
	Fin Mientras
	Escribir "Valor máximo: " Aux1 "/ Posición: " Posición
FinAlgoritmo
