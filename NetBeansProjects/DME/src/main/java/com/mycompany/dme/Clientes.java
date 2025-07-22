/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dme;

/**
 *
 * @author clara
 */
public class Clientes extends PessoaJuridica{
    
    private String endereco;

    public Clientes(String endereco, String razaoSocial, String cnpj, String telefone, String pessoaContato) {
        super(razaoSocial, cnpj, telefone, pessoaContato);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
