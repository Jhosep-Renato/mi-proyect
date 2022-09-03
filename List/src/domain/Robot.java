package domain;

import java.util.*;
import java.time.*;
import java.time.format.*;

public class Robot {

    private int id;
    private String fecha;
    private String nombre;

    Robot(String nombre) {
        setId();
        setFecha();
        this.nombre = nombre;
    }

    private void setId() {
        Random rand = new Random();
        int n = rand.nextInt(50);
        id = n;
    }

    public int getId() {return id;}

    private void setFecha() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' LLLL 'de' yyyy");
        fecha = date.format(formatter);
    }

    public String getFecha() { return fecha; }

    public static void main(String args[]) {
        Robot robot = new Robot("Androide");
        System.out.println(robot);
    }

    @Override
    public String toString() {
        return "Robot nº " + id + "; " + "creado el " + fecha + ", responde por " + nombre + ".";
    }
}
