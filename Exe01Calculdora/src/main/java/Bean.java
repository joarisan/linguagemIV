
import javax.faces.event.ActionEvent;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "ct")
@SessionScoped
public class Bean implements Serializable {

    public Bean() {
        setVisor("0");
    }//builder -  limpar

    private String visor;
    private double n1;
    private double n2;
    private boolean ver;
    private double res;
    private String op;

    public void btLimpar(ActionEvent a) {
        setVisor("0");
        setN1(0);
        setN2(0);
        setRes(0);
        setOp("");
        ver = false;
    }

    public void btSoma(ActionEvent a) {
        setOp("+");
        setN1(Double.parseDouble(getVisor()));
        ver = true;
    }// btSOma

    public void btMenos(ActionEvent a) {
        setOp("-");
        setN1(Double.parseDouble(getVisor()));
        ver = true;
        
    }//btMeno

    public void btMult(ActionEvent a) {
        setOp("X");
        setN1(Double.parseDouble(getVisor()));
        ver = true;
    }//btmultiplicar

    public void btDiv(ActionEvent a) {
        setOp("/");
        setN1(Double.parseDouble(getVisor()));
        ver =true;

    }//btDividir

    public void btIgual(ActionEvent a) {
        setN2(Double.parseDouble(getVisor()));
        Double aux = 0.0;
        switch (getOp()) {
            case "+":
                aux = n1 + n2;
                setVisor(aux.toString());
                break;
            case "-":
                aux = n1 - n2;
                setVisor(aux.toString());
                break;
            case "X":
                aux = n1 * n2;
                setVisor(aux.toString());
                break;
            case "/":
                aux = n1 / n2;
                setVisor(aux.toString());

                break;

        }
    }

    public void bt07(ActionEvent a) {
        if (getVisor().equals("0")) {
            setVisor("7");
        } else if (!getVisor().equals("0") && getOp() == null) {
            String prov = getVisor();
            ///armazenar provisoriamente o valor do visor
            prov += "7";
            //prov = prov = "7";
            setVisor(prov);

        } else if (ver == true) {
            setVisor("7");
            ver = false;
        }else{
            String prov = getVisor();
            //Armazena o valor atual do visor
            prov+= "7";
            setVisor(prov);
        }
    }///bt 07

    public void bt08(ActionEvent a) {
        if (getVisor().equals("0")) {
            setVisor("8");
        } else if (!getVisor().equals("0") && getOp() == null) {
            String prov = getVisor();
            ///armazenar provisoriamente o valor do visor
            prov += "8";
            //prov = prov = "8";
            setVisor(prov);

        } else if (ver == true) {
            setVisor("8");
            ver = false;
        }else{
            String prov = getVisor();
            prov+= "8";
            setVisor(prov);
        }
    }///bt 08
    
     public void bt09(ActionEvent a) {
        if (getVisor().equals("0")) {
            setVisor("9");
        } else if (!getVisor().equals("0") && getOp() == null) {
            String prov = getVisor();
            ///armazenar provisoriamente o valor do visor
            prov += "9";
            //prov = prov = "8";
            setVisor(prov);

        } else if (ver == true) {
            setVisor("9");
            ver = false;
        }else{
            String prov = getVisor();
            prov+= "9";
            setVisor(prov);
        }
    }///bt 09
     
      public void bt04(ActionEvent a) {
        if (getVisor().equals("0")) {
            setVisor("4");
        } else if (!getVisor().equals("0") && getOp() == null) {
            String prov = getVisor();
            ///armazenar provisoriamente o valor do visor
            prov += "4";
            //prov = prov = "4";
            setVisor(prov);

        } else if (ver == true) {
            setVisor("4");
            ver = false;
        }else{
            String prov = getVisor();
            prov+= "4";
            setVisor(prov);
        }
    }///bt 04
      
       public void bt05(ActionEvent a) {
        if (getVisor().equals("0")) {
            setVisor("5");
        } else if (!getVisor().equals("0") && getOp() == null) {
            String prov = getVisor();
            ///armazenar provisoriamente o valor do visor
            prov += "5";
            //prov = prov = "5";
            setVisor(prov);

        } else if (ver == true) {
            setVisor("5");
            ver = false;
        }else{
            String prov = getVisor();
            prov+= "5";
            setVisor(prov);
        }
    }///bt 05
       
        public void bt06(ActionEvent a) {
        if (getVisor().equals("0")) {
            setVisor("6");
        } else if (!getVisor().equals("0") && getOp() == null) {
            String prov = getVisor();
            ///armazenar provisoriamente o valor do visor
            prov += "6";
            //prov = prov = "6";
            setVisor(prov);

        } else if (ver == true) {
            setVisor("6");
            ver = false;
        }else{
            String prov = getVisor();
            prov+= "6";
            setVisor(prov);
        }
    }///bt 06
        
         public void bt01(ActionEvent a) {
        if (getVisor().equals("0")) {
            setVisor("1");
        } else if (!getVisor().equals("0") && getOp() == null) {
            String prov = getVisor();
            ///armazenar provisoriamente o valor do visor
            prov += "1";
            //prov = prov = "1";
            setVisor(prov);

        } else if (ver == true) {
            setVisor("1");
            ver = false;
        }else{
            String prov = getVisor();
            prov+= "1";
            setVisor(prov);
        }
    }///bt 01
         
          public void bt02(ActionEvent a) {
        if (getVisor().equals("0")) {
            setVisor("2");
        } else if (!getVisor().equals("0") && getOp() == null) {
            String prov = getVisor();
            ///armazenar provisoriamente o valor do visor
            prov += "2";
            //prov = prov = "2";
            setVisor(prov);

        } else if (ver ==  true) {
            setVisor("2");
            ver = false;
        }else{
            String prov = getVisor();
            prov+= "2";
            setVisor(prov);
        }
    }///bt 02
          
           public void bt03(ActionEvent a) {
        if (getVisor().equals("0")) {
            setVisor("3");
        } else if (!getVisor().equals("0") && getOp() == null) {
            String prov = getVisor();
            ///armazenar provisoriamente o valor do visor
            prov += "3";
            //prov = prov = "8";
            setVisor(prov);

        } else if (ver == true) {
            setVisor("3");
            ver = false;
        }else{
            String prov = getVisor();
            prov+= "3";
            setVisor(prov);
        }
    }///bt 03
           
           public void bt00(ActionEvent a) {
        if (getVisor().equals("0")) {
            setVisor("0");
        } else if (!getVisor().equals("0") && getOp() == null) {
            String prov = getVisor();
            ///armazenar provisoriamente o valor do visor
            prov += "0";
            //prov = prov = "0";
            setVisor(prov);

        } else if (ver == true) {
            setVisor("0");
            ver = false;
        }else{
            String prov = getVisor();
            prov += "0";
            setVisor(prov);
        }
    }///bt 00

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
