# Declaramos una variable

try:
    archivo = open('prueba.txt', 'w', encoding= 'utf8')  # comando para abrir archivo, de no existir, lo crea ('nombre.extension','se escribe?')
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txr. \n')
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución y producción\n')
    archivo.write('Los significados de las letras: \nr= read\na=append\nw=write\nx=crea, ')
    archivo.write('\nt= texto\nb=binarios\nw+=escribir y leer\nr+=leer y escribir, ')
    archivo.write('Saludos a todos los alumnos de la tecnicatura\n')
    archivo.write('Con esto terminamos\n')
except Exception as e:
    print(e)
finally:
    archivo.close() # Siempre hay que cerrar los archivos
# archivo.write ('Todo quedo perfecto'): no se puede escribir un archivo cerrado, hay que abrirlo nuevamente.

