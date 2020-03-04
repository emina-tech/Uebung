public class BruttoNetto {
    public static void main(String[] args) {
        int nettopreis;
        nettopreis = 200;

        int teiler;
        teiler =

        double steuersatz;
        steuersatz = 0.05;

        double maxSteuersatz;
        maxSteuersatz = 0.04;

        double bruttoPreis  = nettopreis * (1 + steuersatz);
        // bruttoPreis = nettoPreis + nettoPreis * steuersatz

        System.out.println("Ergebnis: " + bruttoPreis + " €");

        boolean zuHoch;
        zuHoch = steuersatz > maxSteuersatz;
        // zuHoch = steuersatz != maxSteuersatz;

        System.out.println("Zu hoch? " + zuHoch);
        // "Ist gleich " + zuHoch




    }
}
