package service

class Calculadora: RealizarOperaciones {

    override fun sumar(num1: Double, num2: Double): Double {
        return num1+num2
    }

    override fun restar(num1: Double, num2: Double): Double {
        return num1-num2
    }

    override fun dividir(num1: Double, num2: Double): Double {
        if (num2 == 0.0) throw IllegalArgumentException("No se puede dividir por 0") else return num1*num2
    }

    override fun multiplicar(num1: Double, num2: Double): Double {
        return num1*num2
    }
}