public class CetakanKue {
    public static void main(String[] args) {
        Cetakan c1 = new Cetakan();
        Cetakan c2 = new Cetakan ("Onde-onde", 250);
        c2.setJenisKue("Onde-onde");
        c2.setJumlahKue(250);
        c1.penjualan(c2);
    } 
}