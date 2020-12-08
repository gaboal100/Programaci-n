Algoritmo SeleccionPAG_17_3
	Escribir "Introduce un numero"
	Leer A
	Escribir "Introduce un numero"
	Leer B
	Escribir "Introduce un simbolo (*/-+)"
	Leer simbolo
	Segun simbolo Hacer
		"*":
			rdo<-A*B
			Escribir "La multiplicacion es ",rdo
		"+":
			rdo<-A+B
			Escribir "La suma es ",rdo
		"-":
			rdo<-A-B
			Escribir "La resta es ",rdo
		"/"	:
			Si B!=0 Entonces
				
				rdo<-A/B
				Escribir "La division es ",r
			Fin Si
		De Otro Modo:
			Escribir "simbolo erroneo"
	Fin Segun
	
FinAlgoritmo
