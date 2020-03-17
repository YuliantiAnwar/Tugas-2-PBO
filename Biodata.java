public class Biodata{
    public String nama, nim, jurusan, fakultas;

  Biodata(){
	nama = "Yulianti A";
	nim = "13020180125";
	jurusan = "Teknik Informatika";
	fakultas = "Fakultas Ilmu Komputer";
    }

    public static void main(String[] args) {
        Biodata mahasiswa = new Biodata();
        System.out.println("Nama 		: " + mahasiswa.nama);
        System.out.println("Stambuk 	: " + mahasiswa.nim);
	System.out.println("Jurusan 	: " + mahasiswa.jurusan);
	System.out.println("Fakultas 	: " + mahasiswa.fakultas);
    }
}
