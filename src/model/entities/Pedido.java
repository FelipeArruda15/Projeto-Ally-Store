/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuário
 */
public class Pedido {
    
    private int id;
    private Cliente cliente;
    private Date dataPedido;
    private Date dataEntrega;
    private List<Produto> produtos;
    private String enderecoEntrega;

    public Pedido(int id, Cliente cliente, Date dataPedido, Date dataEntrega, List<Produto> produtos, String enderecoEntrega) {
        this.id = id;
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.dataEntrega = dataEntrega;
        this.produtos = produtos;
        this.enderecoEntrega = this.cliente.getEndereco();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

   
}
