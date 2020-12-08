Algoritmo PromedioBucle
	Escribir "Dame 4 números para hacer el promedio, el proceso se parará si el primer número es 0"
	Leer n1,n2,n3,n4
	Mientras NO (n1 = 0) Hacer
		prom <- (n1+n2+n3+n4) / 4
		Escribir "El promedio es " prom
		Escribir ""
		Escribir "Dame 4 números para hacer el promedio, el proceso se parará si el primer número es 0"
		Leer n1,n2,n3,n4
	Fin Mientras
	Escribir "El promedio es " prom
FinAlgoritmo
