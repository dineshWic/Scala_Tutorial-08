case class Point(a:Int,b:Int){
  var x:Int = a
  var y:Int = b

  //adding two points
  def +(p:Point): Point = Point(p.x+x,p.y +y)

  //move the point
  def move(dx:Int,dy:Int): Unit ={
    x = this.x + dx
    y = this.y + dy
    //println(x,y)
  }

  //get the distance
  def distance(p:Point): Double = Math.sqrt(Math.pow(p.x-x,2) + Math.pow(p.y-y,2))

  //exchanging the points
  def invert(): Unit ={
    val temp = x
    x=y
    y=temp
    //println(x,y)
  }

}
object Q1 extends App{
  //create objects
  var p1 = Point(10,20)
  var p2 = Point(3,5)

  //call the functions in class
  println("point p1 = ",p1)
  println("point p2 = ",p2)

  println("p1 + p2 = ", (p1 + p2))

  p1.move(5,5)
  println("After move (5,5) :"+ "("+ p1.x,p1.y+ ")")

  println("Distance between p1 and p2: ",p1.distance(p2))

  p1.invert()
  println("After invert:"+ "("+ p1.x,p1.y+ ")")

}