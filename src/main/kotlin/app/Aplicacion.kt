package app

import model.Operaciones
import service.ServiceOperaciones
import ui.EntradaSalida

class Aplicacion(val gestorOperaciones : ServiceOperaciones, val ui: EntradaSalida) {
    fun ejecutar(){
        var terminar = false
        while (terminar == false){
            try {
                val numero1 = ui.pedirDouble("Introduce el primer número >>")
                val operador = ui.pedirOperador("Introduce el operador (+, -, *, /) >>")
                val numero2 = ui.pedirDouble("Introduce el segundo número >>")

                ui.mostrar("$numero1 ${operador.operador} $numero2 = ${gestorOperaciones.realizarOperación(numero1, numero2, operador)}")

            } catch (e: Exception){
                ui.mostrar("ERROR al realizar la operación -> ${e.message}")
            }

            if(!ui.preguntar("\n¿Quieres realizar otra operación?")) terminar = true

        }

        ui.mostrar("FIN DEL PROGRAMA")
    }


}