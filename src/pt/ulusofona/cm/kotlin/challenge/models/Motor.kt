package pt.ulusofona.cm.kotlin.challenge.models

class Motor(private val cavalos : Int , private val cilindrada : Int) {
    private val ligado : Boolean = false
    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }
}