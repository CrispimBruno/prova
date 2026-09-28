/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.av01;

/**
 *
 * @author 890290
 */
public class mecanico{
        
    private String nome;
    private String cpf;
    private String especialidade;
    private String telefone;
    //Decidi usar String para os itens CPF e telefone, pois são numeros que não devem ser mutados e entraria em boas práticas.
        
    public mecanico (String nome, String cpf, String especialidade, String telefone){
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.nome = nome;
        this.telefone = telefone;
        }
    
    
}
