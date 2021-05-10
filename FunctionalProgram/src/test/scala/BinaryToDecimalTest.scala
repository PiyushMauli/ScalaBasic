import org.scalatest.flatspec.AnyFlatSpec

class BinaryToDecimalTest extends AnyFlatSpec{
  it should "match" in {
    assert(70.0==new Convert(100).convertBinaryToDecimal())
  }
  it should "match2" in {
    assert(6.0==new Convert(96).convertBinaryToDecimal())
  }
}
