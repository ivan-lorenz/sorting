import org.scalacheck.Prop.forAll
import org.scalacheck.{Gen, Properties}

object SortingCheck extends Properties("Sorting"){

  val genNumbers: Gen[Int] = Gen.choose(1, 1000)
  val listOfNumbers: Gen[Array[Int]] =
    for {
      size <- Gen.choose(1,100)
      elems <- Gen.containerOfN[Array, Int](size, genNumbers)
    } yield elems

  property("both solutions should be equivalent") =
    forAll(listOfNumbers){list  =>
      val original = list
      val array1 = list.clone()
      val array2 = list.clone()
      Sorting.randomizedQuickSort(array1, 0, list.length - 1)
      Sorting.randomizedQuickSort3(array2,0,list.length - 1)
      val assertion = array1.sameElements(array2)
      if (!assertion)
        System.out.println(s"ERROR for original : ${original.mkString(",")}, expected result : ${array1.mkString(",")} and actual result : ${array2.mkString(",")}")
      assertion
    }

}
