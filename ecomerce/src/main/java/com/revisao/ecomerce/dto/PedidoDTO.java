package com.revisao.ecomerce.dto;

import java.time.Instant;

import com.revisao.ecomerce.entity.Pedido;
import com.revisao.ecomerce.entity.StatusDoPedido;

public class PedidoDTO {

    private Long id;
    private Instant momento;
    private StatusDoPedido status;
    private Long clienteid;

    public PedidoDTO() {
    }

    public PedidoDTO(Long id, Instant momento, StatusDoPedido status, Long clienteid) {
        this.id = id;
        this.momento = momento;
        this.status = status;
        this.clienteid = clienteid;
    }

    public PedidoDTO(Pedido pedido) {
        this.id = pedido.getId();
        this.momento = pedido.getMomento();
        this.status = pedido.getStatus();
        this.clienteid = pedido.getCliente().getId(); 
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMomento() {
        return momento;
    }

    public void setMomento(Instant momento) {
        this.momento = momento;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }

	public Long getClienteid() {
		return clienteid;
	}

	public void setClienteid(Long clienteid) {
		this.clienteid = clienteid;
	}

   
}
