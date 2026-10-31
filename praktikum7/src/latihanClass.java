public class latihanClass {
    public static void main(String[] args){


        Mahasiswa m1 =new Mahasiswa("budi","111",3.5);
       m1.ipk =9.9;//seharrusnya tidak masuk akal,ipk maksimal 4.0
       m1.nim ="";//nim kosong seharusnya tidak valid

        System.out.println(m1.ipk);



    }
}
