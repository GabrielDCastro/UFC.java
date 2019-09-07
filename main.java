/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
public class Lutador {
    
    private String nome, nacionalidade, categoria;
    private int idade, votoria, empate;
    private float altura, peso;
    
    public void apresentar(){
        
    }
    public void status(){
        
    }
    public void ganharluta(){
        
    }
    public void perderluta(){
        
    }
    public void empatAR(){
        
    }

    public Lutador(String nome, String nacionalidade, int idade, int votoria, int empate, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.votoria = votoria;
        this.empate = empate;
        this.altura = altura;
        this.peso = peso;
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

    public void setCategoria() {
        if(this.peso<52){
            this.categoria = "Inválido";
        }
        else if (this.peso<=70){
            this.categoria="Leve";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVotoria() {
        return votoria;
    }

    public void setVotoria(int votoria) {
        this.votoria = votoria;
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
