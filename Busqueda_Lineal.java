//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int busqueda(String array, String elemento){
        int a = 0;
        for (int i = 0; i < array.length(); i++){
            if (array.charAt(i) == elemento.charAt(0)){

                a = i;
            }
        }
        return  a ;
    }

    public static void main(String[] args) {
        String array = "Informatica";
        String letra = "m";
        int index = busqueda(array, letra);
        System.out.println("Esta es la posicion= " + "" + index);

    }

}
