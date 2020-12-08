Algoritmo SeleccionPAG_17_3
	Escribir "Introduce un numero"
	Leer A
	Escribir "Introduce un numero"
	Leer B
	Escribir "Introduce un simbolo (*/-+)"
	Leer simbolo
	Si simbolo="*" Entonces
		rdo<-A*B
		Escribir "La multiplicacion es ",rdo
	SiNo
		Si simbolo="+" Entonces
			rdo<-A+B
			Escribir "La suma es ",rdo
		SiNo
			Si simbolo="-" Entonces
				rdo<-A-B
				Escribir "La resta es ",rdo
			SiNo
				Si simbolo="/" Entonces
					Si B!=0 Entonces
						
						rdo<-A/B
						Escribir "La division es ",r
					Fin Si
				
				SiNo
					
					Escribir "simbolo erroneo"
					
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
	
FinAlgoritmo
