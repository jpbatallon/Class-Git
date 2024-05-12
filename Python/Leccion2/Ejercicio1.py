#Sacar el área y perímetro de un rectángulo
alto = int(input("Ingrese un número para el alto del rectángulo: "))
ancho = int(input("Ingrese un número para el ancho del rectángulo: "))

area = alto * ancho
perimetro = (alto + ancho) * 2

print(f"El área del rectángulo es: {area}")
print(f"El perímetro del rectángulo es:{perimetro}")

#Número par o impar
num = int(input("Digite un número para saber si es par o impar: "))

if num % 2 == 0:
 print(f"El número ingresado es par.")
else:
  print(f"El número ingresado es impar.")

 #Determinar si es mayor de edad o no
edad = int(input("Ingrese su edad para saber si es mayor o no: "))

if edad >= 18:
  print(f"Eres mayor de edad.")
else:
  print(f"No eres mayor de edad.")

#Valor dentro de un rango
num = int(input("Digite un número para saber si se encuentra entre los valores 0 y 5: "))

if num >= 0 and num <= 5:
  print(f"El valor ingresado se encuentra entre 0 y 5.")
else:
  print(f"El valor ingresado NO se encuentra entre los valores 0 y 5.")

#Un padre puede ir al juego o no
Vacaciones = True
diaLibre = True

if not (Vacaciones or diaLibre):
  print(f"No tiene descando, por ende no puede asistir al juego del hijo.")
else:
  print(f"Puede asistir al juego del hijo.")