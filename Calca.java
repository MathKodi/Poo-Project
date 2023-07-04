
package com.mycompany.projetofinal;
// Matheus Kodi Yamamamura
// RA: 2503557
final public class Calca extends Roupa implements Desconto{
    private boolean bolsoFaca;
    private boolean bolsoTraseiro;
    private boolean bolsoLateral;
    private boolean cinto;
    private boolean elasticoCintura;
    public Calca() {
        bolsoFaca = false;
        bolsoTraseiro = false;
        bolsoLateral = false;
        cinto = false;
        elasticoCintura = false;
    }
    //Polimorfismo Sobrecarga
    public Calca(boolean bolsoFaca, boolean bolsoTraseiro, boolean bolsoLateral, boolean cinto, boolean elasticoCintura) {
        this.bolsoFaca = bolsoFaca;
        this.bolsoTraseiro = bolsoTraseiro;
        this.bolsoLateral = bolsoLateral;
        this.cinto = cinto;
        this.elasticoCintura = elasticoCintura;
    }
    public double calcularDesconto() {
        double desc = 0;
        double aux = getPreco();
        desc = aux - (aux * 0.15);
        return desc;
    }
    public boolean getBolsoFaca() {
        return bolsoFaca;
    }
    public void setBolsoFaca(String bolsoFaca) {
        if(bolsoFaca.equalsIgnoreCase("s")){
            this.bolsoFaca = true;
        } 
    }
    public boolean getBolsoTraseiro() {
        return bolsoTraseiro;
    }
    public void setBolsoTraseiro(String bolsoTraseiro) {
        if(bolsoTraseiro.equalsIgnoreCase("s")){
            this.bolsoTraseiro = true;
        } 
    }
    public boolean getBolsoLateral() {
        return bolsoLateral;
    }
    public void setBolsoLateral(String bolsoLateral) {
        if(bolsoLateral.equalsIgnoreCase("s")){
            this.bolsoLateral = true;
        } 
    }
    public boolean getCinto() {
        return cinto;
    }
    public void setCinto(String cinto) {
        if(cinto.equalsIgnoreCase("s")){
            this.cinto = true;
        } 
    }
    public boolean getElasticoCintura() {
        return elasticoCintura;
    }
    public void setElasticoCintura(String elasticoCintura) {
        if(elasticoCintura.equalsIgnoreCase("s")){
            this.elasticoCintura = true;
        } 
    }
}