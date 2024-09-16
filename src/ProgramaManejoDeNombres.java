import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese nombre de familiar o amigo:");
            String familiar1 = scanner.nextLine();
            int l1 = familiar1.length();
            String familiar1Toqueteado = familiar1.substring(1,2).toUpperCase() + "." + familiar1.substring(l1-2,l1);

            System.out.println("Ingrese nombre de otro familiar o amigo:");
            String familiar2 = scanner.nextLine();
            int l2 = familiar2.length();
            String familiar2Toqueteado = familiar2.substring(1,2).toUpperCase() + "." + familiar2.substring(l2-2,l2);

            System.out.println("Ingrese nombre del último familiar o amigo:");
            String familiar3 = scanner.nextLine();
            int l3 = familiar3.length();
            String familiar3Toqueteado = familiar3.substring(1,2).toUpperCase() + "." + familiar3.substring(l3-2,l3);


            String respuesta = familiar1Toqueteado + "-" + familiar2Toqueteado + "-" + familiar3Toqueteado;
            System.out.println(respuesta);

        }
        catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }


    }
}
