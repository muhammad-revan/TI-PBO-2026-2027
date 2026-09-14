import java.util.Scanner;

public class Bilanganterbesar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("masukan angka 1: ");
        int a = sc.nextInt();
        System.out.print("masukkan angka 2: ");
        int b = sc.nextInt();
        System.out.print("masukkan angka 3: ");
        int c = sc.nextInt();
        int terbesar;

        if(a>b&&a>c){
            terbesar=a;

        } else if (b>a&&b>c) {
            terbesar=b;

        }else{
            terbesar=c;

        }
        System.out.println("bilangan terbesar adalah: "+terbesar);

    }
}
