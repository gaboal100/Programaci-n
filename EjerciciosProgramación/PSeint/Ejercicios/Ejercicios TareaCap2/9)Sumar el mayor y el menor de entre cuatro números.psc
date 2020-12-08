Algoritmo Cuatro_Números_Sumar_Mayor_Y_Menor
	
	Escribir "Dame cuatro números, se sumarán el mayor y el menor"
	Leer a, b, c, d
	//	a b c d - a b d c - a c b d - a c d b - a d c b - a d b c
	//	b c d a - b c a d - b a c d - b a d c - b d a c - b d c a
	//	c d a b - c d b a - c b d a - c b a d - c a d b - c a b d
	//	En todos los casos hay dos veces en las que se repite el último número
	Si a > b Y a > c Y a > d Entonces
		Si c > d Y b > d Entonces
			Escribir "Se suman " a " y " d " ==> " a+d
		SiNo
			Si d > c Y b > c Entonces
				Escribir "Se suman " a " y " c " ==> " a+c
			SiNo
				Si d > b Y c > b Entonces
					Escribir "Se suman " a " y " b " ==> " a+b
				FinSi
			FinSi
		FinSi
	SiNo
		Si b > a Y b > c Y b > dEntonces
			Si a > d Y c > d Entonces
				Escribir "Se suman " b " y " d " ==> " b+d
			SiNo
				Si c > a Y d > a Entonces
					Escribir "Se suman " b " y " a " ==> " b+a
				SiNo
					Si a > c Y d > c Entonces
						Escribir "Se suman " b " y " c " ==> " b+c
					FinSi
				FinSi
			FinSi
		SiNo
			Si c > a Y c > b Y c > d Entonces
				Si a > d Y b > d Entonces
					Escribir "Se suman " c " y " d " ==> " c+d
				SiNo
					Si b > a Y d > a Entonces
						Escribir "Se suman " c " y " a " ==> " c+a
					SiNo
						Si a > b Y d > b Entonces
							Escribir "Se suman " c " y " b " ==> " c+b
						FinSi
					FinSi
				FinSi
			SiNo
				Si d > a Y d > b Y d > c Entonces
					Si a > c Y b > c Entonces
						Escribir "Se suman " d " y " c " ==> " d+c
					Sino
						Si b > a Y c > a Entonces
							Escribir "Se suman " d " y " a " ==> " d+a
						SiNo
							Si c > b Y a > b Entonces
								Escribir "Se suman " d " y " b " ==> " d+b
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
	
FinAlgoritmo
