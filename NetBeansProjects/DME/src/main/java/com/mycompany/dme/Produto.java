/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dme;

import java.util.ArrayList;

/**
 *
 * @author clara
 */
public class Produto {
    private String codigoDeBarras;
    private String descrição;
    private double valorAtual;
    private ArrayList<Double> historicoProduto; 

    public Produto(String codigoDeBarras, String descrição, double valorAtual, ArrayList<Double> historicoProduto) {
        this.codigoDeBarras = codigoDeBarras;
        this.descrição = descrição;
        this.valorAtual = valorAtual;
        this.historicoProduto = historicoProduto;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public String getDescrição() {
        return descrição;
    }

    public double getValorAtual() {
        return valorAtual;
    }

    public ArrayList<Double> getHistoricoProduto() {
        return historicoProduto;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }

    public void setHistoricoProduto(ArrayList<Double> historicoProduto) {
        this.historicoProduto = historicoProduto;
    }
    
    
}
