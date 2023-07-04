//Matheus Kodi Y. Ra2503557
package com.mycompany.projetofinal;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class BancoRoupa{
    static Camiseta cam = new Camiseta();
    static Calca cal = new Calca();
    static BlusaFrio blu = new BlusaFrio();
    static List<Camiseta> bdCamiseta;
    static List<Calca> bdCalca;
    static List<BlusaFrio> bdBlusaFrio;
    private static BancoRoupa bancoRoupaUnico;
    private BancoRoupa(){
        bdCamiseta = new ArrayList<Camiseta>();
        bdCalca = new ArrayList<Calca>();
        bdBlusaFrio = new ArrayList<BlusaFrio>();
    }
    public static BancoRoupa getBancoRoupa(){
        if(bancoRoupaUnico == null){
            bancoRoupaUnico = new BancoRoupa();
        }
        return bancoRoupaUnico;
    }	
    public List<Camiseta> getBdCamiseta(){
        return bdCamiseta;
    }
    public List<Calca> getBdCalca(){
        return bdCalca;
    }
    public List<BlusaFrio> getBdBlusaFrio(){
        return bdBlusaFrio;
    }
               
    public static Camiseta cadCamiseta(Camiseta cam){
        if(consCamiseta(cam) == null){
            bdCamiseta.add(cam);
            return cam;
        }
        return null;
    }
    public static Calca cadCalca(Calca cal){
        if(consCalca(cal) == null){
            bdCalca.add(cal);
            return cal;
        }
        return null;
    }
    public static BlusaFrio cadBlusaFrio(BlusaFrio blu){
        if(consBlusaFrio(blu) == null){
            bdBlusaFrio.add(blu);
            return blu;
        }
        return null;
    }
    public static Camiseta consCamiseta(Camiseta cam){
        for(int i = 0; i < bdCamiseta.size(); i++){
            if(cam.getCodigo() == bdCamiseta.get(i).getCodigo()){
                return bdCamiseta.get(i);
            }
        }
        return null;
    }
    public static Calca consCalca(Calca cal){
        for(int i = 0; i < bdCalca.size(); i++){
            if(cal.getCodigo() == bdCalca.get(i).getCodigo()){
                return bdCalca.get(i);
            }
        }
        return null;
    }
    public static BlusaFrio consBlusaFrio(BlusaFrio blu){
        for(int i = 0; i < bdBlusaFrio.size(); i++){
            if(blu.getCodigo() == bdBlusaFrio.get(i).getCodigo()){
                return bdBlusaFrio.get(i);
            }
        }
        return null;
    }
    public static Camiseta altCamiseta(Camiseta cam) throws PrecoException{
        for(int i = 0; i < bdCamiseta.size();i++){
            if(cam.getCodigo() == bdCamiseta.get(i).getCodigo()){
                bdCamiseta.get(i).setMarca(cadCamiseta.getCadCamiseta().getCxMarca());
                bdCamiseta.get(i).setModelo(cadCamiseta.getCadCamiseta().getCxModelo());
                bdCamiseta.get(i).setCor(cadCamiseta.getCadCamiseta().getCxCor());
                bdCamiseta.get(i).setMaterial(cadCamiseta.getCadCamiseta().getCxMaterial());
                try{
                    bdCamiseta.get(i).setPreco(cadCamiseta.getCadCamiseta().getCxPreco());
                }
                catch(PrecoException pe){
                    pe.msg();
                    cam = pe.corrigePrecoCamiseta(cam);
                    bdCamiseta.get(i).setPreco(cam.getPreco());
                }
                catch(NumberFormatException ne){
                    PrecoException pe = new PrecoException();
                    pe.msg();
                    cam = pe.corrigePrecoCamiseta(cam);
                    bdCamiseta.get(i).setPreco(cam.getPreco());
                }
                bdCamiseta.get(i).setTamanho(cadCamiseta.getCadCamiseta().getCxTamanho());
                bdCamiseta.get(i).setDescricao(cadCamiseta.getCadCamiseta().getCxDescricao());
                bdCamiseta.get(i).setGenero(cadCamiseta.getCadCamiseta().getCxGenero());
                bdCamiseta.get(i).setDesconto(cadCamiseta.getCadCamiseta().getCxDesconto());
                bdCamiseta.get(i).setTipoManga(cadCamiseta.getCadCamiseta().getCxCamisetaManga());
                bdCamiseta.get(i).setEstampada(cadCamiseta.getCadCamiseta().getCxCamisetaEstampada());
                bdCamiseta.get(i).setGola(cadCamiseta.getCadCamiseta().getCxCamisetaGola());
                bdCamiseta.get(i).setCorte(cadCamiseta.getCadCamiseta().getCxCamisetaCorte());
                return bdCamiseta.get(i);
            }
        }
        return null;
    }
    public static Calca altCalca(Calca cal) throws PrecoException{
        for(int i = 0; i < bdCalca.size();i++){
            if(cal.getCodigo() == bdCalca.get(i).getCodigo()){
                bdCalca.get(i).setMarca(cadCalca.getCadCalca().getCxMarca());
                bdCalca.get(i).setModelo(cadCalca.getCadCalca().getCxModelo());
                bdCalca.get(i).setCor(cadCalca.getCadCalca().getCxCor());
                bdCalca.get(i).setMaterial(cadCalca.getCadCalca().getCxMaterial());
                try{
                    bdCalca.get(i).setPreco(cadCalca.getCadCalca().getCxPreco());
                }
                catch(PrecoException pe){
                    pe.msg();
                    cal = pe.corrigePrecoCalca(cal);
                    bdCalca.get(i).setPreco(cal.getPreco());
                }
                catch(NumberFormatException ne){
                    PrecoException pe = new PrecoException();
                    pe.msg();
                    cal = pe.corrigePrecoCalca(cal);
                    bdCalca.get(i).setPreco(cal.getPreco());
                }
                bdCalca.get(i).setTamanho(cadCalca.getCadCalca().getCxTamanho());
                bdCalca.get(i).setDescricao(cadCalca.getCadCalca().getCxDescricao());
                bdCalca.get(i).setGenero(cadCalca.getCadCalca().getCxGenero());
                bdCalca.get(i).setDesconto(cadCalca.getCadCalca().getCxDesconto());
                bdCalca.get(i).setBolsoFaca(cadCalca.getCadCalca().getCxCalcaBolsoFaca());
                bdCalca.get(i).setBolsoTraseiro(cadCalca.getCadCalca().getCxCalcaBolsoTraseiro());
                bdCalca.get(i).setBolsoLateral(cadCalca.getCadCalca().getCxCalcaBolsoLateral());
                bdCalca.get(i).setCinto(cadCalca.getCadCalca().getCxCalcaCinto());
                bdCalca.get(i).setElasticoCintura(cadCalca.getCadCalca().getCxCalcaElastico());
                return bdCalca.get(i);
            }
        }
        return null;
    }
    public static BlusaFrio altBlusaFrio(BlusaFrio blu) throws PrecoException{
        for(int i = 0; i < bdBlusaFrio.size();i++){
            if(blu.getCodigo() == bdBlusaFrio.get(i).getCodigo()){
                bdBlusaFrio.get(i).setMarca(cadBlusaFrio.getCadBlusaFrio().getCxMarca());
                bdBlusaFrio.get(i).setModelo(cadBlusaFrio.getCadBlusaFrio().getCxModelo());
                bdBlusaFrio.get(i).setCor(cadBlusaFrio.getCadBlusaFrio().getCxCor());
                bdBlusaFrio.get(i).setMaterial(cadBlusaFrio.getCadBlusaFrio().getCxMaterial());
                try{
                    bdBlusaFrio.get(i).setPreco(cadBlusaFrio.getCadBlusaFrio().getCxPreco());
                }
                catch(PrecoException pe){
                    pe.msg();
                    cal = pe.corrigePrecoCalca(cal);
                    bdBlusaFrio.get(i).setPreco(cal.getPreco());
                }
                catch(NumberFormatException ne){
                    PrecoException pe = new PrecoException();
                    pe.msg();
                    blu = pe.corrigePrecoBlusaFrio(blu);
                    bdBlusaFrio.get(i).setPreco(blu.getPreco());
                }
                bdBlusaFrio.get(i).setTamanho(cadBlusaFrio.getCadBlusaFrio().getCxTamanho());
                bdBlusaFrio.get(i).setDescricao(cadBlusaFrio.getCadBlusaFrio().getCxDescricao());
                bdBlusaFrio.get(i).setGenero(cadBlusaFrio.getCadBlusaFrio().getCxGenero());
                bdBlusaFrio.get(i).setDesconto(cadBlusaFrio.getCadBlusaFrio().getCxDesconto());
                bdBlusaFrio.get(i).setCapuz(cadBlusaFrio.getCadBlusaFrio().getCxCapuz());
                bdBlusaFrio.get(i).setZiper(cadBlusaFrio.getCadBlusaFrio().getCxZiper());
                bdBlusaFrio.get(i).setForro(cadBlusaFrio.getCadBlusaFrio().getCxForro());
                return bdBlusaFrio.get(i);
            }
        }
        return null;
    }
    public static Camiseta delCamiseta(Camiseta cam){
        for(int i = 0; i < bdCamiseta.size();i++){
            if(cam.getCodigo() == bdCamiseta.get(i).getCodigo()){
                bdCamiseta.remove(bdCamiseta.get(i));
                return null;
            }
        }
        return cam;
    }
    public static Calca delCalca(Calca cal){
        for(int i = 0; i < bdCalca.size();i++){
            if(cal.getCodigo() == bdCalca.get(i).getCodigo()){
                bdCalca.remove(bdCalca.get(i));
                return null;
            }
        }
        return cal;
    }
    public static BlusaFrio delBlusaFrio(BlusaFrio blu){
        for(int i = 0; i < bdBlusaFrio.size();i++){
            if(blu.getCodigo() == bdBlusaFrio.get(i).getCodigo()){
                bdBlusaFrio.remove(bdBlusaFrio.get(i));
                return null;
            }
        }
        return blu;
    }
}
