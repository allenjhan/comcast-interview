object ComcastInterview extends App{


  def countOccurrences(l: List[Integer], target: Integer): Integer = {
    l.foldLeft(0){ (acc, e) =>
      e match {
        case x if x == target => acc + 1
        case _ => acc
      }
    }
  }

  println(countOccurrences(List(1,2,4,2,4,7,3,2,4), 1))
  println(countOccurrences(List(1,2,4,2,4,7,3,2,4), 2))
  println(countOccurrences(List(1,2,4,2,4,7,3,2,4), 4))
  println(countOccurrences(List(1,2,4,2,4,7,3,2,4), 9))

  def countOcc2(l: List[Integer]): Map[Integer, Int] = {
    l.groupBy(identity).mapValues(_.size).toMap
  }

  println(countOcc2(List(1,2,4,2,4,7,3,2,4)))
}
