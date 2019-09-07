/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
public class Lutador {
    
    private String nome, nacionalidade, categoria;
    private int idade, vitoria, empate;
    private float altura, peso;
    
    public void apresentar(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Do "+ this.getNacionalidade());
        System.out.println("Com "+ this.getIdade() +" anos");
        System.out.println("E com "+this.getAltura());
        System.out.println("E pesando "+this.getPeso() +" quilos");
        System.out.println("Com um total de "+ this.getVitoria()+" vitórias");
        System.out.println("");
        
    }
    public void status(){
        System.out.println(this.getNome() +" é um peso "+ this.getCategoria());
        System.out.println("");
    }
    public void ganharluta(){
        this.setVitoria(this.getVitoria() + 1);
        //this.vitoria = this.vitoria +1; mesma coisa que a de cima 
    }
    public void perderluta(){
        
    }
    public void empatar(){
        this.setEmpate(this.getEmpate() + 1);
    }

    public Lutador(String nome, String nacionalidade, int idade, int vitoria, int empate, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitoria = vitoria;
        this.empate = empate;
        this.altura = altura;
        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso<52){
            this.categoria = "Inválido";
        }
        else if (this.peso<=70){
            this.categoria="Leve";
        }
        else if (this.peso<=85){
            this.categoria="Médio";
        }
        else if (this.peso<=120){
            this.categoria="Pesado";
        }
        else {
            this.categoria="Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    
    
}
