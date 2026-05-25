adminusuario = input("Ingrese el usuario: ")
clave = input("Ingrese la contraseña: ")
edad = int(input("Ingrese su edad: "))

if usuario == "admin":
    if clave == "1234":
        if edad >= 18:
            print("Acceso permitido")
        else:
            print("Acceso denegado: menor de edad")
    else:
        print("Contraseña incorrecta")
else:
    print("Usuario incorrecto")