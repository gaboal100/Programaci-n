Algoritmo CompararAreas
	Escribir "Dame los lados de un rect�ngulo."
	Leer l1, l2
	Escribir "Dame el radio de un c�rculo."
	leer r
	AreaR <- l1 * l2
	AreaC <- 3.14 * r^2
	
	Si AreaC = AreaR Entonces
		Escribir "Las �reas son iguales. Rec=" AreaR " Cir=" AreaC
	SiNo
		Escribir "Las �reas NO son iguales. Rec=" AreaR " Cir=" AreaC
	FinSi
FinAlgoritmo
