Algoritmo CompararAreas
	Escribir "Dame los lados de un rectángulo."
	Leer l1, l2
	Escribir "Dame el radio de un círculo."
	leer r
	AreaR <- l1 * l2
	AreaC <- 3.14 * r^2
	
	Si AreaC = AreaR Entonces
		Escribir "Las áreas son iguales. Rec=" AreaR " Cir=" AreaC
	SiNo
		Escribir "Las áreas NO son iguales. Rec=" AreaR " Cir=" AreaC
	FinSi
FinAlgoritmo
