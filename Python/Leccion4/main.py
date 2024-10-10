# lista = Agus, Elias, Juan, Maxi

nombres = ["Agus", "Eli", "Juan", "Maxi"]

print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[2])
print(nombres[3])
print(nombres[-1])
print(nombres[-2])

print(nombres[0:2]) # Solo muestra el índice 0, 1 pero no el índice 2.

# Ir del inicio de la lista al índice (sin incluirlo)
print(nombres [ :3]) # Indices a mostrar 0, 1 y 2

# Desde el índice indicado hasta el final
print(nombres [1: ])

# Modificamos un valor
nombres[2] = "Juan Pablo"
nombres[0] = "Agustín"
print(nombres)

# Iterar una lista
for nombre in nombres: # nombre es singular, la lista es plural
  print(nombre)
else:
  print("Se acabaron los elementos de la lista.")

# Preguntamos cuantos elementos tiene una lista
print(len(nombres)) # Le pasamos como parámetro la lista

# Agregamos el elemento
nombres.append("Ariel")
print(nombres)

# Insertar un elemento en un índice específico
nombres.insert(1, "Osvaldo")
print(nombres)
nombres.insert(3, "Natalia")
print(nombres)

# Eliminamos un elemento
nombres.remove("Natalia")
print(nombres)

# Eliminar el último elemento
nombres.pop()
print(nombres)

# Eliminamos un índice específico
del nombres[1] # del significa delete (eliminar)
print(nombres)

# Eliminar, borrar, limpiar todos los elementos
nombres.clear()
print(nombres)

# Eliminar lista
del nombres
# print(nombres) # Acá nos muestra un error.