fun main(parametros: Array<String>) {
    do {
        do {
            print("Ingresa tu edad: ")
            val edad = readln().toInt()
            if (edad >= 18)
                print("Acceso permitido")
            else if (edad <= 0)
                print("Edad no permitida")
            else
                println("Acceso denegado")
        } while (edad <= 0)
        print("Presiona 1 y enter si quieres repetir el codigo, si no solo coloca otro  numero y presiona enter: ")
        val edad1 = readln().toInt()
    }while (edad1 == 1)
}