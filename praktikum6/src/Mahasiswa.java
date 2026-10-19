public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    //constructur default(tanpa parameter)
    public Mahasiswa(){
        nama="belum diisi";
        nim ="-";
        ipk=0.0;

    }
        //constructor dengan parameter
       public Mahasiswa(String nama,String nim,double ipk){
        this.nama=nama;
        this.nim=nim;
        this.ipk=ipk;


       }
}
