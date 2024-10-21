/**
 *
 * @author Gustavo
 * Clube Cultural
 * Aplicação para controle de empréstimo de HQs
 * Início: 01/10/2024
 */
import java.io.IOException;
import javax.swing.JOptionPane;
public class ClubeCulturalMain {
    
    public static void main(String[] args) throws IOException {
        CadAmigos[] cFriends = new CadAmigos[3];
        CadHQ[] cComics = new CadHQ[3];
        CCMeth CC = new CCMeth();
        int opc = 0;
        while (opc != 9) {            
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro de Amiguinhos  \n2 - Cadastrar HQs \n3 - Novo Empréstimo \n9 - Finalizar"));
            switch (opc) {
                case 1:
                    cFriends = CC.FCadastro(cFriends);
                    break;
                case 2:
                    cComics = CC.FCadastroHQ(cComics);
                    break;
                case 3:
                    CC.Emprestimo(cFriends, cComics);
                    break;                    
                case 9:
                    JOptionPane.showMessageDialog(null,"Encerrar Programa");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");  
            }
        }
    }    
}
