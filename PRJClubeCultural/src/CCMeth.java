/**
 *
 * @author Gustavo
 */
import java.io.*;
import javax.swing.JOptionPane;
public class CCMeth {
    
    public CadAmigos[] FCadastro(CadAmigos[] cAmigos)throws IOException{
    
        int i;
        String fileName = "ArquivoClubeCultural.txt";
        BufferedWriter save = new BufferedWriter(new FileWriter(fileName));
        
        for(i = 0; i < 1; i++){
            cAmigos[i] = new CadAmigos();
        }
        
        for(i = 0; i < 1; i++){
            cAmigos[i].FriendName = JOptionPane.showInputDialog("Qual o nome do Amiguinho?");
                save.write(cAmigos[i].FriendName);
                save.newLine();
            cAmigos[i].FriendMom = JOptionPane.showInputDialog("Qual o nome da mãe do amiguinho?");
                save.write(cAmigos[i].FriendMom);
                save.newLine();
            cAmigos[i].PhoneNumber = JOptionPane.showInputDialog("Digite o telefone de contato");
                save.write(cAmigos[i].PhoneNumber);
                save.newLine();
            cAmigos[i].EscolaPredio = JOptionPane.showInputDialog("Ele é da Escola ou do Prédio?");
                save.write(cAmigos[i].EscolaPredio);
                save.newLine();
        }
        System.out.println("GRAVACAO FEITA COM SUCESSO ");
        save.close();
        return cAmigos;
    }  
    
    public CadHQ[] FCadastroHQ(CadHQ[] cHQ) throws IOException{
        
        int i;
        String fileName = "ArquivoHQ.txt";
        BufferedWriter save = new BufferedWriter(new FileWriter(fileName));
        
        for(i = 0; i < 1; i++){
            cHQ[i] = new CadHQ();
        }
        
        
    }
}
