
import java.awt.event.ActionEvent;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.text.DecimalFormat;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "ct")
@SessionScoped
public class Bean implements Serializable {

    private int Cpn1;
    private int Cpn2;
    private int Cpn3;
    private String CpNumeroMaior;
    private String CpNumeroSoma;
    private Double peso;
    private Double altura;
    private String imc;
    private Double nMaior;
    private String media;
    private Double Cpcapital;
    private Double Cptaxa;
    private Double Cpperiodo;
    private String Invest;
    private Double CpSalario;
    private Double CpPercentual;
    private String CpNovoSal;

    public Bean() {
        Limpar();
    }

    public void btLimpar(ActionEvent ae) {
        Limpar();
    }

    public void Limpar() {
        setCpn1(0);
        setCpn2(0);
        setCpn3(0);
        setAltura(0.0);
        setPeso(0.0);
        setCpNumeroMaior("");
        setImc("");
        setCpNumeroSoma("");
        setMedia("");
        setCpcapital(0.0);
        setCptaxa(0.0);
        setCpperiodo(0.0);
        setInvest("");
        setCpSalario(0.0);
        setCpPercentual(0.0);
        setCpNovoSal("");
    }
        
    public String btMedia(ActionEvent ae) {
        Limpar();
        return "Exe01Media";
    }

    public String btImc(ActionEvent ae) {
        Limpar();
        return "Exe02Imc";
    }

    public String btInvest(ActionEvent ae) {
        Limpar();
        return "Exe03Investimento";
    }
    public String btSalario(ActionEvent ae){
        Limpar();
        return "Exe04Salario";
    }

   
    public void btCalcular(ActionEvent ae) {
        if (Cpn1 > Cpn2 && Cpn1 > Cpn3) {
            setCpNumeroMaior("" + Cpn1);
        } else if (Cpn2 > Cpn1 && Cpn2 > Cpn3) {
            setCpNumeroMaior("" + Cpn2);
        } else if (Cpn3 > Cpn1 && Cpn3 > Cpn2) {
            setCpNumeroMaior("" + Cpn3);

        } else {
            setCpNumeroMaior("NUMEROS IGUAIS");
        }

       
        Integer soma = Cpn1 + Cpn2 + Cpn3;
        if (soma % 2 == 0) {
            setCpNumeroSoma(soma + " - E A SOMA É PAR");
        } else {
            setCpNumeroSoma(soma + " - E A SOMA É IMPAR" );
        }
    
  
        int aux = ((Cpn1 + Cpn2 + Cpn3) / 3);
        setMedia(aux+"");

    }

    public void btCalculatImc(ActionEvent ae) {
        DecimalFormat df = new DecimalFormat("#.##");
        double imc = peso / (altura * altura);

        if (imc < 18) {
            setImc(df.format(imc) + " - Imc 18 - Abaixo do peso!");
        } else if (imc >= 18.6 && imc <= 24.9) {
            setImc(df.format(imc) + " - Imc 18.6 a 24.9 - Peso normal!");
        } else if (imc >= 25 && imc <= 29.9) {
            setImc(df.format(imc) + " - Imc 25 a 29.9 - Sobre peso!");
        } else if (imc >= 30 && imc <= 34.9) {
            setImc(df.format(imc) + " - Imc 30 a 34.9 - Obesidade grau I!");
        } else if (imc >= 35 && imc <= 39.9) {
            setImc(df.format(imc) + " - Imc 35 a 39.9 - Obesidade Grau II");
        } else {
            setImc(df.format(imc) + " - imc acima de 40 - Obesidade Grau III");
        }
        if(peso <=0){
            setImc("ERRO!!! - O PESO NÃO É VÁLIDO.");
        }else if(altura <= 0){
            setImc("ERRO!!! - A ALTURA NÃO É VÁLIDA");
        }
    }
    public void btCalculaInvest(ActionEvent ae){
        DecimalFormat df = new DecimalFormat("#.##");
        double renda =(Cpcapital* Math.pow((1+Cptaxa), Cpperiodo));
        setInvest(df.format(renda) );
        if(Cpperiodo <= 0.0){
            setInvest("ERRO!-PERIODO NÃO VALIDO.");
        }else if(Cptaxa <=0.0){
            setInvest("ERRO!-TAXA NÃO VALIDA.");
        }
        
    }
    public void btCalculaSalario(ActionEvent ae){
        DecimalFormat df = new DecimalFormat("#.###");
       if(CpSalario <= 1000){
           setCpNovoSal( ""+ df.format(CpSalario*1.20));
       }else if(CpSalario > 1000 && CpSalario <= 3000){
           setCpNovoSal(""+df.format(CpSalario * 1.15));
       }else if(CpSalario > 3000){
           setCpNovoSal(""+df.format(CpSalario * 1.10));
       }
       if(CpSalario <= 0){
           setCpNovoSal("ERRO!!!-NÃO É VÁLIDO!");
          
    }
    }

    public int getCpn1() {
        return Cpn1;
    }

    public void setCpn1(int Cpn1) {
        this.Cpn1 = Cpn1;
    }

    public int getCpn2() {
        return Cpn2;
    }

    public void setCpn2(int Cpn2) {
        this.Cpn2 = Cpn2;
    }

    public int getCpn3() {
        return Cpn3;
    }

    public void setCpn3(int Cpn3) {
        this.Cpn3 = Cpn3;
    }

    public String getCpNumeroMaior() {
        return CpNumeroMaior;
    }

    public void setCpNumeroMaior(String CpNumeroMaior) {
        this.CpNumeroMaior = CpNumeroMaior;
    }

    public String getCpNumeroSoma() {
        return CpNumeroSoma;
    }

    public void setCpNumeroSoma(String CpNumeroSoma) {
        this.CpNumeroSoma = CpNumeroSoma;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getImc() {
        return imc;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }

    public Double getnMaior() {
        return nMaior;
    }

    public void setnMaior(Double nMaior) {
        this.nMaior = nMaior;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public Double getCpcapital() {
        return Cpcapital;
    }

    public void setCpcapital(Double Cpcapital) {
        this.Cpcapital = Cpcapital;
    }

    public Double getCptaxa() {
        return Cptaxa;
    }

    public void setCptaxa(Double Cptaxa) {
        this.Cptaxa = Cptaxa;
    }

    public Double getCpperiodo() {
        return Cpperiodo;
    }

    public void setCpperiodo(Double Cpperiodo) {
        this.Cpperiodo = Cpperiodo;
    }

    public String getInvest() {
        return Invest;
    }

    public void setInvest(String Invest) {
        this.Invest = Invest;
    }

    public Double getCpSalario() {
        return CpSalario;
    }

    public void setCpSalario(Double CpSalario) {
        this.CpSalario = CpSalario;
    }

    public Double getCpPercentual() {
        return CpPercentual;
    }

    public void setCpPercentual(Double CpPercentual) {
        this.CpPercentual = CpPercentual;
    }

    public String getCpNovoSal() {
        return CpNovoSal;
    }

    public void setCpNovoSal(String CpNovoSal) {
        this.CpNovoSal = CpNovoSal;
    }

   
 }
