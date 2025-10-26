package estructurascontrolselectivas;

public class EstructurasSelectivas {//inicia clase
    //metodo-funcion para conocer la estructura de control selectiva if
    public void selectivaIf() {
       //declaracion de variable inicializada double
       double calificacion = 7.5;
       
       if(calificacion >= 6.0){//para condicion verdadera
           System.out.println("Aprobado, tienes calificacion: " + calificacion);
       } else {
           System.out.println("Reprobado, tienes calificacion: " + calificacion);
       }
    }
    //metodo para conocer la estrucutura de control switch
    public void selectivaSwitch() {
        int dia = 5;
        
        switch(dia){
            case 1: System.out.println("Lunes");
                    break;
            case 2: System.out.println("Martes");
                    break;
            case 3: System.out.println("Miercoles");
                    break;
            case 4: System.out.println("Jueves");
                    break;
            case 5: System.out.println("Viernes");
                    break;
            default: System.out.println("Opcion invalida, tengo cinco opciones");
                     break;
        }
    }
}//termina clase
