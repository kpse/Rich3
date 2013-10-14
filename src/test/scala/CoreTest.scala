package example

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class CoreTest extends FunSuite {
  test("one plus one is two")(assert(Core.add(1, 2) == 3))
}