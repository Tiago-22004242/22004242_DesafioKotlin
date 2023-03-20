package pt.ulusofona.cm.kotlin.challenge.models
import java.time.LocalDate


abstract class Veiculo (open val identificador : String){
    var posicao : Posicao = Posicao(0,0)
    var dataDeAquisicao : LocalDate = LocalDate.now()
    fun setDataAquisicao() {
        dataDeAquisicao = LocalDate.now()
    }
    abstract fun requerCarta() : Boolean
}