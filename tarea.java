import java.util.*;
public class tarea {
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
int num, cont=1;
System.out.println("ingrese numero");
num =sc.nextInt();
 while (num!=0)
 {
if (num<0)
System.out.println("el numero es negativo");
else
   System.out.println("el numero es positivo");
   
   System.out.print("Introduzca otro numero");
    num= sc.nextInt();
    cont++;
    }
System.out.print("haz introduccion"+cont+"      veses");
}
}