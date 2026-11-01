public class siswa {
    private double nilai;

    public siswa(double nilai) {
        this.nilai = nilai;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        if(nilai>=0&&nilai<=100){
            this.nilai=nilai;
        }else{
            System.out.println("ditolak,nilai harus rentang 0-100");
        }

    }
    public String getnilaihuruf(){
        if (nilai>=80){
            return "A";
        }else if (nilai>=70){
            return "B";

        }else if (nilai>=60){
            return "C";

        }else if (nilai>=50){
            return "D";
        }else{
            return "E";
        }
    }
}
