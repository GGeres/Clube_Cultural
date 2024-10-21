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
        
        for(i = 0; i < 2; i++){
            cAmigos[i] = new CadAmigos();
        }
        
        for(i = 0; i < 2; i++){
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
        
        for(i = 0; i < 2; i++){
            cHQ[i] = new CadHQ();
        }
        
        for(i = 0; i < 2; i++){
            cHQ[i].nEdition = Integer.parseInt(JOptionPane.showInputDialog("Número da Edição"));
                save.write(Integer.toString(cHQ[i].nEdition));
                save.newLine();
            cHQ[i].YearEdition = Integer.parseInt(JOptionPane.showInputDialog("Ano de Publicação"));
                save.write(Integer.toString(cHQ[i].YearEdition));
                save.newLine();
            cHQ[i].HQName = JOptionPane.showInputDialog("Nome da HQ");
                save.write(cHQ[i].HQName);
                save.newLine();
        }
        System.out.println("GRAVACAO FEITA COM SUCESSO ");
        save.close();
        return cHQ;
    }
    
    public void Emprestimo(CadAmigos[] Friends, CadHQ[] cHQ)throws IOException{
        CadAmigos[] Emprestado = new CadAmigos[1];
        CadHQ[] HQEmprestado = new CadHQ[1];
        int i;
        String fileName1 = "ArquivoClubeCultural.txt";
        BufferedReader read1 = new BufferedReader(new FileReader(fileName1));
        for(i = 0; i < 2; i++){
            Friends[i].FriendName = read1.readLine();
            Friends[i].FriendMom = read1.readLine();
            Friends[i].PhoneNumber = read1.readLine();
            Friends[i].EscolaPredio = read1.readLine();
        }
        
        String fileName2 = "ArquivoHQ.txt";
        BufferedReader read2 = new BufferedReader(new FileReader(fileName2));
        for(i = 0; i < 2; i++){
            cHQ[i].nEdition = Integer.parseInt(read2.readLine());
            cHQ[i].YearEdition = Integer.parseInt(read2.readLine());
            cHQ[i].HQName = read2.readLine();
        }
        int opc1;
        opc1 = Integer.parseInt(JOptionPane.showInputDialog("Quem irá fazer o emprestimo? \n1 - "+Friends[0].FriendName+"\n2 - "
                + Friends[1].FriendName+"\n3 - "+Friends[2].FriendName));//+"\n4 - "+Friends[3].FriendName+"\n5 - "+Friends[4].FriendName));
        switch(opc1){
            case 1:
                i = (opc1 - 1);
                Emprestado[0] = Friends[i];
                break;
            case 2:
                i = (opc1 - 1);
                Emprestado[0] = Friends[i];
                break;
            case 3:
                i = (opc1 - 1);
                Emprestado[0] = Friends[i];
                break;
            /*case 4:
                i = (opc1 - 1);
                Emprestado[0] = Friends[i];
                break;
            case 5:
                i = (opc1 - 1);
                Emprestado[0] = Friends[i];
                break;*/
        }
        
        
        int opc2;
        opc2 = Integer.parseInt(JOptionPane.showInputDialog("Qual HQ? \n1 - "+cHQ[0].HQName+"\n2 - "
                + cHQ[1].HQName+"\n3 - "+cHQ[2].HQName));//+"\n4 - "+cHQ[3].HQName+"\n5 - "+cHQ[4].HQName));
        switch(opc2){
            case 1:
                i = (opc2 - 1);
                HQEmprestado[0] = cHQ[i];
                break;
            case 2:
                i = (opc2 - 1);
                HQEmprestado[0] = cHQ[i];
                break;
            case 3:
                i = (opc2 - 1);
                HQEmprestado[0] = cHQ[i];
                break;
            /*case 4:
                i = (opc2 - 1);
                HQEmprestado[0] = cHQ[i];
                break;
            case 5:
                i = (opc2 - 1);
                HQEmprestado[0] = cHQ[i];
                break;*/
        }               
        JOptionPane.showMessageDialog(null, "O Amiguinho "+Emprestado[0].FriendName+" pegou emprestado a revista "+HQEmprestado[0].HQName);   
    }
}
