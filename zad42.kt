import kotlin.math.sqrt
import kotlin.math.pow

fun main()
{
    try {


    var a = readLine()!!.toDouble()
    var b = readLine()!!.toDouble()
    var c = readLine()!!.toDouble()

    val d = b.pow(2) - 4 * a * c

    if (d > 0) {
        val x1 = (-b + sqrt(d)) / (2 * a)
        val x2 = (-b - sqrt(d)) / (2 * a)
        println("Уравнение имеет два действительных корня: x1 = $x1, x2 = $x2")
    }
    else if (d == 0.0)
    {
        val x = -b / (2 * a)
        println("Уравнение имеет один действительный корень: x = $x")
    }
    else     {
        println("Уравнение не имеет действительных корней")
    }
    }catch (e:Exception)
    {
        print("Некоррекотный тип данных")
    }
}