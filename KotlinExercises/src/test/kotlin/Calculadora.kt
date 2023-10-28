class Calculadora {
    // Soma
    fun calcular(numero1: Int, numero2: Int): Int {
        return numero1 + numero2
    }

    fun calcular(numero1: Double, numero2: Double): Double {
        return numero1 + numero2
    }

    // Subtração
    fun calcularSubtracao(numero1: Int, numero2: Int): Int {
        return numero1 - numero2
    }

    fun calcularSubtracao(numero1: Double, numero2: Double): Double {
        return numero1 - numero2
    }

    // Multiplicação
    fun calcularMultiplicacao(numero1: Int, numero2: Int): Int {
        return numero1 * numero2
    }

    fun calcularMultiplicacao(numero1: Double, numero2: Double): Double {
        return numero1 * numero2
    }

    // Divisão
    fun calcularDivisao(numero1: Int, numero2: Int): Double {
        if (numero2 == 0) {
            throw ArithmeticException("Divisão por zero não é permitida.")
        }
        return numero1.toDouble() / numero2.toDouble()
    }

    fun calcularDivisao(numero1: Double, numero2: Double): Double {
        if (numero2 == 0.0) {
            throw ArithmeticException("Divisão por zero não é permitida.")
        }
        return numero1 / numero2
    }
}

fun main() {
    val calculadora = Calculadora()

    println("Soma (Inteiros): ${calculadora.calcular(5, 3)}")
    println("Soma (Duplos): ${calculadora.calcular(5.5, 3.3)}")

    println("Subtração (Inteiros): ${calculadora.calcularSubtracao(10, 4)}")
    println("Subtração (Duplos): ${calculadora.calcularSubtracao(10.5, 4.2)}")

    println("Multiplicação (Inteiros): ${calculadora.calcularMultiplicacao(7, 8)}")
    println("Multiplicação (Duplos): ${calculadora.calcularMultiplicacao(7.2, 8.5)}")

    try {
        println("Divisão (Inteiros): ${calculadora.calcularDivisao(12, 4)}")
        println("Divisão (Duplos): ${calculadora.calcularDivisao(12.6, 3.0)}")
    } catch (e: ArithmeticException) {
        println("Erro: ${e.message}")
    }
}
