package vista;

import estructurascontrolselectivas.EstructurasSelectivas;
import estrucuturascontroliterativas.EstructurasIterativas;
import java.util.Scanner;

public class Test {
    //metodo para el menu general
    public static void menuGeneral() {
        int menu;//variable global, tiene alcance en todos los metodos y estructuras de control

        do{
            System.out.println("Menu estructuras de control Nava"
                    + "\n Seleccionar"
                    + "\n1.- Selectivas"
                    + "\n2.- Iterativas"
                    + "\n3.- Salir");
            Scanner teclado = new Scanner(System.in);
            menu = teclado.nextInt();

            switch (menu){
                case 1:
                    System.out.println("Selectivas");
                    //llamada del metodo por medio de un objeto apuntador
                    EstructurasSelectivas ap = new EstructurasSelectivas();
                    ap.selectivaIf();//invocacion de metodo
                    ap.selectivaSwitch();
                    break;
                case 2:
                    System.out.println("Iterativas");
                    EstructurasIterativas let = new EstructurasIterativas();
                    let.iterativaFor();
                    let.iterativaForEach();
                    let.iterativaWhile();
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("No existe esa opcion, solo tengo tres");
                    break;
            }
        }while(menu != 3);
    }

    public static void main(String[] args) {
        menuGeneral();
    }

}
