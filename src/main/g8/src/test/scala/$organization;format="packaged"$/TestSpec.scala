package $organization$

import org.scalatest.{Matchers, WordSpecLike}

class TestSpec extends WordSpecLike with Matchers {
  "A empty List" should {
    "be empty" in {
      List[Int]() shouldBe List.empty[Int]
    }
  }
}
