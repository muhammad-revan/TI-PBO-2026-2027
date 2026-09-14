import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        //konstanta tarif listik per kWh
        final double tarif_450=500;
        final double tarif_900=1000;
        final double tarif_2200=1500;
        final double tarif_atas_2200=2000;
        //input golongan daya
        System.out.print("masukkan golongan daya listrik: ");
        int daya = sc.nextInt();

        //input pemakaian listrik
        System.out.print("jumlah pemakaian listrik(kWh):");
        double pemakaian= sc.nextDouble();

        //validasi pemakaian menggunakan operator logika
        if(pemakaian<=0){
            System.out.println("error");
            return;
        }
         double tarif =0;
        String golongan ="";
       //menentukan golongan daya dan tarif
        if(daya ==450){
            golongan= "450 va";
            tarif=tarif_450;
        } else if (daya==900) {
            golongan="900 va";
            tarif =tarif_900;

        }else if(daya==2200) {
            golongan="2200 va";
            tarif =tarif_2200;

        }else if(daya>2200){
            golongan="di atas 2200 va";
            tarif = tarif_atas_2200;
        }else{
            System.out.println("error");
        }
        //rumus menghitung total tagihan
        double totaltagihan= pemakaian*tarif;

        //menampilkan hasil
        System.out.println("==tagihan listik==");
        System.out.println("golongan daya: "+golongan);
        System.out.println("jumlah kWh: "+pemakaian);
        System.out.println("tarif per kWh: "+tarif);
        System.out.println("total tagihan: "+totaltagihan);

    }
}
