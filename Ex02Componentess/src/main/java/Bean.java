


import java.awt.event.ActionEvent;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;


@ManagedBean(name = "ct")
@SessionScoped
public class Bean implements Serializable {

   private String cpNome;
   private String cpCurso;
   private String cpSexo;
   private Boolean cpinfo;
   private String cpSenha; 
   
    public Bean() {
        limpar();
    }//buider
    
    public void btlimpar(ActionEvent ae){
        limpar();
        
    }
    
    public String btEx01(ActionEvent ae){
        limpar();
        return "ex01";        
    }
    public String btCadastrar(ActionEvent ae){
        cadastrar();
        return "Ex01res";
    }
    
    public void cadastrar( ){
        setCpNome(getCpNome()+ "XXXXXXXXXXX");
        
    }
    public void limpar(){
        setCpNome("");
        setCpCurso("");
        setCpSexo("");
        setCpinfo(false);
        setCpSenha("");
    }
    
    ////////////////////////////////////////////

    public String getCpNome() {
        return cpNome;
    }

    public void setCpNome(String cpNome) {
        this.cpNome = cpNome;
    }

    public String getCpCurso() {
        return cpCurso;
    }

    public void setCpCurso(String cpCurso) {
        this.cpCurso = cpCurso;
    }

    public String getCpSexo() {
        return cpSexo;
    }

    public void setCpSexo(String cpSexo) {
        this.cpSexo = cpSexo;
    }

    public Boolean getCpinfo() {
        return cpinfo;
    }

    public void setCpinfo(Boolean cpinfo) {
        this.cpinfo = cpinfo;
    }

    public String getCpSenha() {
        return cpSenha;
    }

    public void setCpSenha(String cpSenha) {
        this.cpSenha = cpSenha;
    }
    
}
