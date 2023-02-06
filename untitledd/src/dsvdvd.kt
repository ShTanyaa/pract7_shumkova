fun main(){
    //1 задание
//6(8)
   /* println("введите а")
    val a:Double= readLine()!!.toDouble()
    println("введите b")
    val b:Double= readLine()!!.toDouble()
    println("введите c")
    val c:Double= readLine()!!.toDouble()
    println("введите d")
    val d:Double= readLine()!!.toDouble()
    println("введите n")
    val n:Double= readLine()!!.toDouble()
    when{
        a==b-> println("y=0")
        c==d-> println("y=0")
        a>b-> println("y="+(0.25*(a-b))/((1.0/8.0)-(Math.abs(b)/(Math.pow((10.0),n+3.0)+(Math.log10(b)/c-d)))))
        a<b-> println("y="+(0.25*(a-b))/((1.0/8.0)-(Math.abs(b)/(Math.pow((10.0),n+3.0)+(Math.log10(b)/c-d)))))
    }

    //1
    println("введите a1")
    val a1:Double= readLine()!!.toDouble()
    println("введите a5")
    val a5:Double= readLine()!!.toDouble()
    println("введите n")
    val N:Double= readLine()!!.toDouble()
    val D:Double=(a5-a1)/4
    val an:Double=a1+(N-1)*D
    val sum:Double=((a1+an)*N)/2
    println("n-ый член прогрессии:"+ an)
    println("сумма первых n членов прогрессии:"+sum)

    //24
    println("введите длину волны")
    val l:Double=readLine()!!.toDouble()
    println("введите температуру ")
    val T:Double=readLine()!!.toDouble()
    println("введите e ")
    val e:Double=readLine()!!.toDouble()
    val C:Double=2.997924*Math.pow((10.0), (-8.0))
    val H:Double=6.6252*Math.pow((10.0), (-34.0))
    val B:Double=5.6687*Math.pow((10.0),(-8.0))
    val E:Double=(2*(Math.PI)*C*H*(Math.pow(l,(-8.0))))/(Math.pow(e,(C*H/B*l*T))-1)
    println(String.format("%.3f" ,"E="+ E))*/

    //2 задание
    println("введите а")
    val a2= readLine()!!.toDouble()
    println("введите b")
    val b2= readLine()!!.toDouble()
    when{
        a2<=b2-> println("a=0"+' '+"b="+  b2)
        a2>b2->println("a= "+ a2 +' '+"b="+b2)
    }

    //18
    println("введите а")
    val aa= readLine()!!.toDouble()
    println("введите b")
    val bb= readLine()!!.toDouble()
    println("введите x")
    val x= readLine()!!.toDouble()
    println("введите y")
    val y= readLine()!!.toDouble()
    println("введите z")
    val z= readLine()!!.toDouble()
    if((aa>=x && bb>=y)||(aa>=y && bb>=x)||(aa>=x && bb>=z)||(aa>=z && bb>=x)||(aa>=z && bb>=y)||(aa>=y && bb>=z)){
        println("пройдет")
    }
    else{
        println("не пройдет")
    }

    //28
    println("введите а")
    val a3= readLine()!!.toDouble()
    println("введите b")
    val b3= readLine()!!.toDouble()
    println("введите c")
    val c3= readLine()!!.toDouble()
    println("введите d")
    val d3= readLine()!!.toDouble()
    println("введите e")
    val e3= readLine()!!.toDouble()
    println("введите f")
    val f= readLine()!!.toDouble()
    val x1:Double=(f*b3+e3*c3)/(d3*b3+a3*e3)
    println("x="+ x1)
    println("y="+((c3-a3*x1)/b3))


    //38
    println("введите а")
    val aa1= readLine()!!.toDouble()
    println("введите b")
    val bb1= readLine()!!.toDouble()
    println("введите c")
    val cc1= readLine()!!.toDouble()
    println("введите d")
    val dd1= readLine()!!.toDouble()


    //42
    println("введите а")
    val a4= readLine()!!.toDouble()
    println("введите b")
    val b4= readLine()!!.toDouble()
    println("введите c")
    val cc= readLine()!!.toDouble()
    val D1:Double=b4*b4-4*a4*cc
    when{
        D1>0->("x1="+((-b4+Math.sqrt(D1))/2*a4)+' ' + "x2="+((-b4-Math.sqrt(D1))/2*a4))
        //D==0->("x1="+(-b/2*a))
        D1<0->println("корней нет")
}
}
