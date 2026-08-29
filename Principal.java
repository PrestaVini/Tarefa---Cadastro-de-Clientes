/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

public class Principal {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        
        cliente1.setNome("David");
        cliente1.setEndereco("Rua Amarela");
        cliente1.setTelefone("19 111111111");
        cliente1.setEmail("David@gmail.com");
        
        cliente2.setNome("Laura");
        cliente2.setEndereco("Rua Vermelha");
        cliente2.setTelefone("19 222222222");
        cliente2.setEmail("Laura@gmail.com");
        
        cliente3.setNome("Vinicius");
        cliente3.setEndereco("Rua Azul");
        cliente3.setTelefone("19 333333333");
        cliente3.setEmail("Presta@gmail.com");
        
        System.out.println("Cliente 1:");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Endereco: " + cliente1.getEndereco());
        System.out.println("Telefone: " + cliente1.getTelefone());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("");
        System.out.println("Cliente 2:");
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Endereco: " + cliente2.getEndereco());
        System.out.println("Telefone: " + cliente2.getTelefone());
        System.out.println("Email: " + cliente2.getEmail());
        System.out.println("");
        System.out.println("Cliente 3:");
        System.out.println("Nome: " + cliente3.getNome());
        System.out.println("Endereco: " + cliente3.getEndereco());
        System.out.println("Telefone: " + cliente3.getTelefone());
        System.out.println("Email: " + cliente3.getEmail());
    }
    
}
