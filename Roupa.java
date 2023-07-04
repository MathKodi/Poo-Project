package com.mycompany.projetofinal;
// Matheus Kodi Yamamamura
// RA: 2503557
public abstract class Roupa{
    private int codigo;
    private String marca;
    private String modelo;
    private String cor;
    private String tamanho;
    private String material;
    private double preco;
    private String descricao;
    private String genero;
    private boolean desconto;
    //Construtor Default
    public Roupa(){ 
        codigo = 0;
        marca = "";
        modelo = "";
        cor = "";
        tamanho = "";
        material = "";
        preco = 0;
        descricao = "";
        genero = "";
        desconto = false;
    }
    //Polimorfismo Sobrecarga
    public Roupa(int codigo, String marca, String modelo, String cor, String tamanho,String material, double preco, String descricao, String genero, boolean desconto){
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tamanho = tamanho;
        this.material = material;
        this.preco = preco;
        this.descricao = descricao;
        this.genero = genero;
        this.desconto = desconto; 
    }
    public int getCodigo(){
        return codigo;
    }
    public boolean getDesconto(){
        return desconto;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public String getTamanho(){
        return tamanho;
    }
    public String getMaterial(){
        return material;
    }
    public double getPreco(){
        return preco;
    }
    public String getDescricao(){
        return descricao;
    } 
    public String getGenero(){
        return genero;
    }
    public void setDesconto(String desconto){
        if(desconto.equalsIgnoreCase("s")){
            this.desconto = true;
        } 
    }
    public void setCodigo(int codigo) throws CodigoException{
        if(codigo >= 0)
            this.codigo = codigo;
        else
            throw new CodigoException();
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public void setPreco(double preco) throws PrecoException{
        if(preco >= 0.0)
        this.preco= preco;
        else{
            throw new PrecoException();
        } 
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
}