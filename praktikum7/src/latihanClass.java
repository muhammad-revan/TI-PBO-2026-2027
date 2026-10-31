public class latihanClass {
    public static void main(String[] args){


        Mahasiswa m1 =new Mahasiswa("budi","111",3.5);
        System.out.println("Nama:" +m1.getnama());
        System.out.println("IPK:" +m1.getipk());

        m1.setipk(3.8); //valid
        System.out.println("ipk sekarang:"+m1.getipk());

        m1.setipk(9.9);//tidak valid
        System.out.println("ipk sekarang:"+m1.getipk());



    }
}
