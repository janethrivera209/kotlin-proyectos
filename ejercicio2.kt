fun main(parametro: Array<String>) {
    do{
    print("Ingrese un valor para sacar su factorial: ")
    val valor = readln().toInt()
    var y = 1
    var x = 1
    while (y <= valor) {
        x = x * y
        y++
    }
    print("El factorial de $valor es $x ")
        print("Presiona 1 y enter si quieres repetir el codigo, si no solo coloca otro  numero y presiona enter: ")
        val valor2 = readln().toInt()
    }while (valor2 == 1)
}