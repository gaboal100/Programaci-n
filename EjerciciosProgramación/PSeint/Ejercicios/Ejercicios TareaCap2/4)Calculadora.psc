Algoritmo Calculadora
	Escribir "Calculadora"
	Escribir "Dame un n�mero: "
	Leer num1
	Escribir "Dame un signo: "
	Leer sign
	Escribir "Dame otro n�mero: "
	Leer num2
	
	Segun (sign)
		'+': Escribir num1 " " sign " " num2 " = "  num1+num2
		'-': Escribir num1 " " sign " " num2 " = "  num1-num2
		'*': Escribir num1 " " sign " " num2 " = "  num1*num2
		'/': Si No (num2 = 0) Entonces
				Escribir num1 " " sign " " num2 " = "  num1/num2
			SiNo
				Escribir "No se puede dividir entre cero"
			FinSi
		De Otro Modo:
			Escribir "Error en s�mbolo"
	FinSegun
	
	
	//Si sign = "+" O sign = "-" O sign = "*" O sign = "/" Entonces
	//	Escribir num1 " " sign " " num2
	//	Escribir "_____________________"
	//	Si sign = "+" Entonces
	//		Escribir num1 + num2
	//	SiNo
	//		Si sign = "-" Entonces
	//			Escribir num1 - num2
	//		SiNo
	//			Si sign = "*" Entonces
	//				Escribir num1 * num2
	//			SiNo
	//				Si sign = "/" Entonces
	//					Si No (num2 = 0) Entonces
	//						Escribir num1 / num2
	//					SiNo
	//						Escribir "No se puede dividir entre cero"
	//					FinSi
	//				FinSi
	//			FinSi
	//		FinSi
	//	FinSi
	//SiNo
	//	Escribir "Error en s�mbolo"
	//FinSi
FinAlgoritmo
