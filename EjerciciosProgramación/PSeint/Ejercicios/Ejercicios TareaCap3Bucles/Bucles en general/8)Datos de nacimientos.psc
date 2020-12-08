Algoritmo DatosDeCiudad
//	contadorF <- 0
//	contadorM <- 0
//	contadorS1 <- 0
//	contadorS2 <- 0
	Repetir
		Escribir "Sexo (F, M)"
		Leer sexo
		Escribir "Día de nacimiento (día, mes)"
		Leer dia, mes		
		Si sexo = "F" O sexo = "f" Entonces
			contadorF = contadorF + 1
		SiNo
			Si sexo = "M" O sexo = "m" Entonces
				contadorM = contadorM + 1
			SiNo
				Escribir "Sexo no válido"
			FinSi
		FinSi
		Si (mes <= 6 Y mes > 0) Y (dia > 0 Y dia < 32) Entonces
			contadorS1 = contadorS1 + 1
		SiNo
			Si (mes > 6 Y mes < 13) Y (dia > 0 Y dia < 32) Entonces
				contadorS2 = contadorS2 + 1
			SiNo
				Escribir "Nacimiento no válido"
			FinSi
		FinSi
	Hasta Que sexo = ""
	Escribir "Número de mujeres: " contadorF
	Escribir "Número de hombres: " contadorM
	Escribir "Nacidos en el primer semestre: " contadorS1
	Escribir "Nacidos en el segundo semestre: " contadorS2
FinAlgoritmo
