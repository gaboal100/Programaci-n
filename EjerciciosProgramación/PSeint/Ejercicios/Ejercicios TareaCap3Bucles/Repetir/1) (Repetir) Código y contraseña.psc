Algoritmo C�digoYContrase�a
	Repetir
		Escribir "Dame tu c�digo de usuario."
		Leer code
		Escribir "Dame la contrase�a."
		Leer pass
		
		Si NO(code = 1) Entonces
			Escribir "C�digo de usuario incorrecto"
		FinSi
		Si NO(pass = 1234) Entonces
			Escribir "Contrase�a incorrecta"
		FinSi
		Escribir ""
	Hasta Que code = 1 Y pass = 1234
	Escribir "Bienvenido"
FinAlgoritmo
