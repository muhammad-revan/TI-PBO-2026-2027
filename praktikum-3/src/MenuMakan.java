import java.util.Scanner;

public class MenuMakan {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("===menu makanan===");
        System.out.println("ayam bakar");
        System.out.println("ayam geprek");
        System.out.println("nasi goreng");
        System.out.println("nasi gurih");

        System.out.print("pilih menu makanan(1-4):");
        int pilihan = sc.nextInt();

        switch(pilihan){
            case 1:
                System.out.println("anda memilih ayam bakar");
                break;
            case 2:
                System.out.println("anda memilih ayam geprek");
                break;
            case 3:
                System.out.println("anda memilih nasi goreng");
                break;
            case 4:
                System.out.println("anda memilih nasi gurih");
                break;
            default:
                System.out.println("pilihan tidak valid");
        }
    }
}
