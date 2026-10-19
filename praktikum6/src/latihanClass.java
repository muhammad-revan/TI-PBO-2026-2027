public class latihanClass {
    public static void main(String[] args){
        Mahasiswa m1= new Mahasiswa();

        m1.nama="muhammad revan triadi";
        m1.nim ="2025573010082";
        m1.ipk = 3.63;

        Mahasiswa m2 = new Mahasiswa();
        m2.nama ="muhammad varel";
        m2.nim ="2025573010084";
        m2.ipk =3.60;

        System.out.println("nama:"+m1.nama+"-"+m1.ipk);
        System.out.println("nim:"+m2.nama +"-"+m2.ipk);

    }
}
