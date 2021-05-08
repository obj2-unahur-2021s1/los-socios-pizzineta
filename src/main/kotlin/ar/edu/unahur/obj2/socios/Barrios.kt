package ar.edu.unahur.obj2.socios

abstract class Barrio(){
    abstract fun propinaSegunBarrio(unPedido : Pedido, unCliente: Cliente): Int
}

object LasRosas: Barrio(){
    override fun propinaSegunBarrio(unPedido: Pedido, unCliente: Cliente) =
        unCliente.propinaEstadoDeAnimo() + 50
}

object LasLauchas: Barrio(){
    override fun propinaSegunBarrio(unPedido: Pedido, unCliente: Cliente) =
        unCliente.propinaEstadoDeAnimo() / 2
}
object BarrioVerde: Barrio(){
    override fun propinaSegunBarrio(unPedido: Pedido, unCliente: Cliente) =
        if (unCliente.propinaEstadoDeAnimo() > 200) {
            unCliente.propinaEstadoDeAnimo()
        } else {
            200
        }

}
object LasTorres: Barrio(){
    override fun propinaSegunBarrio(unPedido: Pedido, unCliente: Cliente) =
        unCliente.propinaEstadoDeAnimo()
}