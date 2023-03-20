package pt.ulusofona.cm.kotlin.challenge

class Motor(private val cavalos : Int , private val cilindrada : Int) {
    private val ligado : Boolean = false
    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }
}