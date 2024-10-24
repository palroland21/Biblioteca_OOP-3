public class Main {
    public static void main(String[] argv){
        Biblioteca Biblioteca1 = new Biblioteca("Principala", 10, 2);
        Biblioteca Biblioteca2 = new Biblioteca("Secundara", 23, 11);
        Biblioteca Biblioteca3 = new Biblioteca();
        Biblioteca Biblioteca4 = new Biblioteca("Secundara2", 25, 24);

        System.out.println("\nLista bibliotecilor FARA SEF/CLIENTI: ");
        System.out.println(Biblioteca1.toString());
        System.out.println(Biblioteca2.toString());
        System.out.println(Biblioteca3.toString());
        System.out.println(Biblioteca4.toString());

        SefulBibliotecii SefBib1 = new SefulBibliotecii("Ion", 48, 13, "numar de telefon");
        SefulBibliotecii SefBib2 = new SefulBibliotecii("Popescu", 83, 44, "email");
        SefulBibliotecii SefBib3 = new SefulBibliotecii();
        SefulBibliotecii SefBib4 = new SefulBibliotecii(33, 1);


        Biblioteca1.setSefBiblioteca(SefBib1);
        Biblioteca2.setSefBiblioteca(SefBib2);
        Biblioteca3.setSefBiblioteca(SefBib3);
        Biblioteca4.setSefBiblioteca(SefBib4);


        System.out.println("\nLista bibliotecilor cu SEF, dar fara CLIENTI: ");
        System.out.println(Biblioteca1.toString());
        System.out.println(Biblioteca2.toString());
        System.out.println(Biblioteca3.toString());
        System.out.println(Biblioteca4.toString());
        

        Biblioteca1.setClientF( new ClientFidel("Giogiana", 13));
        Biblioteca2.setClientF( new ClientFidel("Raluca", 3));
        Biblioteca4.setClientF (new ClientFidel("Lena", 1));


        System.out.println("\nLista bibliotecilor cu SEF si cu CLIENTI: ");
        System.out.println(Biblioteca1.toString());
        System.out.println(Biblioteca2.toString());
        System.out.println(Biblioteca3.toString());
        System.out.println(Biblioteca4.toString());

    }
}
