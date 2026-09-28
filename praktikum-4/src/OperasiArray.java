public class OperasiArray {
    public static void main(String[] args){
        int[] nilai ={80,75,90,60,88};
        int total =0;
        int max=nilai[0];
        int min =nilai[0];
        int cari =90;
        int posisi=-1;


        for(int n : nilai){
            total +=n; //sama dengan total = total + n

        }
        double ratarata=(double)total/nilai.length;

        System.out.println("total :" +total);
        System.out.println("rata-rata: "+ratarata);

        System.out.println();
       for(int i=1;i<nilai.length;i++){
           if(nilai[i]>max){
               max = nilai[i];

           }
           if(nilai[i]<min){
               min =nilai[i];
           }
       }
        System.out.println("nilai maksimum adalah: "+max);
        System.out.println("nilai minimum adalah: "+min);

        System.out.println();

        for(int i =0;i< nilai.length;i++){
            if (nilai[i]==cari){
            posisi= i;
            }
        }
        if(posisi != -1){
            System.out.println("nilai "+cari+ " ditemukan di indeks "+posisi);

        }else{
            System.out.println("nilai "+cari +" tidak ditemukan");
        }
    }
}
