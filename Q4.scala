object profit{
    def main(args: Array[String]): Unit = {
        def attendences(price:Int):Int = {
            120 +(15-price)/5*20
        }
        def income(price:Int):Int = {
            attendences(price)* price
        }

        def expenses(price:Int):Int ={
            500+attendences(price)
        }

        def profit(price:Int):Int = {
            income(price) - expenses(price)
        }

        var y = profit(20)
        printf(s"The profit is: $y")
    }
}