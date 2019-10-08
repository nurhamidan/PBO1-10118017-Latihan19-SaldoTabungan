package pbo1.nim10118017;

import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menampilkan kenaikan saldo sebesar persen yang ditentukan dari bulan sebelumnya sebanyak ketentuan user.
 * 
 */
public class Main {
    //Konstanta
    public static final String FOOTER = "\n(Developed by : Agung Nurhamidan)";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tampilkanSaldoTabungan(2500000, 15, 6);
        
        System.out.println(FOOTER);
    }
    
    //Method untuk menampilkan kenaikan saldo sebesar persen 'bunga' dari bulan sebelumnya sebanyak 'lama' kali.
    public static void tampilkanSaldoTabungan(double saldo, double bunga, int lama) {
        //Mengatur simbol format untuk mata uang Indonesia.
        DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols();
        formatSymbols.setCurrencySymbol("Rp.");
        formatSymbols.setGroupingSeparator('.');
        
        //Menerapkan simbol format ke bilangan desimal serta mengatur digit pembulatannya.
        DecimalFormat format = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        format.setDecimalFormatSymbols(formatSymbols);
        format.setMaximumFractionDigits(0);
        
        //Menampilkan saldo.
        for (int i = 0; i < lama; i++) {
            saldo += (saldo * (bunga / 100));
            System.out.println("Saldo di bulan ke-" + (i + 1) + " " + format.format(saldo));
        }
    }
    
}
