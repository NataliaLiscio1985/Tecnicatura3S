from NumeronIgualesException import NumerosIgualesException

resultado = None

try:
    a = int(input('Digite el primer numero'))
    b = int(input('Digite el segundo numero'))
    if a == b:
        raise NumerosIgualesException('Son numeros iguales')
    resultado = a/b
except TypeError as e:
    print(f' TypeError - Ocurrio un error: {type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrio un error: {type(e)}')
except Exception as e:
    print(f'Exception - Ocurrio un error: {type(e)}')
else:
    print(f'No se arrojo ninguna Excepcion') # bloque opcional, se ejecuta SOLO cuando no hubo excepciones
finally:
    print('Ejecucion de este bloque finally') # bloque final, siempre se ejecuta, haya o no excepciones
print(f'El resultado es: {resultado}')
print('seguimos...')








