# Clasificación de riesgo crediticio usando if-else anidados

ingreso = float(input("Ingrese el ingreso mensual: "))
historial = input("Ingrese el historial crediticio (bueno, regular, malo): ").lower()
edad = int(input("Ingrese la edad: "))

# Evaluación del riesgo
if historial == "bueno":
    if ingreso >= 3000:
        if edad >= 21:
            print("Bajo riesgo")
        else:
            print("Medio riesgo")
    else:
        print("Medio riesgo")

elif historial == "regular":
    if ingreso >= 2000:
        if edad >= 21:
            print("Medio riesgo")
        else:
            print("Alto riesgo")
    else:
        print("Alto riesgo")

else:  # historial malo
    print("Alto riesgo")