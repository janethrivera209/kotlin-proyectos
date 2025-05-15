fun main(parametro: Array<String>) {
        print("Ingresa un numero: ")
        val n = readln().toInt()
        var p = true
        if (n <= 1)
            p = false
        else {
            var i = 2
            while (i <= n / 2) {
                if (n % i == 0) {
                    p = false
                    break
                }
                i++
            }
        }
        if (p) {
            println("$n es un numero primo")
        } else {
            println("$n no es un numero primo")
        }
    }



