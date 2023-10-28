class Pessoa(val nome: String, val idade: Int, val peso: Double, val altura: Double) {
    fun mostrarNome() {
        println("Nome: $nome")
    }

    fun mostrarIdade() {
        println("Idade: $idade anos")
    }

    fun mostrarPeso() {
        println("Peso: $peso kg")
    }

    fun mostrarAltura() {
        println("Altura: $altura m")
    }

    fun calcularIMC(): Double {
        return peso / (altura * altura)
    }

    fun situacaoIMC(): String {
        val imc = calcularIMC()
        return when {
            imc < 18.5 -> "Abaixo do peso"
            imc < 24.9 -> "Peso normal"
            imc < 29.9 -> "Sobrepeso"
            imc < 34.9 -> "Obesidade grau I"
            imc < 39.9 -> "Obesidade grau II"
            else -> "Obesidade grau III"
        }
    }
}

fun main() {
    val pessoa1 = Pessoa("Maria", 30, 65.5, 1.75)
    val pessoa2 = Pessoa("João", 40, 80.0, 1.80)

    println("Dados da Pessoa 1:")
    pessoa1.mostrarNome()
    pessoa1.mostrarIdade()
    pessoa1.mostrarPeso()
    pessoa1.mostrarAltura()
    val imcPessoa1 = pessoa1.calcularIMC()
    println("IMC: $imcPessoa1 - Situação: ${pessoa1.situacaoIMC()}")

    println("\nDados da Pessoa 2:")
    pessoa2.mostrarNome()
    pessoa2.mostrarIdade()
    pessoa2.mostrarPeso()
    pessoa2.mostrarAltura()
    val imcPessoa2 = pessoa2.calcularIMC()
    println("IMC: $imcPessoa2 - Situação: ${pessoa2.situacaoIMC()}")
}
