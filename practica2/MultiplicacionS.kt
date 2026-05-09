//Multiplicacion de a * b pero usando sumas 
fun main() {

    println("Ingrese el numero de la multiplicacion")
    val numero = readln().toInt()
    println("Ingrese las veces que multiplicará el numero")
    val veces = readln().toInt()

    var resultado = 0

    for(i in 1..veces){
        resultado += numero
    }

    println("Resultado: $resultado")
}