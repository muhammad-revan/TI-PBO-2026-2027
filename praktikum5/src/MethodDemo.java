public class MethodDemo {
    // method void:tidak mengembalikan nilai apapun
    static void tampilkanbiodata(String nama, int umur, String kota){

        System .out .println (nama + " (" + umur + " tahun) - " + kota );
    }
    public static void main(String[] args){
        //panggil pada method main
       tampilkanbiodata("Budi",20,"bandung");
    }
}
