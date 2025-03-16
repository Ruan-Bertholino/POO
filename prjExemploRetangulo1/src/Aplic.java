
import fatec.poo.model.Retangulo;

/**
 *
 * @author Ruan Bertholino
 */



public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet, objRet2;
        objRet = new Retangulo();
        objRet.setAltura(8.0);
        objRet.setBase(5.0);
        System.out.println("Medida da alruta: "+ objRet.getAltura());
        System.out.println("Medida da base: "+ objRet.getBase());
        System.out.println("Area total: "+objRet.CalcArea());
        System.out.println("Perimetro: "+ objRet.CalcPerimetro());
        System.out.println("Diagonal: "+ objRet.calcDiagonal());
        objRet2 = new Retangulo();
        objRet2.setAltura(3.0);
        objRet2.setBase(4.0);
        System.out.println("\n\nMedida da alruta: "+ objRet2.getAltura());
        System.out.println("Medida da base: "+ objRet2.getBase());
        System.out.println("Area total: "+objRet2.CalcArea());
        System.out.println("Perimetro: "+ objRet2.CalcPerimetro());
        System.out.println("Diagonal: "+ objRet2.calcDiagonal());
    }
}
