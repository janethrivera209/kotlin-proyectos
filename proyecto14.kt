fun main(parametro: Array<String>) {
    print("Ingrese un valor comprendido entre 1 y 99:")
    val num = readln().toInt()
    if (num < 10)
        println("Tiene un dígito")
    else
        println("Tiene dos dígitos")
}
