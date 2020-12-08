Algoritmo SeleccionPAG_17_10
	Escribir "Introduce hora"
	Leer h1
	Escribir "Introduce minutos"
	Leer m1
	Escribir "segundos"
	Leer s1
	Escribir " segunda hora"
	
	Escribir "Introduce hora"
	Leer h2
	Escribir "Introduce minutos"
	Leer m2
	Escribir "segundos"
	Leer s2
	
	h1<-h1+h2
	m1<-m1+m2
	s1<-s1+s2
	Si s1>=60 Entonces
		s1<-s1-60
		m1<-m1+1
	
	Fin Si
	Si m1>=60 Entonces
		m1<-m1-60
		h1<-h1+1
		
	Fin Si

	Si h1>=24 Entonces
		h1<-h1-24
		
		
	Fin Si
	Escribir "La hor resultante es:", h1,":",m1,":",s1
FinAlgoritmo
