package conceptosJAVA.JuegoPOO;

import java.util.Random;

/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {
        Personaje p1 = new Personaje();
        Personaje p2 = new Personaje();
        Personaje p3 = new Personaje();
        int aleatorio, salud;
        boolean jedi = true, sith = true;
        Random ran = new Random(System.nanoTime());
        p1.setFisico(15);
        p1.setFuerza(14);
        p1.setNivel(15);
        p1.setNombre("luke");
        p1.setPh(23);
        p1.setSalud(78);

        p2.setFisico(34);
        p2.setFuerza(15);
        p2.setNivel(23);
        p2.setNombre("oscar");
        p2.setPh(12);
        p2.setSalud(87);

        p3.setFisico(35);
        p3.setFuerza(23);
        p3.setNivel(32);
        p3.setNombre("armando");
        p3.setPh(43);
        p3.setSalud(98);

        System.out.println(p1.getNombre() + " tiene una vida de " + p1.getSalud());
        System.out.println(p2.getNombre() + " tiene una vida de " + p2.getSalud());
        System.out.println(p3.getNombre() + " tiene una vida de " + p3.getSalud());
        System.out.println();
        do {
            aleatorio = ran.nextInt(1);
            if (aleatorio == 0) {
                salud = p1.ataque_fisico();
            } else {
                salud = p1.ataque_fuerza();
            }
            System.out.println(p1.getNombre() + " ha realizado un ataque de " + salud);
            p3.daño(salud);

            aleatorio = ran.nextInt(1);
            if (aleatorio == 0) {
                salud = p2.ataque_fisico();
            } else {
                salud = p2.ataque_fuerza();
            }
            System.out.println(p2.getNombre() + " ha realizado un ataque de " + salud);
            p3.daño(salud);

            if (p3.getSalud() > 0) {
                aleatorio = ran.nextInt(1);
                if (aleatorio == 0) {
                    salud = p3.ataque_fisico();
                } else {
                    salud = p3.ataque_fuerza();
                }
                System.out.println(p3.getNombre() + " ha realizado un ataque de: " + salud);

                aleatorio = ran.nextInt(1);
                if (aleatorio == 0) {
                    p1.daño(salud);
                } else {
                    p2.daño(salud);
                }
                if (p1.getSalud() <= 0 && p2.getSalud() <= 0) {
                    jedi = false;
                }
            } else {
                sith = false;
            }
            System.out.println(p1.getNombre() + " tiene una vida de " + p1.getSalud());
            System.out.println(p2.getNombre() + " tiene una vida de " + p2.getSalud());
            System.out.println(p3.getNombre() + " tiene una vida de " + p3.getSalud());
            System.out.println();
            System.out.println();
        } while (jedi && sith);
    }
}