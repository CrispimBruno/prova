/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.av01;

/**
 *
 * @author 890290
 */
public class OrdemDeServico{
            
    private int codigo;
    private String nomeCliente;
    private String modeloVeiculo;
    private String placaCarro;
    private String data;
    private String status;
    private double valorEstimado;
            
    public OrdemDeServico (int codigo, String nomeCliente, String modeloVeiculo, String placaCarro, String data, String status, double valorEstimado){
                this.data = data;
        this.modeloVeiculo = modeloVeiculo;
        this.nomeCliente = nomeCliente;
        this.placaCarro = placaCarro;
        this.valorEstimado = valorEstimado;
        }
    
    
}
    