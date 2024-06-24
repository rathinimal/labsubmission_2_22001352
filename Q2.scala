object expression2{
    def main(args: Array[String]): Unit = {
        var a ,b,c,d :Int = 0
        a=2
        b=3
        c=4
        d=5

        var k : Float = 4.3f

        b = b-1 // for --b
        println(b)
        println(s"a) b*a+c*d = ${b*a+c*d}")

        d = d-1 // for d--
    
        println(a)
        a = a+1

        var g = 0
        println(-2*(g-k)+c)

        
        println(c)
        c= c+1

        c=c+1
        c= c*a
        println(c)
        println(c*a)
        a = a+1 // a++
        println(a)


    }
}