//19000091
//Assignment 5 - Case Class

object Case_Class {
    def main(args:Array[String]):Unit = {
      val point1 = Point(3, 7)
      val point2 = Point(15, 4)

      println("Point 1 = (3,7)")
      println("Point 2 = (15,4)")//This prints depends on the point value given to run the code
      println()

      println("Addition:")
      println(point1 + point2)
      println()

      val point3 = point1.move(16, 3)

      println("Move:")
      println(point3)
      println()

      println("Distance:")
      println(distance(point1, point2))
      println()

      val point4 = point1.invert()

      println("Invert:")
      println(point4)
      println()

    }

    val distance = (p1:Point, p2:Point) => Math.sqrt((Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2)).toDouble)

}

  case class Point(x:Int, y:Int){

    val + = (p:Point) => Point(this.x + p.x, this.y + p.y)

    val move = (dx:Int, dy:Int) => Point(this.x + dx, this.y + dy)

    val invert = () => Point(this.y, this.x)

    override def toString = "(" + this.x.toString() + ", " + this.y.toString() + ")"
  }

