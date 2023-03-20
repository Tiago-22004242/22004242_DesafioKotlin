package pt.ulusofona.cm.kotlin.challenge.models
import java.util.Date


abstract class Veiculo (open val identificador : String){
    var posicao : Posicao = Posicao(0,0)
    var dataDeAquisicao : Date = Date()
    fun setDataAquisicao() {
        dataDeAquisicao = Date()
    }
    abstract fun requerCarta() : Boolean
}