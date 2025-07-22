/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dme;

/**
 *
 * @author clara
 */
public class Pedido {
    private int numPedido;
    private String data;
    private String formaPagamento;
    private int quantProdutos;

    public Pedido(int numPedido, String data, String formaPagamento, int quantProdutos) {
        this.numPedido = numPedido;
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.quantProdutos = quantProdutos;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public String getData() {
        return data;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public int getQuantProdutos() {
        return quantProdutos;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setQuantProdutos(int quantProdutos) {
        this.quantProdutos = quantProdutos;
    }
    
    
}
