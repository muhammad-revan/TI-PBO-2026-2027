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

    public void tampilkandata(){
               System.out.println("nama:"+nama);
               System.out.println("nim:"+nim);
               System.out.println("ipk:"+ipk);
           }

           public boolean isCumlaude(){
        return ipk >=3.5;
           }


}
