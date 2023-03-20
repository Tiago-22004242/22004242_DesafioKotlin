package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException

class Posicao(private var x : Int, private var y: Int) {
    fun alterarPosicao (x: Int, y: Int) {
        if (this.x == x && this.y == y) {
            throw AlterarPosicaoException()
        } else {
            this.x = x
            this.y = y
        }
    }
    fun getX() = x
    fun getY() = y

    override fun toString(): String {
        return "Posicao | x:$x | y:$y"
    }
}