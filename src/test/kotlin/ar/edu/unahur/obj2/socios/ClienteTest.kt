package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.doubles.shouldBeZero
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    it("Alan no da propina") {
      val pedido1 = Pedido(240)
      val alan = Cliente(Enojado, LasTorres, 615, pedido1)
      alan.propinaEstadoDeAnimo().shouldBe(0.0)
    }
  }
})
