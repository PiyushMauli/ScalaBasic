import org.scalatest.flatspec.AnyFlatSpec

class PaymentTest extends AnyFlatSpec{
//  461.44926337516637
  it should "match" in {
    assert(461.44926337516637==new PaymentCheck(10000,2,10).monthlyPayment())
  }
}
