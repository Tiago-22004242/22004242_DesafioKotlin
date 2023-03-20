package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel


class Bicicleta(override val identificador : String): Veiculo(identificador),Movimentavel{
    override fun requerCarta(): Boolean {
       return false
    }
    override fun toString(): String {
        return "Bicicleta | $identificador | $dataDeAquisicao | $posicao"
    }
    override fun moverPara(x: Int, y: Int) {
        posicao.x = x
        posicao.y = y
    }
}