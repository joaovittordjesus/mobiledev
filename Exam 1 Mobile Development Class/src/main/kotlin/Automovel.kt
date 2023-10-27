abstract class Automovel(
    
    val fabricante: String,
    val fabricadoEm: Int,
    var kilometragem: Double,
    var sofreuPerda: Boolean = false
    
) {
    open fun setPerda() {
        sofreuPerda = true
    }

    override fun toString(): String {
        return "Fabricante: $fabricante, " +
                "Ano de fabricação: $fabricadoEm, " +
                "Kilometragem rodada: $kilometragem"
    }
}

class Mustang(
    fabricante: String,
    fabricadoEm: Int,
    kilometragem: Double,
    val potencia: Double,
    val litros: Double,
    val consumo: Double
) : Automovel(fabricante, fabricadoEm, kilometragem) {
    override fun toString(): String {
        return "${super.toString()}, Potência do Motor: $potencia"
    }
}

class GWM(
    fabricante: String,
    fabricadoEm: Int,
    kilometragem: Double,
    val potenciaGWM: Double,
    val autonomiaKm: Double,
    val tempoCargaMaximoHoras: Double
) : Automovel(fabricante, fabricadoEm, kilometragem) {
    override fun toString(): String {
        return "${super.toString()}, Potência do Motor Elétrico: $potenciaGWM"
    }
}

class Toyota(
    fabricante: String,
    fabricadoEm: Int,
    kilometragem: Double,
    val potenciaMustang: Double,
    val potenciaGWM: Double,
    val consumo: Double
) : Automovel(fabricante, fabricadoEm, kilometragem) {
    override fun toString(): String {
        return "${super.toString()}, Potência Total: ${potenciaMustang + potenciaGWM}"
    }
}

fun main() {
    try{
        val carroMustang = Mustang("EUA", 1993, 358672.0, 700.0, 8.0, 24.0)
        val carroGWM = GWM("China", 2023, 5303.0, 170.0, 300.0, 1.0)
        val carroToyota = Toyota("Japão", 2019, 8000.0, 100.0, 150.0, 15.0)

        carroMustang.setPerda()
        carroGWM.setPerda()
        carroToyota.setPerda()

        println("Carro a Combustão: ${carroMustang}")
        println("Carro Elétrico: ${carroGWM}")
        println("Carro Híbrido: ${carroToyota}")
    }catch(e: Exception){
        println("Erro: ${e.message}");
    }
}
