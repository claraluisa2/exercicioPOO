/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dme;

/**
 *
 * @author clara
 */
public class Lote {
    private String codigo;
    private String dataValidade;
    private int quantProduto;
    private Fornecedores fornecedor;
    private Produto produto; 

    public Lote(String codigo, String dataValidade, int quantProduto, Fornecedores fornecedor, Produto produto) {
        this.codigo = codigo;
        this.dataValidade = dataValidade;
        this.quantProduto = quantProduto;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public int getQuantProduto() {
        return quantProduto;
    }

    public Fornecedores getFornecedor() {
        return fornecedor;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setQuantProduto(int quantProduto) {
        this.quantProduto = quantProduto;
    }

    public void setFornecedor(Fornecedores fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
}
