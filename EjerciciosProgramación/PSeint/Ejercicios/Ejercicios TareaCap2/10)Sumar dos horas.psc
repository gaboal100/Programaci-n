Algoritmo SumarDosHoras
	Escribir "Dame una hora (horas, minutos y segundos."
	Leer h1, m1, s1
	Escribir "Dame otra hora (horas, minutos y segundos."
	Leer h2, m2, s2
	ht <- h1 + h2
	mt <- m1 + m2
	st <- s1 + s2
	dia <- 0
	
	Si s1 > 59 O s2 > 59 O m1 > 59 O m2 > 59 O h1 > 23 O h2 > 23 Entonces
		Escribir "Hora no válida."
	SiNo
		Si st >= 60 Entonces
			mt <- mt + 1
			st <- st - 60
		FinSi
		Si mt >= 60 Entonces
			ht <- ht + 1
			mt <- mt - 60
		FinSi
		Si ht >= 24 Entonces
			dia <- dia + 1
			ht <- ht - 24
		FinSi
		Escribir "Días => " dia "/ Horas => " ht "/ Minutos => " mt "/ Segundos => " st
	FinSi
	
FinAlgoritmo
