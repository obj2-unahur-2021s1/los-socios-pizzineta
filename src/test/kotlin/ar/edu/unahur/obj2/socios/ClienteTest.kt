package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.doubles.shouldBeZero
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    it("Alan no da propina") {
      val pedido1 = Pedido(233)
      val alan = Cliente(Resfriado, LasTorres, 615, pedido1)
      alan.propinaEstadoDeAnimo().shouldBe(233)
    }
  }
})
