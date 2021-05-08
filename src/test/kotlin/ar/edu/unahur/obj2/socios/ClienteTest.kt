package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.doubles.shouldBeZero
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    describe("Propina segun estado de animo"){

      val pedido1 = Pedido(233)
      val pedido2 = Pedido(335)
      val pedido3 = Pedido(700)
      val pedido4 = Pedido(524)
      val alan = Cliente(Enojado, LasTorres, 355, pedido1)
      val antonio = Cliente(Feliz, LasRosas, 575, pedido2)
      val barbi = Cliente(Resfriado, LasLauchas, 10000, pedido3)
      val victor = Cliente(Indiferente, BarrioVerde, 530, pedido4)

      it("La propina si Alan esta enojado deberia ser 0"){
        alan.propinaEstadoDeAnimo().shouldBe(0)
      }
      it("La propina si antonio esta feliz deberia ser 83"){
        antonio.propinaEstadoDeAnimo().shouldBe(83)
      }
      it("La propina si barbi esta resfriada deberia ser 700"){
        barbi.propinaEstadoDeAnimo().shouldBe(700)
      }
      it("La propina si victor esta indiferente deberia ser 530"){
        victor.propinaEstadoDeAnimo().shouldBe(530)
      }
    }






  }


})
