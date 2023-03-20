package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.models.Posicao
import java.time.LocalDate


abstract class Veiculo (private val identificador : String){
    private var posicao : Posicao = Posicao(0,0)
    private var dataAquisicao : LocalDate = LocalDate.now()
    fun setDataAquisicao() {
        dataAquisicao = LocalDate.now()
    }
    fun getIdentificador() = identificador
    fun getPosicao() = posicao
    fun getDataAquisicao() = dataAquisicao.toString()
    abstract fun requerCarta() : Boolean
}