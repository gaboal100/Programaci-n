Algoritmo ContarDigitos
	Escribir "Dame un número de uno o dos dígitos"
	Leer num
	Si num < 0 Entonces
		num <- num * (-1)
	FinSi
	
	Si num < 10 Entonces
		Escribir "El número " num " es de un dígito"
	SiNo
		Si num < 100 Entonces
			Escribir "El número " num " es de dos dígitos"
		SiNo
			Escribir "El número es de más de dos dígitos"
		FinSi
	FinSi

	
FinAlgoritmo
