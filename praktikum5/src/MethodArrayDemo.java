public class MethodArrayDemo {
    static double hitungratarata(int[] data){
        int total =0;
        for(int nilai :data){
            total +=nilai;

        }
        return (double) total / data.length;
    }
    static int cariMaksimum(int[] data){
        int max =data[0];
        for(int nilai :data){
            if (nilai> max){
                max = nilai;

            }
        }
        return max;
    }
    static int[] urutkanAscending(int[] data){
        int[]hasil =data.clone(); //salin dlu agar array asli tidak berubah
        for(int i =0; i< hasil.length;i++){
            for (int j =0; j< hasil.length -1 -i;j++){
                if (hasil[j] > hasil[j+1]){
                    int temp = hasil[j];
                    hasil[j] =hasil[j+1];
                    hasil[j+1] =temp;
                }
            }
        }
        return hasil;
    }
    public static void main(String[] args){
        int[] nilaiujian ={80,75,90,60,88};

        System.out.println("rata-rata: "+hitungratarata(nilaiujian));
        System.out.println("nilai maksimum: "+cariMaksimum(nilaiujian));

        int[]terurut=urutkanAscending(nilaiujian);
        System.out.print("setelah di urutkan");
        for(int n: terurut){
            System.out.print(n +" ");
        }
    }
}
