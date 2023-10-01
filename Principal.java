import java.time.LocalDate;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Date day = new Date();
        System.out.printf("Fecha Actual: %td/%tm/%tY %n", day, day, day);

        LocalDate fechaNacimientoSofia = LocalDate.of(2020, 5, 9);
        Estudiante Sofia = new Estudiante("Sofia", fechaNacimientoSofia);
        Sofia.setNotaMateria1(2.9);
        Sofia.setNotaMateria2(2.1);
        Sofia.setNotaMateria3(3.8);

        System.out.println("Nombre: " + Sofia.getNombre() + "\n" + "Fecha de nacimiento: " + Sofia.getFechaNacimiento());
        System.out.println("Nota 1: " + Sofia.getNotaMateria1() + "\n" + "Nota 2: " + Sofia.getNotaMateria2() + "\n" + "Nota 3: " + Sofia.getNotaMateria3() );
        System.out.println("Promedio: " + Sofia.getPromedio());
        System.out.println("Tiene " + Sofia.getEdad() + " años. \n" );

        LocalDate fechaNacimientoDaniela = LocalDate.of(2000, 4, 5);
        Estudiante Daniela = new Estudiante("Daniela", fechaNacimientoDaniela);
        Daniela.setNotaMateria1(1.5);
        Daniela.setNotaMateria2(4.8);
        Daniela.setNotaMateria3(4.2);

        System.out.println("Nombre: " + Daniela.getNombre() + "\n" + "Fecha de nacimiento: " + Daniela.getFechaNacimiento());
        System.out.println("Nota 1: " + Daniela.getNotaMateria1() + "\n" + "Nota 2: " + Daniela.getNotaMateria2() + "\n" + "Nota 3: " + Daniela.getNotaMateria3() );
        System.out.println("Promedio: " + Daniela.getPromedio());
        System.out.println("Tiene " + Daniela.getEdad() + " años.");
    }
}
