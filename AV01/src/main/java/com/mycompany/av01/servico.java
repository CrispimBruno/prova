/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.av01;

/**
 *
 * @author 890290
 */

public class servico{
    private String nome;
    private String tempoEstimulado;
    private double preco;
    private String categoria;
    
    public servico(String nome, String tempoEstimulado , double preco, String categoria){
        this.categoria = categoria;
        this.nome = nome;
        this.preco = preco;
        this.tempoEstimulado = tempoEstimulado;
        }
}
