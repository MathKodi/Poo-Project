
package com.mycompany.projetofinal;
//Matheus Kodi Y.
//RA: 2503557
import javax.swing.JOptionPane;
public class PrecoException extends Exception{
    public void msg(){
        JOptionPane.showMessageDialog(
null,
      "ERRO - > O PRECO DEVE CONTER APENAS NUMEROS E SER MAIOR QUE ZERO <- ERRO",
       "EXCEPTION PRECO",
   JOptionPane.ERROR_MESSAGE
        );
    }
    public Camiseta corrigePrecoCamiseta(Camiseta cam){
        try{
            Double nPreco = Double.parseDouble(JOptionPane.showInputDialog(
                            null,
                            "CORRIGIR PRECO -> DIGITE O PRECO: ",
                            "EXCEPTION PRECO",
                            1 //ICONE
            ));
            cam.setPreco(nPreco);
            if(cam.getDesconto() == true){
                cam.setPreco(cam.calcularDesconto());
            }            
        } 
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(
    null,
          "ERRO - > O PRECO DEVE SER UM NUMERO <- ERRO",
           "EXCEPTION PRECO",
       JOptionPane.ERROR_MESSAGE
            );
            cam = corrigePrecoCamiseta(cam);
        } 
        catch(PrecoException pe){
            pe.msg();
            cam = pe.corrigePrecoCamiseta(cam);
        }
        return cam;
    }
    public Calca corrigePrecoCalca(Calca cal){
        try{
            Double nPreco = Double.parseDouble(JOptionPane.showInputDialog(
                            null,
                            "CORRIGIR PRECO -> DIGITE O PRECO: ",
                            "EXCEPTION PRECO",
                            1 //ICONE
            ));
            cal.setPreco(nPreco);
            if(cal.getDesconto() == true){
                cal.setPreco(cal.calcularDesconto());
            }
        }
        catch(PrecoException pe){
            pe.msg();
            cal = pe.corrigePrecoCalca(cal);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(
    null,
          "ERRO - > O PRECO DEVE SER UM NUMERO <- ERRO",
           "EXCEPTION PRECO",
       JOptionPane.ERROR_MESSAGE
            );
            cal = corrigePrecoCalca(cal);
	}
        return cal;
    }
    public BlusaFrio corrigePrecoBlusaFrio(BlusaFrio blu){
        try{
            Double nPreco = Double.parseDouble(JOptionPane.showInputDialog(
    null,
          "CORRIGIR PRECO -> DIGITE O PRECO: ",
           "EXCEPTION PRECO",
       1 //ICONE
            ));
            blu.setPreco(nPreco);
            if(blu.getDesconto() == true){
                blu.setPreco(blu.calcularDesconto());
            }
        }
        catch(PrecoException pe){
            pe.msg();
            blu = pe.corrigePrecoBlusaFrio(blu);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(
    null,
          "ERRO - > O PRECO DEVE SER UM NUMERO <- ERRO",
           "EXCEPTION PRECO",
       JOptionPane.ERROR_MESSAGE
            );
            blu = corrigePrecoBlusaFrio(blu);
		}
        return blu;
    }
}