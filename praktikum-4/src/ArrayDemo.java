public class ArrayDemo {
    public static void main(String[] args){
        //cara 1 :deklarasi langsung dengan nilai awal
        int[] nilai ={80,75,90,60,88};

        //cara 2 : deklarasi ukuran dulu,isi belakangan
        String[] namahari = new String[3];
        namahari[0]="senin";
        namahari[1]="selasa";
        namahari[2]="rabu";

        System.out.println("Elemen pertama nilai:"+nilai[0]);
        System.out.println("jumlah elemen: "+nilai.length);
        System.out.println("hari kedua: "+namahari[1]);

        System.out.println();

        System.out.println("---menggunakan for biasa ---");
        for(int i=0;i<nilai.length;i++){
            System.out.println("indeks "+i+ "; "+nilai[i]);

        }
        System.out.println();

        System.out.println("---menggunakan enhanced for---");
        for(int n : nilai) {
            System.out.println(n);
        }
    }
}
