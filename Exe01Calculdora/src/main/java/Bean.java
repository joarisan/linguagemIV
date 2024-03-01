import java.awt.event.ActionEvent;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;


@ManagedBean(name = "ct")
@SessionScoped
public class Bean implements Serializable {

   
    public void Limpar (ActionEvent a) {
        setVisor("0");
        setN1(0);
        setN2(0);
        setRes(0);
        setOp("");
    }//builder -  limpar
    
    public void btSoma(ActionEvent a){
        setN1(Double.parseDouble(getVisor()));
        setOp("+");
    }// btSOma
    
    private String visor;
    private double n1;
    private double n2;
    private double res;
    private String op;

    public void  bt07(ActionEvent a){
      if(getVisor().equals("0")|| getOp()==null)  
          setVisor("7");
      else if(getVisor().equals("0")|| getOp()==null){
          String prov = getVisor();
          ///armazenar provisoriamente o valor do visor
          prov+="7";
          //prov = prov = "7";
          setVisor(prov);
          
      }else if(!getVisor().equals("0")|| getOp()!=null){
          setVisor("7");
          
      }
    }///bt 07
    public void btIgual(ActionEvent a){
        setN2(Double.parseDouble(getVisor()));
        switch (getOp()) {
            case "+":
                setVisor(String.valueOf(getN1()+ getN2()));
        }    
    }
    public void  bt08(ActionEvent a){
      if(getVisor().equals("0")|| getOp()==null)  
          setVisor("8");
      else if(getVisor().equals("0")|| getOp()==null){
          String prov = getVisor();
          ///armazenar provisoriamente o valor do visor
          prov+="8";
          //prov = prov = "8";
          setVisor(prov);
          
      }
    }///bt 08
    
    //////////////////////////GET E SET
        public String getVisor() {
        return visor;
    }

    public void setVisor(String visor) {
        this.visor = visor;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
    
    
    
    
}// class
