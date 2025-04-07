package ui

interface EntradaSalida {
    fun mostrar(msj: String, salto: Boolean = false)
    fun pedirInt(msj: String): Int
    fun pedirDouble(msj: String): Double
    fun pedirOperador(msj: String): String
}