object salary{
    def main(args: Array[String]): Unit = {
        
        def normal_WorkingHour(h1:Int):Int = {
            h1*250
        }

        def overtime(h2:Int): Int ={
            h2 * 85
        }

        def income(h1:Int,h2:Int): Double={
            normal_WorkingHour(h1)+ overtime(h2)
        }
        def tax(income:Double):Double = {
            income*.12
        }

        def takeHomesalary(h1:Int,h2:Int): Double={
            income(h1,h2)-tax(income(h1,h2))
        }

        println(takeHomesalary(40,30))
    }
}