fun main(parametro: Array<String>) {
    var pares = 0
    var impares = 0
    print("Cuantos números ingresará:")
    val n = readln().toInt()
    var x = 1
    while (x <= n) {
        print("Ingrese el valor:")
        val valor = readln().toInt()
        if (valor % 2 == 0)
            pares = pares + 1
        else
            impares = impares + 1
        x = x + 1
    }
    println("Cantidad de pares: $pares")
    println("Cantidad de impares: $impares");
}