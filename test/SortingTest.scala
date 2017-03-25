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

  it should "should quick sort with partition3 for e case" in {
    val array = Array(3, 3, 4, 4, 4, 1, 1, 1, 1, 9, 9, 9)
    Sorting.randomizedQuickSort3(array,0,11)
    assert(array === Array(1,1,1,1,3,3,4,4,4,9,9,9))
  }

  it should "should quick sort with partition3 for f case" in {
    val array = Array(4, 9, 4, 4, 1, 9, 4, 4, 9, 4, 4, 1, 4)
    Sorting.randomizedQuickSort3(array,0,12)
    assert(array === Array(1,1,4,4,4,4,4,4,4,4,9,9,9))
  }

  it should "should quick sort with partition3 for g case" in {
    val array = Array(4,4)
    Sorting.randomizedQuickSort3(array,0,1)
    assert(array === Array(4,4))
  }

  it should "should quick sort with partition3 for h case" in {
    val array = Array.empty[Int]
    Sorting.randomizedQuickSort3(array,0,0)
    assert(array === Array())
  }

  it should "should quick sort with partition3 for i case" in {
    val array = Array(5, 2, 4, 2, 3, 2, 1, 2, 2, 2)
    Sorting.randomizedQuickSort3(array,0,9)
    assert(array === Array(1,2,2,2,2,2,2,3,4,5))
  }

  it should "should quick sort with partition3 for j case" in {
    val array = Array.fill(100000)(1000000000)
    val expectedArray = array.clone()
    Sorting.randomizedQuickSort3(array,0,9)
    assert(array === expectedArray)
  }

}
