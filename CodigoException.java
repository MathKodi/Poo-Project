
package com.mycompany.projetofinal;
//Matheus Kodi Y.
//RA: 2503557
import javax.swing.JOptionPane;
public class CodigoException extends Exception{
    public void msg(){
        JOptionPane.showMessageDialog(
null,
      "ERRO - > O CODIGO DEVE CONTER APENAS NUMEROS E SER MAIOR QUE ZERO <- ERRO",
       "EXCEPTION CODIGO",
   JOptionPane.ERROR_MESSAGE
        );
    }
    public Camiseta corrigeCodigoCamiseta(Camiseta cam){
        try{
            int nCodigo = Integer.parseInt(JOptionPane.showInputDialog(
                            null,
                            "CORRIGIR CODIGO -> DIGITE O CODIGO: ",
                            "EXCEPTION CODIGO",
                            1 //ICONE
            ));
            cam.setCodigo(nCodigo);          
        } 
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(
    null,
          "ERRO - > O CODIGO DEVE SER UM NUMERO <- ERRO",
           "EXCEPTION CODIGO",
       JOptionPane.ERROR_MESSAGE
            );
            cam = corrigeCodigoCamiseta(cam);
        } 
        catch(CodigoException ce){
            ce.msg();
            cam = ce.corrigeCodigoCamiseta(cam);
        }
        return cam;
    }
    public Calca corrigeCodigoCalca(Calca cal){
        try{
            int nCodigo = Integer.parseInt(JOptionPane.showInputDialog(
                            null,
                            "CORRIGIR CODIGO -> DIGITE O CODIGO: ",
                            "EXCEPTION CODIGO",
                            1 //ICONE
            ));
            cal.setCodigo(nCodigo);          
        } 
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(
    null,
          "ERRO - > O CODIGO DEVE SER UM NUMERO <- ERRO",
           "EXCEPTION CODIGO",
       JOptionPane.ERROR_MESSAGE
            );
            cal = corrigeCodigoCalca(cal);
        } 
        catch(CodigoException ce){
            ce.msg();
            cal = ce.corrigeCodigoCalca(cal);
        }
        return cal;
    }
    public BlusaFrio corrigeCodigoBlusaFrio(BlusaFrio blu){
        try{
            int nCodigo = Integer.parseInt(JOptionPane.showInputDialog(
                            null,
                            "CORRIGIR CODIGO -> DIGITE O CODIGO: ",
                            "EXCEPTION CODIGO",
                            1 //ICONE
            ));
            blu.setCodigo(nCodigo);          
        } 
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(
    null,
          "ERRO - > O CODIGO DEVE SER UM NUMERO <- ERRO",
           "EXCEPTION CODIGO",
       JOptionPane.ERROR_MESSAGE
            );
            blu = corrigeCodigoBlusaFrio(blu);
        } 
        catch(CodigoException ce){
            ce.msg();
            blu = ce.corrigeCodigoBlusaFrio(blu);
        }
        return blu;
    }
}