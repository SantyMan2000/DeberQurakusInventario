package com.pro.uce.edu.negocio;

public class PedidosService {

    private NotificadorMail notificador = new NotificadorMail();

    public void procesarPedido(Pedido pedido){
        System.out.println("Procesar pedido de" + pedido.getProducto());
        notificador.enviar("Pedido procesado correctamente");;
    }
}
