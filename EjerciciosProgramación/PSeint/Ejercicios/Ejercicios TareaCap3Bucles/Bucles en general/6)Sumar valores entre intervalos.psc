Algoritmo SumarIntervalo
	Escribir "Dame un intervalo de dos números"
	Leer n1, n2
	Si n2 < n1 Entonces
		Aux1 <- n1
		Aux2 <- n2
		n2 <- Aux1
		n1 <- Aux2
	FinSi
	Escribir "El intervalo es de " n1 " a " n2 "."
	Escribir "Dame un número dentro de ese intervalo."
	Leer n3
	Mientras No(n3 = 99) Hacer
		Si n3 < n1 O n3 > n2 Entonces
			Escribir "El número no forma parte del intervalo"
		SiNo
			suma <- suma + n3
		FinSi
		Escribir "Total: " suma
		Escribir "El intervalo es de " n1 " a " n2 "."
		Escribir "Dame un número dentro de ese intervalo."
		Leer n3
	Fin Mientras
	Escribir "Total: " suma
	
FinAlgoritmo
