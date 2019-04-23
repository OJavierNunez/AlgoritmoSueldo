import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double horasDiarias,horaSemana,sueldo;
    int contador;
    horaSemana= 0;
    horasDiarias =0;
    Scanner s = new Scanner (System.in);
    
    for (contador = 1; contador <= 5; ++contador) {
    System.out.println("Ingrese las horas que trabajo el pasante el día "+contador+" : ");
    horasDiarias =s.nextDouble();
    horaSemana = horaSemana + horasDiarias; 
    }
    
    System.out.println("Ingrese el sueldo del pasante $ ");
    sueldo = s.nextDouble();
    sueldo = sueldo * horaSemana;
    System.out.println("Las horas trabajadas en la semana son: "+horaSemana+" y el sueldo a recibir es $ "+sueldo);
  
  }
}
