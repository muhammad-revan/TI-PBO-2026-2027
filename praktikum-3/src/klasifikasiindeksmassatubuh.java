import java.util.Scanner;

public class klasifikasiindeksmassatubuh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan berat badan(kg): ");
        double beratbadan= sc.nextDouble();
        System.out.print("masukkan tinggi(meter): ");
        double tinggi = sc.nextDouble();

        tinggi=tinggi/100;
        double bmi = beratbadan/(tinggi*tinggi);
        System.out.println("bmi anda: " +bmi);

        if(bmi <18.5){
            System.out.println("kurus");

        }else if (bmi<25){
            System.out.println("normal");
        }else if (bmi<30){
            System.out.println("gemuk");

        }else{
            System.out.println("obesitas");
        }
    }
}
