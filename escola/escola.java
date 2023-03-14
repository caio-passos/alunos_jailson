package escola;
import javax.swing.JOptionPane;
/*autores:
 Caio Passos, Allan Fernandes, João Pedro Ranolfi;
*/
public class escola {

    public static void main(String[] args) {

        int id=0, con=0;
        String impressao = "";
        aluno alu = new aluno();
        String lista[] = new String [5];

        do{

            alu.setRA(Integer.parseInt(JOptionPane.showInputDialog(null, "RA")));
            alu.setNome(JOptionPane.showInputDialog(null, "Nome"));
            alu.setDataNascimento(JOptionPane.showInputDialog(null, "Data de Nascimento"));
            alu.setCPF(JOptionPane.showInputDialog(null, "CPF"));
            alu.setRG(JOptionPane.showInputDialog(null, "RG"));
            alu.setCurso(JOptionPane.showInputDialog(null, "Curso"));
            alu.setTurma(JOptionPane.showInputDialog(null, "Turma"));
            alu.setTurno(JOptionPane.showInputDialog(null, "Turno"));

            impressao="RA: " + alu.getRA() + "\n Nome: " + alu.nome() + "\n Data de nascimento: " + alu.dataNascimento() + "\n CPF: " + alu.CPF() + "\n RG: " + alu.getRG()+ "\n Curso: " + alu.getCurso() + "\n Turma: " + alu.getTurma() + "\n Turno: " + alu.getTurno() + "\n";
            lista[id] = impressao;
            con = JOptionPane.showConfirmDialog(null, impressao, "Confirmação", con);
            id++;
        }
        while ((id<5)&& (con == 0));
        JOptionPane.showMessageDialog(null, String.join("", lista));
    }

}
