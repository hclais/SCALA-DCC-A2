class FruitSharon (var name : String , var price : Int) {
   var fruitype=0
}
class TestFunction {

  def isPrime(i: Int): Boolean =
    if (i <= 1)
        false
    else if (i == 2)
        true
    else
        !(2 until i).exists(n => i % n == 0)
  
  
  def sumPrice (eList : List[FruitSharon]) = {
    
    var sum = 0
    
    eList.foreach ( e => sum += e.price )
    sum
  }
}
object Main{
  def main (args: Array[String]): Unit = {
    var t = new TestFunction()
   
    var apple = new FruitSharon ("Apple", 1)
    apple.fruitype = 1
    var orange = new FruitSharon ("Orange", 2)
    orange.fruitype = 1
    var pineapple = new FruitSharon ("Pineapple", 8)
    pineapple.fruitype = 3
    
    val eList = List (apple, orange, pineapple)
    
    println("The sum of all fruits price is " + t.sumPrice(eList))
    
  } 
}