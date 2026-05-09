//Distancia entre los dos puntos
import kotlin.math.pow

fun main(){
    val x1 = 3
    val y1 = 9

    val x2 = 8
    val y2 = 4
   
    val distancia = (
        (x2 - x1).toDouble().pow(2) +
        (y2 - y1).toDouble().pow(2)
    ).pow(0.5)

    println("La distancia entre es $distancia")
}