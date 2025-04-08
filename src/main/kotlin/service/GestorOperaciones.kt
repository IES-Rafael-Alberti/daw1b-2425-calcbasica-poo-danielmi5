package service

import model.Operaciones
import model.RealizarOperaciones

class GestorOperaciones(private val calculador: RealizarOperaciones) : ServiceOperaciones {
    override fun realizarOperación(
        num1: Double,
        num2: Double,
        operador: Operaciones
    ): Double {
        return when (operador) {
            Operaciones.SUMAR -> calculador.sumar(num1, num2)
            Operaciones.RESTAR -> calculador.restar(num1, num2)
            Operaciones.MULTIPLICAR -> calculador.multiplicar(num1, num2)
            Operaciones.DIVIDIR -> calculador.dividir(num1, num2)
        }
    }
}