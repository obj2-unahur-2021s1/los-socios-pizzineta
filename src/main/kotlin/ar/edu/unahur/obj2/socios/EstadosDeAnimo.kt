package ar.edu.unahur.obj2.socios

abstract class EstadosDeAnimo() {
    abstract fun valorDePropina(unPedido : Pedido, unCliente: Cliente): Double
}

object Enojado: EstadosDeAnimo(){
    override fun valorDePropina(unPedido : Pedido, unCliente: Cliente): Double {
        return 0.0
    }
}

object Feliz: EstadosDeAnimo() {
    override fun valorDePropina(unPedido: Pedido, unCliente: Cliente): Double {
        return unPedido.importe * 0.25
    }
}
object Indiferente: EstadosDeAnimo() {
    override fun valorDePropina(unPedido: Pedido, unCliente: Cliente): Double{
        return unCliente.dineroEnBolsillo.toDouble()
    }
}

object Resfriado: EstadosDeAnimo() {
    override fun valorDePropina(unPedido: Pedido, unCliente: Cliente): Double {
        return unPedido.importe.toDouble()
    }
}