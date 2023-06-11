from ManejoArchivos import *

#MANEJO DE CONTEXTO WITH: sintaxis simplificada, abre y cierra el archivo
#with open('prueba.txt', 'r', encoding='utf8') as archivo:
    #print(archivo.read())
# No hace falta ni el try, ni el finally
# en este contexto lo que se ejecuta de manera automatica
# utiliza diferentes metodos: __enter__ (abre)
# Metodo cierre: __exit__

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())