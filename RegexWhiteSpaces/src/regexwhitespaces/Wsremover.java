package regexwhitespaces;
import java.util.Scanner; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Arnaldo Benavides, Donny Escolar, Victor Medina
 */
public class Wsremover {
    public static void main(String[] args) {
        System.out.println("*******************************************************************************");
        System.out.println("************************* WHITESPACE REPLACER *********************************");
        System.out.println("*******************************************************************************\n");
        //Leemos una cadena para trabajar
        System.out.println("Digite la cadena a transformar: ");
        Scanner read = new Scanner(System.in);
        String original = read.nextLine();
        //En este caso \\s es el patron o expresion regular que buscamos en la cadena
        Pattern pattern = Pattern.compile("\\s");
        //Usamos el metodo matcher para devolver un objeto de tipo Matcher que tendra todas las coincidencias del patron
        Matcher matcher = pattern.matcher(original);
        //Reemplazamos todos los espacios en blanco representados por la expresion regular \s y guardamos en otra variable la nueva cadena
        String nows = matcher.replaceAll("-");
        //Escribimos la cadena original junto a la nueva cadena con guion medio en vez de espacio en blanco
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Cadena original: "+ original);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Cadena resultante: "+ nows);
        System.out.println("-------------------------------------------------------------------------------");
    }
}
