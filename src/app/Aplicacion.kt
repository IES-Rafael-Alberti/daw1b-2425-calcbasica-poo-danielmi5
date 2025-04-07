package app

import com.sun.net.httpserver.Authenticator.Failure
import service.RealizarOperaciones
import ui.EntradaSalida

class Aplicacion(val calculadora : RealizarOperaciones, val ui: EntradaSalida) {
    fun ejecutar(){
        var terminar = false
        while (terminar == true){
            val numero1 = ui.pedirDouble("Introduce el primer número:")
            val operador = ui.pedirOperador("Introduce el operador (+, -, *, /):")
            val numero2 = ui.pedirDouble("Introduce el segundo número:")

            val resultado = when (operador) {
                '+' -> numero1 + numero2
                '-' -> numero1 - numero2
                '*' -> numero1 * numero2
                '/' -> numero1 / numero2
                else -> "Operador no válido"
            }
        }
    }


}