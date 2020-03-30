
/**
 * Escreva a descrição da classe UsaCartao aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class UsaCartao
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        CartaoCredito cartao = new CartaoCredito(666666666 ,"Master Card");
        
        String name = teclado.nextLine();
        int menu = 0 ;
        
        System.out.println("Menu do Cartão");
        System.out.println("--------------------------------------------");
        System.out.println("Digite 1 para atualizar a bandeira do cartão");
        System.out.println("Digite 2 para atualizar o limite");
        System.out.println("Digite 3 para fazer uma compra");
        System.out.println("Digite 4 para pagar");
        System.out.println("Digite 5 para Consultar seu cartão");
        System.out.println("Digite 9 para encerrar");
        System.out.println("--------------------------------------------");
        
        while(menu != 9){
            menu = teclado.nextInt();
            teclado.nextLine();
            switch(menu){
             case 1: System.out.println("Digite o nome da bandeira do cartão: ");
             cartao.setBandeira(teclado.nextLine());
             System.out.println("");
             System.out.println("--------------------------------------------");
             System.out.println("Digite 1 para atualizar a bandeira do cartão");
             System.out.println("Digite 2 para atualizar o limite");
             System.out.println("Digite 3 para fazer uma compra");
             System.out.println("Digite 4 para pagar");
             System.out.println("Digite 5 para Consultar seu cartão");
             System.out.println("Digite 9 para encerrar");
             System.out.println("--------------------------------------------");
             break;
             
             case 2: System.out.println("Digite o limite do seu cartão: ");
             cartao.setLimite(teclado.nextFloat());
             System.out.println("");
             System.out.println("--------------------------------------------");
             System.out.println("Digite 1 para atualizar a bandeira do cartão");
             System.out.println("Digite 2 para atualizar o limite");
             System.out.println("Digite 3 para fazer uma compra");
             System.out.println("Digite 4 para pagar");
             System.out.println("Digite 5 para Consultar seu cartão");
             System.out.println("Digite 9 para encerrar");
             System.out.println("--------------------------------------------");
             break;
             
             case 3: System.out.println("Digite o valor da compra: ");
             cartao.addComprar(teclado.nextFloat());
             System.out.println("");
             System.out.println("--------------------------------------------");
             System.out.println("Digite 1 para atualizar a bandeira do cartão");
             System.out.println("Digite 2 para atualizar o limite");
             System.out.println("Digite 3 para fazer uma compra");
             System.out.println("Digite 4 para pagar");
             System.out.println("Digite 5 para Consultar seu cartão");
             System.out.println("Digite 9 para encerrar");
             System.out.println("--------------------------------------------");
             break;
             
             case 4: System.out.println("Digite o quanto vai pagar da compra: ");
             cartao.addPagar(teclado.nextFloat());
             System.out.println("");
             System.out.println("--------------------------------------------");
             System.out.println("Digite 1 para atualizar a bandeira do cartão");
             System.out.println("Digite 2 para atualizar o limite");
             System.out.println("Digite 3 para fazer uma compra");
             System.out.println("Digite 4 para pagar");
             System.out.println("Digite 5 para Consultar seu cartão");
             System.out.println("Digite 9 para encerrar");
             System.out.println("--------------------------------------------");
             break;
             
             case 5: System.out.println("Numero do Cartão: " + cartao.getNumero());
                     System.out.println("Nome da Bandeira: " + cartao.getBandeira());
                     System.out.println("Bônus do Cartão: " + cartao.getBonus());
                     System.out.println("Limite do Cartão: " + cartao.getLimite());
                     System.out.println("Saldo do Cartão: " + cartao.getSaldo());
                     
                     System.out.println("");
                     System.out.println("--------------------------------------------");
                     System.out.println("Digite 1 para atualizar a bandeira do cartão");
                     System.out.println("Digite 2 para atualizar o limite");
                     System.out.println("Digite 3 para fazer uma compra");
                     System.out.println("Digite 4 para pagar");
                     System.out.println("Digite 5 para Consultar seu cartão");
                     System.out.println("Digite 9 para encerrar");
                     System.out.println("--------------------------------------------");
             break;
             default : 
             if(menu > 9){
              System.out.println("Error404");
             }
             System.out.println("");
             System.out.println("--------------------------------------------");
             System.out.println("Digite 1 para atualizar a bandeira do cartão");
             System.out.println("Digite 2 para atualizar o limite");
             System.out.println("Digite 3 para fazer uma compra");
             System.out.println("Digite 4 para pagar");
             System.out.println("Digite 5 para Consultar seu cartão");
             System.out.println("Digite 9 para encerrar");
             System.out.println("--------------------------------------------");
             break;
            }
        }
    }
}
