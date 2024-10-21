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
        CadAmigos[] cFriends = new CadAmigos[5];
        CadHQ[] cComics = new CadHQ[5];
        CCMeth CC = new CCMeth();
        int opc = 0;
        while (opc != 9) {            
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Novo Empréstimo  \n2 - Cadastrar HQs \n3 - Cadastro de Amiguinhos \n4 - Amiguinhos  \n9 - Fim"));
            switch (opc) {
                case 1:
                    cFriends = CC.FCadastro(cFriends);
                    break;
                case 2:
                    cComics = CC.FCadastroHQ(cComics);
                    break;
                case 3:
                    //JOptionPane.showMessageDialog(null, "Novo Cadastro");
                    
                    break;
                case 4:
                    //JOptionPane.showMessageDialog(null, "Amiguinhos");
                    
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
