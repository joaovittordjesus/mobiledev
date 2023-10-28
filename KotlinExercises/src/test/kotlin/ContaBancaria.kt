import java.util.Scanner

class ContaBancaria(val numeroConta: Int, var nomeTitular: String, var saldo: Double = 0.0) {
    // Construtor da classe bancária
    init {
        println("Conta criada com sucesso!")
        exibirDadosConta()
    }

    // Função para realizar um depósito
    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Depósito de R$$valor realizado com sucesso")
            exibirDadosConta()
        } else {
            println("Valor de depósito inválido!")
        }
    }

    // Função para realizar um saque
    fun sacar(valor: Double) {
        if (valor > 0) {
            if (saldo >= valor + 3) {
                saldo -= valor + 3
                println("Saque de R$$valor realizado com sucesso!")
                exibirDadosConta()
            } else {
                println("Saldo insuficiente para saque.")
            }
        } else {
            println("Valor de saque inválido")
        }
    }

    // Função para exibir os dados da conta
    fun exibirDadosConta() {
        println("Número da conta: $numeroConta")
        println("Nome titular: $nomeTitular")
        println("Saldo: $saldo")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Número da conta: ")
    val numeroConta = scanner.nextInt()
    scanner.nextLine()

    print("Nome do Titular: ")
    val nomeTitular = scanner.nextLine()

    print("Deseja fazer um depósito inicial? (s/n): ")
    val escolha = scanner.nextLine().toLowerCase().trim()

    val conta: ContaBancaria

    if (escolha == "s") {
        print("Valor do depósito inicial: R$")
        val valorDeposito = scanner.nextDouble()
        conta = ContaBancaria(numeroConta, nomeTitular, valorDeposito)
    } else {
        conta = ContaBancaria(numeroConta, nomeTitular)
    }

    while (true) {
        println("Opções:")
        println("1 - Realizar Depósito")
        println("2 - Realizar Saque")
        println("3 - Exibir Dados da Conta")
        println("4 - Sair")
        print("Escolha uma opção: ")

        when (scanner.nextInt()) {
            1 -> {
                print("Valor do depósito: R$")
                val valorDeposito = scanner.nextDouble()
                conta.depositar(valorDeposito)
            }
            2 -> {
                print("Valor do saque: R$")
                val valorSaque = scanner.nextDouble()
                conta.sacar(valorSaque)
            }
            3 -> conta.exibirDadosConta()
            4 -> return
            else -> println("Opção inválida.")
        }
    }
}
