import java.lang.Math
        import kotlin.math.min
        import kotlin.math.max
        import kotlin.math.pow

fun main()
{
    try
    {
        //1 пример
        println("Ввведите x")
        var x = readLine()!!.toDouble()
        println("Ввведите y")
        var y = readLine()!!.toDouble()
        var z1 = (min(x, y) + 0.5) / (1 + Math.pow(max(x, y), 2.0))
        println("Результат первого примера:"+z1)

        //2 пример
        when(x<0)
        {
            true-> print("Результат второго примера:"+max(x,y))
            false->print("Результат второго примера:"+min(x,y))
        }
        //3 пример
        when(y>=0)
        {
            true-> print("Результат третьего примера: "+min(x,y))
            false->print("Результат третьего примера: "+max(Math.pow(x,2.0),Math.pow(y,2.0)))
        }
    }catch (e:Exception)
    {
        print("Некоррекотный тип данных")
    }
}