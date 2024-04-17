public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incuidoPlan = true;
        double notaDePelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        String sipnosis = """
            Representa un futuro distópico en el que
            la humanidad está atrapada sin saberlo dentro
            de una realidad simulada llamada Matrix, que 
            las máquinas inteligentes han creado para distraer
            a los humanos mientras usan sus cuerpos como
            fuente de energía en campos de cultivo.
            fue lanzada en: """ + fechaDeLanzamiento 
            + " Incluido " + incuidoPlan;

        System.out.println(sipnosis);
    }

}
