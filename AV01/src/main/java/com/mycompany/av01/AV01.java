/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.av01;

/**
 *
 * @author 890290
 */
public class AV01 {

    public class Boxes{
        
        private int numero;
        private String tipoSevico;
        private int capacidadeMaxima;
        private String local;
        
        public Boxes(int numero, String tipoServico, int capacidadeMaxima, String local){
            this.capacidadeMaxima = capacidadeMaxima;
            this.local = local;
            this.numero = numero;
            this.tipoSevico = tipoServico;
        }

    }
    public class Servico{
        private String nome;
        private String tempoEstimulado;
        private double preco;
        private String categoria;
    
        public Servico(String nome, String tempoEstimulado , double preco, String categoria){
            this.categoria = categoria;
            this.nome = nome;
            this.preco = preco;
            this.tempoEstimulado = tempoEstimulado;
        }
    }
    
    public class Mecanico{
        
        private String nome;
        private String cpf;
        private String especialidade;
        private String telefone;
        //Decidi usar String para os itens CPF e telefone, pois são numeros que não devem ser mutados e entraria em boas práticas.
        
        public Mecanico (String nome, String cpf, String especialidade, String telefone){
            this.cpf = cpf;
            this.especialidade = especialidade;
            this.nome = nome;
            this.telefone = telefone;
        }
        
    public class OrdemDeServico{
            
        private int codigo;
        private String nomeCliente;
        private String modeloVeiculo;
        private String placaCarro;
        private String data;
        private String status;
        private double valorEstimado;
            
        public OrdemDeServico (int codigo, String nomeCliente, String modeloVeiculo, String placaCarro, String data, String status, double valorEstimado){
            this.codigo = codigo;
            this.data = data;
            this.modeloVeiculo = modeloVeiculo;
            this.nomeCliente = nomeCliente;
            this.placaCarro = placaCarro;
            this.status = status;
            this.valorEstimado = valorEstimado;
             }
    }
}
