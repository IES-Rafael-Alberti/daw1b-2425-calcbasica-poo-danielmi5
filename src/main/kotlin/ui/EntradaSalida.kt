package ui

import model.Operaciones

interface EntradaSalida {
    fun mostrar(msj: String, salto: Boolean = true)
    fun pedirCadena(msj: String): String
    fun pedirInt(msj: String): Int
    fun pedirDouble(msj: String): Double
    fun pedirOperador(msj: String): Operaciones
    fun preguntar(msj: String): Boolean
}