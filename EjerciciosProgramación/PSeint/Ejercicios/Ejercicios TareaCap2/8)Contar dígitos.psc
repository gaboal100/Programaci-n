Algoritmo ContarDigitos
	Escribir "Dame un n�mero de uno o dos d�gitos"
	Leer num
	Si num < 0 Entonces
		num <- num * (-1)
	FinSi
	
	Si num < 10 Entonces
		Escribir "El n�mero " num " es de un d�gito"
	SiNo
		Si num < 100 Entonces
			Escribir "El n�mero " num " es de dos d�gitos"
		SiNo
			Escribir "El n�mero es de m�s de dos d�gitos"
		FinSi
	FinSi

	
FinAlgoritmo
