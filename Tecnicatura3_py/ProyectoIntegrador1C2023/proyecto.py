if __name__ == '__main__':

    class Asistencia:
        def __init__(self, mes, presente, ausente):
            self.mes = mes
            self.presente = presente
            self.ausente = ausente


    class Integrante:
        def __init__(self, nombre, edad, rama):
            self.nombre = nombre
            self.edad = edad
            self.rama = rama
            self.asistencias = []

        def agregar_asistencia(self, asistencia):
            self.asistencias.append(asistencia)


    class GrupoScout:
        def __init__(self):
            self.integrantes = []

        def mostrar_menu(self):
            print("-------------------  MENU  -------------------")
            print("| 1. Cargar datos                              |")
            print("| 2. Cargar asistencias                        |")
            print("| 3. Mostrar la matriz con toda la informacion |")
            print("| 4. Mostrar el porcentaje de asistencias      |")
            print("| 5. Salir                                     |")
            print("' ----------------------------------------------")
            print("\nElegir la opcion deseada: ")

        def cargar_integrantes(self):
            cantidad_integrantes = int(input("Digite la cantidad de integrantes: "))

            for _ in range(cantidad_integrantes):
                nombre = input("Digite apellido y nombre completo: ")
                edad = int(input("Ingrese su edad: "))
                rama = ""
                if edad <= 10:
                    rama = "Manada"
                elif edad <= 13:
                    rama = "Unidad"
                elif edad <= 17:
                    rama = "Caminantes"
                elif edad <= 21:
                    rama = "Rovers"
                else:
                    rama = "Educadores"

                integrante = Integrante(nombre, edad, rama)
                self.integrantes.append(integrante)

        def pedir_mes(self):
            mes = int(input("Ingrese el mes que desea cargar: "))
            return mes

        def seleccionar_cant_sabados(self, mes):
            if mes == 12:
                return 3
            elif mes in [4, 7, 10]:
                return 5
            else:
                return 4

        def registrar_asistencia(self):
            mes = self.pedir_mes()
            cant_sabados = self.seleccionar_cant_sabados(mes)

            for integrante in self.integrantes:
                asistencias = []
                for _ in range(cant_sabados):
                    asistencia_valida = False
                    while not asistencia_valida:
                        print(f"{_ + 1}° Sabado mes {mes}: Presente(1) - Ausente(0): ")
                        asistencia = int(input())
                        if asistencia == 0 or asistencia == 1:
                            asistencia_valida = True
                        else:
                            print("Opción inválida. Por favor, elija 0 o 1.")
                    asistencias.append(asistencia)
                integrante.agregar_asistencia(Asistencia(mes, asistencias.count(1), asistencias.count(0)))

        def mostrar_matriz(self):
            print("-------------------------------------------------------")
            print("               Asistencia Anual Scout 2022\n\n")
            print("  NOMBRE   EDAD    RAMA   MES: 4  5  6  7  8  9 10 11 12")

            for integrante in self.integrantes:
                print(f"  {integrante.nombre}    {integrante.edad}    {integrante.rama}    ", end="")
                for asistencia in integrante.asistencias:
                    print(f"  {asistencia.presente}/{asistencia.ausente} ", end="")
                print()

            print("-------------------------------------------------------")

        def mostrar_porcentaje_asistencias(self):
            mes = self.pedir_mes()
            total_presentes = 0
            total_ausentes = 0

            for integrante in self.integrantes:
                for asistencia in integrante.asistencias:
                    if asistencia.mes == mes:
                        total_presentes += asistencia.presente
                        total_ausentes += asistencia.ausente

            total_asistencias = total_presentes + total_ausentes

            if total_asistencias > 0:
                porcentaje_presentes = (total_presentes / total_asistencias) * 100
                porcentaje_ausentes = (total_ausentes / total_asistencias) * 100
                print(f"Porcentaje de asistencias en el mes {mes}:")
                print(f"Presentes: {porcentaje_presentes:.2f}%")
                print(f"Ausentes: {porcentaje_ausentes:.2f}%")
            else:
                print("No se encontraron asistencias para el mes seleccionado.")

        def ejecutar(self):
            opcion = 0

            while opcion != 5:
                self.mostrar_menu()
                opcion = int(input())

                if opcion == 1:
                    self.cargar_integrantes()
                elif opcion == 2:
                    self.registrar_asistencia()
                elif opcion == 3:
                    self.mostrar_matriz()
                elif opcion == 4:
                    self.mostrar_porcentaje_asistencias()
                elif opcion == 5:
                    print("¡Hasta luego!")
                else:
                    print("Opción inválida. Por favor, elija una opción válida.")


    grupo_scout = GrupoScout()
    grupo_scout.ejecutar()