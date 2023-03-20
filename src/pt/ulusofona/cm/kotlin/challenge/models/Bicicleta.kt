package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel


class Bicicleta(override val identificador : String): Veiculo(identificador),Movimentavel{
    override fun requerCarta(): Boolean {
       return false
    }
    fun data() : String {
        return dataDeAquisicao.toString()
    }
    override fun toString(): String {
        return "Bicicleta | $identificador | ${data()} | $posicao"
    }
    override fun moverPara(x: Int, y: Int) {
        posicao.x = x
        posicao.y = y
    }
}