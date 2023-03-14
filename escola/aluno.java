package escola;
/*autores:
 Caio Passos, Allan Fernandes, João Pedro Ranolfi;
*/
public class aluno extends dadosPessoais {

    private int RA;
    private String Curso, Turma, Turno;
    
        
    public int getRA() {
        return RA;
    }
   
    public void setRA(int RA){
        this.RA = RA;
    }

   public String getCurso(){
   return Curso;
   }

   public void setCurso(String Curso){
    this.Curso = Curso;
   }

   public String getTurma(){
    return Turma;
   }
    public void setTurma(String Turma){
        this.Turma =  Turma;
    }
    public String getTurno(){
        return Turno;
    }

    public void setTurno(String Turno){
        this.Turno = Turno;
    }

    public String nome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}