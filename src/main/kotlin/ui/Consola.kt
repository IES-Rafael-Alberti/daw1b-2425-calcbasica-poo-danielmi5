package ui

import model.Operaciones
import java.util.Scanner

class Consola : EntradaSalida {

    private val scanner: Scanner = Scanner(System.`in`)

    override fun mostrar(msj: String, salto: Boolean){
        if (salto) println(msj) else print(msj)
    }

    override fun pedirCadena(msj: String): String {
        mostrar(msj, false)
        return scanner.next().trim()
    }

    override fun pedirDouble(msj: String): Double{
        var num : Double? = null
        do {
            mostrar(msj, false)
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
            mostrar(msj, false)
            try {
                num = scanner.nextInt()
            }catch (e: Exception){
                mostrar(e.message.toString())
            }
        } while (num == null)
        return num
    }

    override fun pedirOperador(msj: String): Operaciones {
        var input: String
        do {
            input = pedirCadena(msj)
            if (!Operaciones.verificarOperador(input)) mostrar("Debe pasar un operador válido")
        } while (!Operaciones.verificarOperador(input))
        return Operaciones.obtenerOperacion(input)
    }

    override fun preguntar(msj: String): Boolean {
        var resp: Boolean?
        do {
            resp = when (pedirCadena("$msj (s/n)").lowercase()) {
                "s" -> true
                "n" -> false
                else -> {
                    mostrar("**ERROR** -> La respuesta debe ser 's' o 'n'")
                    null
                }
            }
        } while (resp == null)

        return resp
    }


}