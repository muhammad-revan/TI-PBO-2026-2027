public class latihan4array {
    public static void main (String[] args){
        Buku[] daftar= new Buku[4];

        daftar[0] = new Buku("matriks","alvin",2025);
        daftar[1] = new Buku("SPLTV","farel",2014);
        daftar[2] = new Buku("vektor","kaisar",2013);
        daftar[3] = new Buku("python","sulti",2015);

    for(Buku B :daftar){
        if (B.tahunterbit >= 2015){
            B.tampilkandata();
            System.out.println("---");
        }

    }
    }
}
