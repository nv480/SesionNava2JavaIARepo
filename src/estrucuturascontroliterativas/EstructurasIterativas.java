package estrucuturascontroliterativas;

public class EstructurasIterativas {
    //metodo estructura de control for
    public void iterativaFor() {
        for(char i='A'; i<='Z'; i++){
            System.out.println(" " + i);
        }
    }
    //metodo estructura de control foreach
    public void iterativaForEach() {
        //un arreglo es un tipo de dato que permite almacenar millones de valores
        //declaracion de un arreglo tipo entero
        //una indexacion es comenzar a contar desde cero en su primera posicion
        int numeros[] = {3, 2, 100, 500, 1};
        
        for(int numero : numeros){
            System.out.println("Los numeros del arreglo son: " + numero);
        }
    }
    //metodo estructura de control while
    public void iterativaWhile() {
        int contador = 1;//variable tipo entero inicializada en uno
        
        while(contador <= 5){
            System.out.println(" - " + contador);
            contador++;//contador incremetado por cada ciclo en unidad
        }
    }
}
