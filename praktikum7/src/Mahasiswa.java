public class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;




        //constructor dengan parameter
       public Mahasiswa(String nama,String nim,double ipk){
        this.nama=nama;
        this.nim=nim;
        this.ipk=ipk;
       }

   public String getnama(){
           return nama;

   }
   public String getnim(){
           return nim;
   }
   public double getipk(){
           return ipk;
   }
   public void setipk(double ipk){
           if(ipk>=0.0&&ipk <=4.0){
               this.ipk=ipk;
           }else{
               System.out.println("ipk tidak valid,harus 0.0 -4.0");
           }
   }




}
