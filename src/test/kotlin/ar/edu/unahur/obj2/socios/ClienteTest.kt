package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
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
      val barbi = Cliente(Resfriado, LasLauchas, 850, pedido3)
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
    describe("Propina total"){
      describe("Clientes de Las Rosas"){
        val pedido1 = Pedido(349)
        val franco = Cliente(Enojado, LasRosas, 390, pedido1)
        val felipe = Cliente(Indiferente, LasRosas, 239, pedido1)
        val micaela = Cliente(Feliz,LasRosas, 188, pedido1)
        val ezequiel = Cliente(Resfriado, LasRosas, 284, pedido1)

        it("La propina total de Franco de LasRosas debería ser 50") {
          franco.propinaTotal().shouldBe(50)
        }
        it("La propina total de Felipe de LasRosas debería ser 289") {
          felipe.propinaTotal().shouldBe(289)
        }
        it("La propina total de Micaela de LasRosas debería ser 137") {
          micaela.propinaTotal().shouldBe(137)
        }
        it("La propina total de Ezequiel de LasRosas debería ser 399") {
          ezequiel.propinaTotal().shouldBe(399)
        }
      }
      describe("Clientes de Las Lauchas"){
        val pedido1 = Pedido(450)
        val franco = Cliente(Enojado, LasLauchas, 880, pedido1)
        val felipe = Cliente(Indiferente, LasLauchas, 520, pedido1)
        val micaela = Cliente(Feliz,LasLauchas, 227, pedido1)
        val ezequiel = Cliente(Resfriado, LasLauchas, 266, pedido1)

        it("La propina total de Franco de LasLauchas debería ser 50") {
          franco.propinaTotal().shouldBe(0)
        }
        it("La propina total de Felipe de LasLauchas debería ser 260") {
          felipe.propinaTotal().shouldBe(260)
        }
        it("La propina total de Micaela de LasLauchas debería ser 56") {
          micaela.propinaTotal().shouldBe(56)
        }
        it("La propina total de Ezequiel de LasLauchas debería ser 225") {
          ezequiel.propinaTotal().shouldBe(225)
        }
      }
      describe("Clientes de Barrio Verde"){
        val pedido1 = Pedido(354)
        val franco = Cliente(Enojado, BarrioVerde, 445, pedido1)
        val felipe = Cliente(Indiferente, BarrioVerde, 219, pedido1)
        val micaela = Cliente(Feliz,BarrioVerde, 753, pedido1)
        val ezequiel = Cliente(Resfriado, BarrioVerde, 538, pedido1)

        it("La propina total de Franco de BarrioVerde debería ser 200") {
          franco.propinaTotal().shouldBe(200)
        }
        it("La propina total de Felipe de BarrioVerde debería ser 219") {
          felipe.propinaTotal().shouldBe(219)
        }
        it("La propina total de Micaela de BarrioVerde debería ser 200") {
          micaela.propinaTotal().shouldBe(200)
        }
        it("La propina total de Ezequiel de BarrioVerde debería ser 354") {
          ezequiel.propinaTotal().shouldBe(354)
        }
      }
      describe("Clientes de Las Torres"){
        val pedido1 = Pedido(85)
        val franco = Cliente(Enojado, LasTorres, 118, pedido1)
        val felipe = Cliente(Indiferente, LasTorres, 440, pedido1)
        val micaela = Cliente(Feliz,LasTorres, 138, pedido1)
        val ezequiel = Cliente(Resfriado, LasTorres, 200, pedido1)

        it("La propina total de Franco de LasTorres debería ser 0") {
          franco.propinaTotal().shouldBe(0)
        }
        it("La propina total de Felipe de LasTorres debería ser 440") {
          felipe.propinaTotal().shouldBe(440)
        }
        it("La propina total de Micaela de LasTorres debería ser 21") {
          micaela.propinaTotal().shouldBe(21)
        }
        it("La propina total de Ezequiel de LasTorres debería ser 85") {
          ezequiel.propinaTotal().shouldBe(85)
        }
      }
    }
  }
})
