Algoritmo azaroso
	num1 <- AZAR(101)
	num2 <- AZAR(101)
	sumazar <- num1 + num2
	Escribir "Calcula la suma entre " num1 " y " num2 "."
	Leer usuario
	Mientras NO (usuario = sumazar) Hacer
		Escribir "Suma equivocada"
		Escribir ""
		Escribir "Calcula la suma entre " num1 " y " num2 "."
		Leer usuario
	Fin Mientras
	Escribir "Acertaste"
FinAlgoritmo
