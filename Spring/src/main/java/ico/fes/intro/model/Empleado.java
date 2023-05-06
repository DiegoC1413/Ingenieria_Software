package ico.fes.intro.model;

import lombok.*;

import java.sql.Date;
import java.time.format.DateTimeFormatter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Empleado {
    private int id;
    private double sueldo;
    private String departamento;
    private String nombre;
    private String fechaNacimiento;




}
