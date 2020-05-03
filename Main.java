public class Main {
    public static void main (String[] args) {
        Data hasil = new Data();
    // menggunakan method setter
    hasil.setNidn(122231);
    hasil.setNamadosen("Amnah Kurnia");
    hasil.setJurusan("Teknik Informatika");
    hasil.setFakultas("Ilmu Komputer");
    hasil.setEmail("Amnah.k@gmail.com");
        
    // menggunakan method getter
    System.out.println("NIDN : " + hasil.getNidn());
    System.out.println("Nama Dosen : " + hasil.getNamadosen());
    System.out.println("Jurusan : " + hasil.getJurusan());
    System.out.println("Fakultas : " + hasil.getFakultas());
    System.out.println("Email : " + hasil.getEmail());
    System.out.println(" ");
    }
}
