public class LogikaDemo {
    public static void main(String[] args){
        int nilaiujian =80;
        int kehadiran =90; //persen

        if (nilaiujian>=75 && kehadiran>=80) {
            System.out.println("lulus mata kuiah");
        }else{
            System.out.println("tidak lulus mata kuliah");
        }

        boolean punyaKTP= false;
        boolean punyasim=true;

        if(punyaKTP||punyasim){
            System.out.println("boleh menyewa kendaraan");
        }
        if(!punyaKTP){
        System.out.println("KTP belum tersedia");
        }


    }
}
