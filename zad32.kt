fun main()
{
    try {
        println("Введите mX1,mX2,mY1,mY2:")
        var mX1 = readLine()!!.toDouble()
        var mY1 = readLine()!!.toDouble()
        var mX2 = readLine()!!.toDouble()
        var mY2 = readLine()!!.toDouble()
        println("Введите nX1,nX2,nY1,nY2:")
        var nX1 = readLine()!!.toDouble()
        var nY1 = readLine()!!.toDouble()
        var nX2 = readLine()!!.toDouble()
        var nY2 = readLine()!!.toDouble()

        val levo = if (mX1 > nX1) mX1 else nX1
        val pravo = if (mX2 < nX2) mX2 else nX2
        val dno = if (mY1 > nY1) mY1 else nY1
        val vershina = if (mY2 < nY2) mY2 else nY2

        val shirina = pravo - levo
        val visota = vershina - dno

        val peresechenie = if (shirina > 0 && visota > 0) shirina * visota else 0.0
        println("Площадь пересечения двух прямоугольников: $peresechenie")
    }
    catch (e:Exception)
    {
        print("Некоррекотный тип данных")
    }
}