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
public class Fornecedores extends PessoaJuridica{
    
    private ArrayList<Produto> listaProdutos; 

    public Fornecedores(ArrayList listaProdutos, String razaoSocial, String cnpj, String telefone, String pessoaContato) {
        super(razaoSocial, cnpj, telefone, pessoaContato);
        this.listaProdutos = new ArrayList<>();
    }
    
    public void adicionarProduto(Produto produto){
        listaProdutos.add(produto);
    }
    
}
