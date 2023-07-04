
package com.mycompany.projetofinal;
// Matheus Kodi Yamamamura
// RA: 2503557
final public class BlusaFrio extends Roupa implements Desconto{
    private boolean capuz;
    private boolean ziper;
    private String forro;
    public BlusaFrio() {
        capuz = false;
        ziper = false;
        forro = "";
    }
    //Polimorfismo Sobrecarga
    public BlusaFrio(boolean capuz, boolean ziper, String forro) {
        this.capuz = capuz;
        this.ziper = ziper;
        this.forro = forro;
    }
    public double calcularDesconto(){
        double desc = 0;
        double aux = getPreco();
        desc = aux - (aux * 0.3);
        return desc;
    }
    public boolean getCapuz() {
        return capuz;
    }
    public void setCapuz(String capuz) {
        if(capuz.equalsIgnoreCase("s")){
            this.capuz = true;
        } 
    }
    public boolean getZiper() {
        return ziper;
    }
    public void setZiper(String ziper) {
        if(ziper.equalsIgnoreCase("s")){
            this.ziper = true;
        }
    }
    public String getForro() {
        return forro;
    }
    public void setForro(String forro) {
        this.forro = forro;
    }
}
