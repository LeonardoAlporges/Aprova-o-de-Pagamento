/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufes.model;

/**
 *
 * @author Note162
 */
public class Pedido {
    
    public Pedido(int valor){
        this.valor = valor;
    }
    
    private int valor;
    
    public int getValor(){
        return this.valor;
    }
    public void setValor(int valor){
        this.valor = valor;
    }
}
