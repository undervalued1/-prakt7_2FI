import kotlin.math.min
import kotlin.math.max
import kotlin.math.pow
import kotlin.math.abs
import kotlin.math.sqrt
import kotlin.math.ln
import kotlin.math.sin
fun main()
{
try {
        print("k:")
        var k= readLine()!!.toInt()
        print("l:")
        var l= readLine()!!.toInt()
        print("m:")
        var m= readLine()!!.toInt()
        print("x:")
        var x= readLine()!!.toDouble()

        when(m==min(k,l))
        {
            true->{
                print("y(x)="+(Math.sin(Math.abs(x))/Math.sqrt(Math.pow(x,2.0)+1)))
                 var y=(Math.sin(Math.abs(x))/Math.sqrt(Math.pow(x,2.0)+1)).toDouble()
                println("z(x)="+(Math.pow(y,4.0)-(Math.pow(y,2.0)+5)))
            }
        }
        when(m==max(k,l))
        {
            true->{
                print("y(x)="+Math.abs(x)*ln(1+x))
                var y=Math.abs(x)*ln(1+x).toDouble()
                println("z(x)="+(Math.pow(y,4.0)-(Math.pow(y,2.0)+5)))
            }

        }
        when(m in min(k,l)..max(k,l))
        {
            true->{print("y(x)="+Math.pow(x,3.0)+x+1/100)
                var y=Math.abs(x)*ln(1+x).toDouble()
                println("z(x)="+(Math.pow(y,4.0)-(Math.pow(y,2.0)+5)))
            }
        }
        when(!(m==min(k,l))&&!(m==max(k,l))&&!(m in min(k,l)..max(k,l)))
        {
            true->{
                print("y(x)=-1")
                var y=-1.toDouble()
                println("z(x)="+(Math.pow(y,4.0)-(Math.pow(y,2.0)+5)))
            }
        }

}catch (e:Exception)
    {
        print("Некоррекотный тип данных")
    }
}