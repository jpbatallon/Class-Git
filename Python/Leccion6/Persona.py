class Persona:  # Creamos una persona
  
  def __init__(self, nombre, apellido, edad):  # Se lo llama método Init Dunder
    self.nombre = nombre
    self.apellido = apellido
    self.edad = edad
  def mostrar_detalle(self):
    print(f"Persona: {self.nombre} {self.apellido}, edad: {self.edad} años.")

persona1 = Persona("Pedro", "Picapiedra", 33)  # Necesitamos enviar argumentos
print(f"El objeto1 de la clase persona es: {persona1.nombre} {persona1.apellido} y su edad es de {persona1.edad} años.")

persona2 = Persona("Pablo", "Mármol", 32)
print(f"El objeto2 de la clase persona es: {persona2.nombre} {persona2.apellido} y su edad es de {persona2.edad} años.")

persona1.nombre = "Vilma"
persona1.apellido = "Picapiedra"
persona1.edad = "30"
print(f"El objeto1 modificado, de la clase persona es: {persona1.nombre} {persona1.apellido} y su edad es de {persona1.edad} años.")


# Los atributos son: Características.
# Los métodos son: El comportamiento que van a tener los objetos (acciones)

persona1.mostrar_detalle()
persona2.mostrar_detalle()