Algoritmo PromedioBucle
	Escribir "Dame 4 n�meros para hacer el promedio, el proceso se parar� si el primer n�mero es 0"
	Leer n1,n2,n3,n4
	Mientras NO (n1 = 0) Hacer
		prom <- (n1+n2+n3+n4) / 4
		Escribir "El promedio es " prom
		Escribir ""
		Escribir "Dame 4 n�meros para hacer el promedio, el proceso se parar� si el primer n�mero es 0"
		Leer n1,n2,n3,n4
	Fin Mientras
	Escribir "El promedio es " prom
FinAlgoritmo
