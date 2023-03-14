package escola;
/*autores:
 Caio Ludo Passos Moreira, Allan Fernandes, João Pedro Ranolfi;
*/
public class dadosPessoais {
    public String nome, CPF, RG, dataNascimento;
    
    public String dataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public String CPF(){
        return CPF;
    }
    
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    
    public String nome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRG(){
        return RG;
    }
    public void setRG(String RG){
        this.RG = RG;
    }
    
}