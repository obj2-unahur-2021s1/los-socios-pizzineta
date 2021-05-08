package ar.edu.unahur.obj2.socios

abstract class EstadosDeAnimo() {
    abstract fun valorDePropina(unPedido : Pedido, unCliente: Cliente): Int
}

object Enojado: EstadosDeAnimo(){
    override fun valorDePropina(unPedido : Pedido, unCliente: Cliente) = 0
}

object Feliz: EstadosDeAnimo() {
    override fun valorDePropina(unPedido: Pedido, unCliente: Cliente) =
        (unPedido.importe * 0.25).toInt()
}
object Indiferente: EstadosDeAnimo() {
    override fun valorDePropina(unPedido: Pedido, unCliente: Cliente) =
        unCliente.dineroEnBolsillo
}

object Resfriado: EstadosDeAnimo() {
    override fun valorDePropina(unPedido: Pedido, unCliente: Cliente) =
        unPedido.importe
}