Algoritmo ListaDeNumeros
	Escribir "Dame un n�mero."
	Leer n1
	Aux1 <- 0
	Contador <- 1
	Mientras No (n1 = 0) Hacer
		Si n1 > Aux1 Y No(n1 = 0) Entonces
			Aux1 <- n1
			Posici�n <- Contador
		FinSi
		Contador <- Contador+1
		Escribir "Dame un n�mero."
		Leer n1
	Fin Mientras
	Escribir "Valor m�ximo: " Aux1 "/ Posici�n: " Posici�n
FinAlgoritmo
