public class Texto {
    public static void main(String[] args) {
        String cadena = "Hola ";
        String cadena2 = new String(cadena);
        String s1 = "hello";
        String s2 = "Hello";

        System.out.printf("%s \n", cadena);
        System.out.println(cadena + "contiene " + cadena.length() + " caracteres");
        System.out.println(cadena2);

        System.out.println(s1 + " equals " + s2 + " --> " + s1.equals(s2));
        System.out.printf("la segunda letra de \"%s\" es \"%s\" \n", s1, s1.charAt(1));

    }
}