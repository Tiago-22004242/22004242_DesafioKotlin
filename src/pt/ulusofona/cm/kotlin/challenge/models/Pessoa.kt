package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challenge.exceptions.PessoaSemCartaException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import java.util.*
import java.text.SimpleDateFormat


class Pessoa ( val nome : String,  val dataNascimento: Date){
     val veiculos : MutableList<Veiculo> = mutableListOf()
     var carta: Carta? = null
     var posicao: Posicao = Posicao(0,0)

     fun comprarVeiculo(veiculo: Veiculo) {
          veiculos.add(veiculo)
     }
     fun pesquisarVeiculo(identificador: String) : Veiculo {
          for(veiculo : Veiculo in veiculos) {
               if(veiculo.identificador.equals(identificador)) {
                    return veiculo
               }
          }
          throw VeiculoNaoEncontradoException()
     }
     fun venderVeiculo(identificador: String, comprador : Pessoa) {
          var veiculo : Veiculo = pesquisarVeiculo(identificador)
          veiculo.setDataAquisicao()
          comprador.veiculos.add(veiculo)
          veiculos.remove(veiculo)
     }
     fun moverVeiculoPara(identificador: String, x: Int, y: Int) {
          var veiculo : Veiculo = pesquisarVeiculo(identificador)
          if (veiculo.requerCarta() && this.carta == null) {
               throw PessoaSemCartaException(nome)
          } else {
               veiculo.posicao.alterarPosicao(x,y)
          }
     }
     fun temCarta() : Boolean{
          return this.carta != null
     }
     fun tirarCarta() {
          if(calcularIdade(dataNascimento) >= 18) {
               this.carta = Carta()
          } else {
               throw MenorDeIdadeException()
          }
      }
     fun calcularIdade(birthDate: Date): Int {
          val now = Calendar.getInstance()
          val dob = Calendar.getInstance()
          dob.time = birthDate
          var age = now.get(Calendar.YEAR) - dob.get(Calendar.YEAR)
          if (now.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
               age--
          }
          return age
     }
     fun dataFormatada() : String {
          val formato = SimpleDateFormat("dd-MM-yyyy")
          val dataModificada = formato.format(dataNascimento)
          return dataModificada.toString()
     }
     override fun toString(): String {
          return "Pessoa | $nome | ${dataFormatada()} | ${posicao.toString()}"
     }
}