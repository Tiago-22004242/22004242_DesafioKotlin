package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.text.SimpleDateFormat

class Carro(override val identificador : String, val motor : Motor) : Veiculo(identificador), Movimentavel{
    override fun requerCarta(): Boolean {
       return true
    }
    override fun moverPara(x: Int, y: Int) {
        posicao.x = x
        posicao.y = y
    }
    fun dataFormatada() : String {
        val formato = SimpleDateFormat("dd-MM-yyyy")
        val dataModificada = formato.format(dataDeAquisicao)
        return dataModificada.toString()
    }
    override fun toString(): String {
        return "Carro | $identificador | ${dataFormatada()} | ${posicao.toString()}"
    }
}