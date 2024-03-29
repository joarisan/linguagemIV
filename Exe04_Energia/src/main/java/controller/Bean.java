
package controller;

import java.io.Serializable;
import javax.faces.bean.*;


@ManagedBean(name = "ct")
@SessionScoped
public class Bean implements Serializable {

  
    public Bean() {
    }//build
   private String cpNome;//campo nome do equipamwnto
   private String cpPot;//campo potência do equipamento
   private String cpTmp;//campo tempo informando de uso maensal do equipamento
   private String cpMed;//campo unidade de medida de tempo  mensal
   private String cpVal;// campo valor kw/h cobrado compahia de energia
   private String cpTot;// total em reais a ser cobrado
   
   /// -------------getter e setter--------------

    public String getCpNome() {
        return cpNome;
    }

    public void setCpNome(String cpNome) {
        this.cpNome = cpNome;
    }

    public String getCpPot() {
        return cpPot;
    }

    public void setCpPot(String cpPot) {
        this.cpPot = cpPot;
    }

    public String getCpTmp() {
        return cpTmp;
    }

    public void setCpTmp(String cpTmp) {
        this.cpTmp = cpTmp;
    }

    public String getCpMed() {
        return cpMed;
    }

    public void setCpMed(String cpMed) {
        this.cpMed = cpMed;
    }

    public String getCpVal() {
        return cpVal;
    }

    public void setCpVal(String cpVal) {
        this.cpVal = cpVal;
    }

    public String getCpTot() {
        return cpTot;
    }

    public void setCpTot(String cpTot) {
        this.cpTot = cpTot;
    }

   
}
