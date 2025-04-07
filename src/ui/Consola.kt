package ui

import model.Operaciones
import java.util.Scanner

class Consola : EntradaSalida {

    private val scanner: Scanner = Scanner(System.`in`)

    override fun mostrar(msj: String, salto: Boolean){
        if (salto) println(msj) else print(msj)
    }

    override fun pedirDouble(msj: String): Double{
        var num : Double? = null
        do {
            mostrar(msj)
            try {
                num = scanner.nextDouble()
            }catch (e: Exception){
                mostrar(e.message.toString())
            }
        } while (num == null)
        return num
    }

    override fun pedirInt(msj: String): Int {

        var num : Int? = null
        do {
            mostrar(msj)
            try {
                num = scanner.nextInt()
            }catch (e: Exception){
                mostrar(e.message.toString())
            }
        } while (num == null)
        return num
    }

    override fun pedirOperador(msj: String): String {
        var input: String
        do {
            mostrar(msj)
            input = scanner.nextLine()
            if (!Operaciones.verificarOperador(input)) mostrar("Debe pasar un operador válido")
        } while (!Operaciones.verificarOperador(input))
        return input
    }


}