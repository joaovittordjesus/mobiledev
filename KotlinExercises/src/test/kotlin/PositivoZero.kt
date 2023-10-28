fun main() {
    var numero: Int
    var soma = 0
    var quantidade = 0
    var maior = Int.MIN_VALUE
    var menor = Int.MAX_VALUE
    var somaPares = 0
    var quantidadePares = 0
    var quantidadeImpares = 0

    do {
        print("Digite um número (ou 0 para sair): ")
        numero = readLine()?.toIntOrNull() ?: 0

        if (numero != 0) {
            soma += numero
            quantidade++

            if (numero > maior) {
                maior = numero
            }

            if (numero < menor) {
                menor = numero
            }

            if (numero % 2 == 0) {
                somaPares += numero
                quantidadePares++
            } else {
                quantidadeImpares++
            }
        }
    } while (numero != 0)

    val media = calcularMedia(soma, quantidade)
    val mediaPares = calcularMedia(somaPares, quantidadePares)

    println("Soma dos números: $soma")
    println("Quantidade de números digitados: $quantidade")
    println("Média dos números digitados: $media")
    println("Maior número digitado: $maior")
    println("Menor número digitado: $menor")
    println("Média dos números pares digitados: $mediaPares")
    println("Quantidade de números ímpares digitados: $quantidadeImpares")
}

fun calcularMedia(soma: Int, quantidade: Int): Double {
    if (quantidade == 0) {
        return 0.0
    }
    return soma.toDouble() / quantidade.toDouble()
}
