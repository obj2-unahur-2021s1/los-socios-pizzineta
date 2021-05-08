package ar.edu.unahur.obj2.socios

class Cliente(val estadoDeAnimo: EstadosDeAnimo, val barrio: Barrio, val dineroEnBolsillo: Int, val unPedido: Pedido) {
    fun propinaEstadoDeAnimo() = estadoDeAnimo.valorDePropina(unPedido, this)
}

