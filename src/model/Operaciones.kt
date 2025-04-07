package model

enum class Operaciones(operador: String) {
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
    }
}