
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Raul Molina
 */
public class Calendario {
    
    public static void main(String[] args) {
        
        byte mes, primerDia,maxDias,contador,dia;
        int anio;
        String fila;
        GregorianCalendar calendario;
        
        System.out.print("Mes: ");
        anio = Leer.datoInt();
        while(anio<1 || anio> 12){
            System.out.println("Mes fuera de rango.");
            System.out.print("Mes: ");
            anio = Leer.datoInt();
        }
        mes=(byte)anio;
        System.out.print("Año: ");
        anio = Leer.datoInt();
        while(anio<0){
            System.out.println("Año negativo, no válido.");
            System.out.print("Año: ");
            anio = Leer.datoInt();
        }

        System.out.println(" ");
        
        switch(mes){
            case 1:
                System.out.println("                CALENDARIO ENERO DE "+anio);
                break;
            case 2:
                System.out.println("                CALENDARIO FEBRERO DE "+anio);
                break;
            case 3:
                System.out.println("                CALENDARIO MARZO DE "+anio);
                break;
            case 4:
                System.out.println("                CALENDARIO ABRIL DE "+anio);
                break;
            case 5:
                System.out.println("                CALENDARIO MAYO DE "+anio);
                break;
            case 6:
                System.out.println("                CALENDARIO JUNIO DE "+anio);
                break;
            case 7:
                System.out.println("                CALENDARIO JULIO DE "+anio);
                break;
            case 8:
                System.out.println("                CALENDARIO AGOSTO DE "+anio);
                break;
            case 9:
                System.out.println("                CALENDARIO SEPTIEMBRE DE "+anio);
                break;
            case 10:
                System.out.println("                CALENDARIO OCTUBRE DE "+anio);
                break;
            case 11:
                System.out.println("                CALENDARIO NOVIEMBRE DE "+anio);
                break;
            case 12:
                System.out.println("                CALENDARIO DICIEMBRE DE "+anio);
                break;
        }
        System.out.println(" ");
        System.out.println("        LU        MA        MI        JU        VI        SA        DO");
        
        calendario = new GregorianCalendar(anio,mes-1,1);
        primerDia = (byte)(calendario.get(Calendar.DAY_OF_WEEK));
        if(primerDia==1){
            primerDia=7;
        } else{
            primerDia=(byte)(primerDia-1);
        }
        maxDias = (byte)(calendario.getActualMaximum(Calendar.DAY_OF_MONTH));
        
        fila=new String();
        contador=0;
        for(dia=1;dia<primerDia;dia++){
            fila=fila+"          ";
            contador++;
        }
        
        for(dia=1;dia<=maxDias;dia++){
            if(dia<10){
                fila=fila+"         "+dia;
            }else{
                fila=fila+"        "+dia;
            }
            contador++;
            if(contador==7){
                System.out.println(fila);
                fila="";
                contador=0;
            }  
        }
        System.out.println(fila);
      
    }
}