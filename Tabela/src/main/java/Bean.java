
import java.awt.event.ActionEvent;
import javax.faces.bean.*;
import java.io.Serializable;
import java.util.*;
import model.*;
import javax.faces.model.*;

/**
 *
 * @author joari
 */
@ManagedBean(name = "ct")
@SessionScoped
public class Bean implements Serializable {

    public Bean() {
        pos = -1;
    }//build
    private String cpNome;
    private String cpContato;
    private ArrayList<Cliente> vetor = new ArrayList<>();
    private DataModel dados;
    Cliente cli;
    int pos;

    public void btAlterar(ActionEvent a) {
        cli = (Cliente) dados.getRowData();
        pos = dados.getRowIndex();
        setCpNome(cli.getNomCli());
        setCpContato(cli.getConCli());

    }//btalterar

    public void btLimpaTab(ActionEvent a) {
        vetor.clear();
        atualiza();
        pos = -1;

    }//btlimpa tabela

    public void btExcluir(ActionEvent a) {
        cli = (Cliente) dados.getRowData();
        vetor.remove(cli);
        pos = -1;
        atualiza();

    }//btexcluir

    public void btSalvar(ActionEvent a) {
        cli = new Cliente();
        cli.setNomCli(getCpNome());
        cli.setConCli(getCpContato());
        if(pos==-1){
        vetor.add(cli);
        }else{
            vetor.set(pos, cli);
        }
        atualiza();
        LimparCampos();

    }//salvar

    public void LimparCampos() {
        setCpNome("");
        setCpContato("");
        cli = null;
        pos = -1;
    }

    public void atualiza() {
        dados = new ListDataModel(vetor);
    }//atualiza

///////////////////////////get e setter
    public String getCpNome() {
        return cpNome;
    }

    public void setCpNome(String cpNome) {
        this.cpNome = cpNome;
    }

    public String getCpContato() {
        return cpContato;
    }

    public void setCpContato(String cpContato) {
        this.cpContato = cpContato;
    }

    public ArrayList<Cliente> getVetor() {
        return vetor;
    }

    public void setVetor(ArrayList<Cliente> vetor) {
        this.vetor = vetor;
    }

    public DataModel getDados() {
        return dados;
    }

    public void setDados(DataModel dados) {
        this.dados = dados;
    }

}//class
