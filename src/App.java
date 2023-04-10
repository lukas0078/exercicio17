import java.util.Scanner;
/* Nome do Aluno: Lukas santos rufino
* RA: 12723134472
* Data: 09/04/2023 */
public class App {
    public static void main(String[] args) throws Exception {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Qual a área em M2 que será pintada? ");
    float area = entrada.nextFloat();

    double litros = area /6;
    double latas = Math.ceil(litros/18);
    double preco = latas * 80;
    double galoes = Math.ceil(litros/3.6);

    if(galoes % 3.6 != 0){
       galoes += 1;       
    }

    double preco2 = galoes * 25;

    double mistura_lata = Math.ceil(litros / 18.0);
    double mistura_galao = Math.ceil((litros - (mistura_lata * 18)) / 3.6);

    if(litros - (mistura_lata * 18) % 3.6 != 0){
    mistura_galao += 1;
    }


    System.out.println("Apenas latas de 18 litros: " + latas +"unidade e o preço equivale a " + preco);
    System.out.println("Apenas galões de 3.6 litros: " + galoes + "unidade e o preço equivale a " + preco2);
    System.out.println("Mistura: " + mistura_lata +" latas e " + mistura_galao  +" galoes = " + ((mistura_lata * 80) + (mistura_galao * 25)));

    entrada.close();
}    
}