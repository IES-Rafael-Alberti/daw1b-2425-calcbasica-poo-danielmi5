package service

import model.Operaciones

interface ServiceOperaciones {
    fun realizarOperación(num1: Double, num2: Double, operador: Operaciones): Double
}