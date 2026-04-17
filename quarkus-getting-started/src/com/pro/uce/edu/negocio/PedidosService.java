package com.pro.uce.edu.negocio;

public class PedidosService {
    public void procesarPedido(Pedido pedido) {
        System.out.println("Procesando: " + pedido.getProducto() + " | Total: $" + pedido.getTotal());

        if (pedido.getTotal() > 100) {
            new NotificadorMail().enviar("Pedido mayor a $100");
        } else if (pedido.getTotal() <= 50) {
            new NotificadorWhatsapp().enviar("Pedido igual o menor a $50");
        } else {
            // Este entra cuando es menor a 100 pero mayor a 50
            new NotificadorSMS().enviar("Pedido menor a $100");
        }
    }
}