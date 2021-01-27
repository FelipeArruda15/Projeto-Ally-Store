/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

/**
 *
 * @author Usuário
 */
public class Cliente extends Pessoa {
    
    private String endereco;
    
    public Cliente(int id, String nome, String telefone, String email, String endereco) {
        super(id, nome, telefone, email);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
   
   @Override
   public String toString(){
       return getNome();
   }
    
}
