package trabajogrupal;

public class Estudiante {

//Declaracion de Variables
    String nombre;
    String apellido;
    int edad;
    double calificacion1=0;
    double calificacion2=0;
    //Presenta datos
    public void presentar(){
        System.out.printf("%s %s\n",nombre,apellido);
        System.out.printf("Edad:%d\n",edad);
        System.out.printf("Calificacion1:%.2f\n",calificacion1);
        System.out.printf("Calificacion2:%.2f\n",calificacion2);
        System.out.printf("Promedio:%.2f\n",obtener_promedio());
    
    }
    //Retorna Promedio
    public double obtener_promedio(){
            double suma=0;
            double promedio=0;
            suma=calificacion1+calificacion2;
            promedio=suma/2;
            return(promedio);
    }
    
    
    
}
