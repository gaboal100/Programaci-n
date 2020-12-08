Algoritmo SeleccionPAG_17_9
	Escribir "Introduce un numero"
	Leer A
	Escribir "Introduce un numero"
	Leer B
	Escribir "Introduce un numero"
	Leer C
	Escribir "Introduce un numero"
	Leer D
	AUX<-0
	Si A>AUX Entonces
		AUX<-A
	Fin Si
	Si B>AUX Entonces
		AUX<-B
	Fin Si
	Si C>AUX Entonces
		AUX<-C
	Fin Si
	Si D>AUX Entonces
		AUX<-D
	Fin Si
	Escribir " EL MAYOR ", AUX
	MEN<-999999
	Si A<MEN Entonces
		MEN<-A
	Fin Si
	Si B<MEN Entonces
		MEN<-B
	Fin Si
	Si C>MEN Entonces
		MEN<-C
	Fin Si
	Si D>MEN Entonces
		MEN<-D
	Fin Si
FinAlgoritmo
