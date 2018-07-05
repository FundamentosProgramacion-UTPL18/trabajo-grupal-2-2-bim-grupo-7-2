
package trabajogrupal;

public class Principal {

    public static void main(String[] args) {
        //Declaracion Arreglo
        String[]nombres={"José", "María", "Ana", "Paul", "David"};
        String[]apellidos={"Yaguana", "Benitez", "Gaviria", "Davila", "Andrade"};
        int[] edad={20, 19, 20, 19, 25};
        double[] calificacion1={9.1, 10, 8, 7, 9.1};
        double[]calificacion2={6.1, 5, 10, 7.2, 4.1};
        Estudiante [] estudiantes=new Estudiante [nombres.length];
        
        //Ciclo For 
        for(int i=0;i<nombres.length;i++){
            Estudiante e=new Estudiante();
            
            e.nombre=nombres[i];
            e.apellido=apellidos[i];
            e.edad=edad[i];
            e.calificacion1=calificacion1[i];
            e.calificacion2=calificacion2[i];
            estudiantes[i]=e;
        }
        //Llama al metodo presentar
        for(int i=0;i<nombres.length;i++){
            Estudiante e=estudiantes[i];
            System.out.printf("Reporte%s\n",i++);
            e.presentar();
        }
        

        
        
        
    }
    
}
