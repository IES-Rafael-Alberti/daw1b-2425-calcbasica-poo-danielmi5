package model

enum class Operaciones(val operador: String) {
    SUMAR("+"),
    RESTAR("-"),
    DIVIDIR("/"),
    MULTIPLICAR("x");

    companion object{
        fun verificarOperador(input: String): Boolean{
            return when (input) {
                "+","-","*","/" -> true
                else -> false
            }
        }

        fun obtenerOperacion(input: String): Operaciones {
            return when (input) {
                "+" ->SUMAR
                "-" -> RESTAR
                "*"-> MULTIPLICAR
                "/" -> DIVIDIR
                else -> throw IllegalArgumentException("Error al obtener operador")
            }
        }
    }
}