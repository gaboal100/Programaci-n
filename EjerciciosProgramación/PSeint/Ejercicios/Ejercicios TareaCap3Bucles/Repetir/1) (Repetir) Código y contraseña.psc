Algoritmo CódigoYContraseña
	Repetir
		Escribir "Dame tu código de usuario."
		Leer code
		Escribir "Dame la contraseña."
		Leer pass
		
		Si NO(code = 1) Entonces
			Escribir "Código de usuario incorrecto"
		FinSi
		Si NO(pass = 1234) Entonces
			Escribir "Contraseña incorrecta"
		FinSi
		Escribir ""
	Hasta Que code = 1 Y pass = 1234
	Escribir "Bienvenido"
FinAlgoritmo
