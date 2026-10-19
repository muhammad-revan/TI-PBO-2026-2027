public class DaftarMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] daftar = new Mahasiswa[3];

        daftar[0] = new Mahasiswa("muhammad revan triadi", "2025573010082", 3.63);
        daftar[1] = new Mahasiswa("muhammad varel", "2025573010084", 3.60);
        daftar[2] = new Mahasiswa("alvin malauana", "2025573010003", 3.60);


        for (Mahasiswa m : daftar) {
            m.tampilkandata();
            System.out.println("---");


        }

        int jumlahcumlaude = 0;
        for (Mahasiswa m : daftar) {
            if (m.isCumlaude()) {
                jumlahcumlaude++;
            }
        }
        System.out.println("jumlah mahasiswa cumlaude:" + jumlahcumlaude);
    }
}
