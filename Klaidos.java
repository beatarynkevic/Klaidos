public class KlaidosDu {

    public static void klaiduGeneratorius() 
        throws IOException { //turim delkratuori
        double sk = Math.random();
        if (sk < 0.3) {
            throw new IllegalArgumentException();
        } else if (sk < 0.6) {
            throw new IndexOutOfBoundsException("IOOBE");
        } else if (sk < 0.9) {
//            throw new ArrayIndexOutOfBoundsException(); //sitam nereik vartininko nes paveldetas nuo IndexOutOfBoundsException
               throw new IOException();
        }
        System.out.println("Nebuvo klaidos");
    }
    
    public static void tustiVartai() throws IOException {
        System.out.println("pries tuscius vartu");
        klaiduGeneratorius(); //metodas metoda kviecia. Radom throws IOException, nes praleidziam kaip per tuscius vartus
        System.out.println("us tusciu vartu");
    }
    
    public static void klaidaKlaidoje() {
        System.out.println("gaudom visas klaidas");
        try {
            tustiVartai();
        }
        catch(Exception e) { //checked ir unchecked pagauna
            System.out.println("Pagavom exception'a");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Pradzia");
        try {
            tustiVartai();
//            klaiduGeneratorius();
            System.out.println("Be klaidu");
        }
        catch (IllegalArgumentException iae) {
            System.out.println("Pagavom IAE" + iae);
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Pagavom IOOBE: " + ex);
        }
        catch (RuntimeException e) {
            System.out.println("pagavome " + e);
        }
        catch (IOException e) {
            System.out.println("pagavome " + e);
        }
        finally {
            System.out.println("VISTIEK SUVEIKS");
        }
        System.out.println("Pabaiga");
    }
}
