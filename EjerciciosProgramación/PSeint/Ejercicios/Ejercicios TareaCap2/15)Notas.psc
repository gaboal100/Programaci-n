Algoritmo Notas
	Escribir "Dame tu nota."
	Leer nota
	
	Si nota >= 0 Y nota < 5 Entonces
		Escribir "Suspenso"
	SiNo
		Si nota >= 5 Y nota < 7 Entonces
			Escribir "Aprobado"
		SiNo
			Si nota >= 7 Y nota < 9 Entonces
				Escribir "Bien"
			SiNo
				Si nota >= 9 Y nota < 10 Entonces
					Escribir "Notable"
				SiNo
					Si nota = 10 Entonces
						Escribir "Sobresaliente"
					SiNo
						Escribir "Nota no válida"
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
	
//	Segun nota Hacer
//		0, 1, 2, 3, 4: 
//			Escribir "Suspenso."
//		5, 6:
//			Escribir "Aprobado."
//		7, 8:
//			Escribir "Bien."
//		9:
//			Escribir "Notable."
//		10:
//			Escribir "Sobresaliente."
//		De Otro Modo:
//			Escribir "Nota no válida"
//	Fin Segun
	
FinAlgoritmo
