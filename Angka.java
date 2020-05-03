public class Angka {
    int nilai1, nilai2;
    
    void dataAngka (){
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
    }
    public static void main ( String [ ] args ){
        int hasil = 0;
        Angka jumlah = new Angka();
        jumlah.nilai1 = 8;
        jumlah.nilai2 = 2;
        
        hasil = jumlah.nilai1 + jumlah.nilai2;
        System.out.println(+hasil);
    }
}