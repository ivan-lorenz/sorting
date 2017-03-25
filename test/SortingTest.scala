import org.scalatest.FlatSpec

class SortingTest extends FlatSpec {

  behavior of "Sorting"

  it should "should quick sort with partition3 for a case" in {
    val array = Array(2, 3, 9, 2, 2)
    Sorting.randomizedQuickSort3(array,0,4)
    assert(array === Array(2,2,2,3,9))
  }

  it should "should quick sort with partition3 for b case" in {
    val array = Array(3,1,3)
    Sorting.randomizedQuickSort3(array,0,2)
    assert(array === Array(1,3,3))
  }

  it should "should quick sort with partition3 for c case" in {
    val array = Array(530,22,530)
    Sorting.randomizedQuickSort3(array,0,2)
    assert(array === Array(22,530,530))
  }

  it should "should quick sort with partition3 for d case" in {
    val array = Array(422,422,497,2)
    Sorting.randomizedQuickSort3(array,0,3)
    assert(array === Array(2,422,422,497))
  }

}
