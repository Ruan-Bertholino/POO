
import fatec.poo.model.Retangulo;
import java.util.Scanner;


 /*
 * @author Ruan
 */
public class Aplic {
    
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        double medAlt, medBase;
        System.out.println("Digite a altura: ");
        medAlt=Ler.nextDouble();
        System.out.println("\nDigite a base: ");
        medBase=Ler.nextDouble();
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        System.out.println("Medida da alruta: "+ objRet.getAltura());
        System.out.println("Medida da base: "+ objRet.getBase());
        System.out.println("Area total: "+objRet.CalcArea());
        System.out.println("Perimetro: "+ objRet.CalcPerimetro());
        System.out.println("Diagonal: "+ objRet.calcDiagonal());
    }
}
