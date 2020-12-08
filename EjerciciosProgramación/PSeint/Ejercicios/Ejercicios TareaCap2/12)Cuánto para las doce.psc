Algoritmo CuantoParaLasDoce
	Escribir "Dame la hora (horas, minutos, segundos."
	Leer h, m, s
	horaFalta <- 23 - h
	minFalta <- 59 - m
	segFalta <- 60 - s
	
	Si h > 23 O m > 59 O s > 59 Entonces
		Escribir "Hora no válida."
	SiNo
		Escribir "Faltan " horaFalta " horas, " minFalta " minutos y " segFalta " segundos para las 23:59:00"
	FinSi
	
FinAlgoritmo
