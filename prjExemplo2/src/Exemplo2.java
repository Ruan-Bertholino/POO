/**
 *
 * @author Ruan
 */
public class Exemplo2 
{
    public static void main(String[] args) 
    {
        int x;
        
        x = (int)(Math.random()*100);
        if(x < 50){
            System.out.println("o valor "+ x + "é menor que 50");
        } else{
            System.out.println(" o valor "+x+" È maior ou igual 50");
        }
    }    
}
