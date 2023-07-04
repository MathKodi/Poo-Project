
package com.mycompany.projetofinal;
// Matheus Kodi Yamamamura
// RA: 2503557
final public class Camiseta extends Roupa implements Desconto{
    private String tipoManga;
    private boolean estampada;
    private String gola;
    private String corte;
    public Camiseta() {
        tipoManga = "";
        estampada = false;
        gola = "";
        corte = "";
    }
    //Polimorfismo Sobrecarga
    public Camiseta(String tipoManga, boolean estampada, String gola, String corte){
        this.tipoManga = tipoManga;
        this.estampada = estampada;
        this.gola = gola;
        this.corte = corte;
    }
    public double calcularDesconto() {
        double desc = 0;
        double aux = getPreco();
        desc = aux - (aux * 0.2);
        return desc; 
    }
    public String getTipoManga() {
        return tipoManga;
    }
    public void setTipoManga(String tipoManga) {
        this.tipoManga = tipoManga;
    }
    public boolean getEstampada() {
        return estampada;
    }
    public void setEstampada(String estampada) {
        if(estampada.equalsIgnoreCase("s")){
            this.estampada = true;
        } 
    }
    public String getGola(){
        return gola;
    }
    public void setGola(String gola){
        this.gola = gola;
    }
    public void setCorte(String corte){
        this.corte = corte;
    }
    public String getCorte(){
        return corte;
    }
}