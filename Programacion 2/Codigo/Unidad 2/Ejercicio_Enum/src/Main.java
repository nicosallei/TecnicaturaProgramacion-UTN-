
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un dia de la semana");
        String dia = sc.next().toUpperCase();
        

        DiasSemana diaS = DiasSemana.valueOf(dia);
        System.out.println(diaS.toString());
       

    }

}
