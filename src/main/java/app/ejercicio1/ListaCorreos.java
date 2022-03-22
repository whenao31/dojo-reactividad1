package app.ejercicio1;

import app.model.Correo;

import java.util.ArrayList;
import java.util.List;

public class ListaCorreos {
    public static List<Correo> getListaCorreos(){
        List<Correo> listaCorreos = new ArrayList<>();
        listaCorreos.add(new Correo(1L, "mail1@gmail.com", true));
        listaCorreos.add(new Correo(1L, "mail1@gmail.com", true));
        listaCorreos.add(new Correo(2L, "mail2@hotmail.com", false));
        listaCorreos.add(new Correo(3L, "mail3@outlook.com", false));
        listaCorreos.add(new Correo(4L, "mail4@gmail.com", false));
        listaCorreos.add(new Correo(5L, "mail5@gmail.com", true));
        listaCorreos.add(new Correo(6L, "mail6@yahoo.com", true));
        listaCorreos.add(new Correo(7L, "mail7@hotmail.com", false));
        listaCorreos.add(new Correo(8L, "mail8@outlook.com", false));
        listaCorreos.add(new Correo(4L, "mail4@gmail.com", false));

        listaCorreos.add(new Correo(9L, "mail9@gmail.com", true));
        listaCorreos.add(new Correo(10L, "mail10@gmail.com", true));
        listaCorreos.add(new Correo(11L, "mail11@hotmail.com", false));
        listaCorreos.add(new Correo(12L, "mail12@aol.com", false));
        listaCorreos.add(new Correo(13L, "mail13@gmail.com", false));
        listaCorreos.add(new Correo(9L, "mail9@gmail.com", true));
        listaCorreos.add(new Correo(14L, "mail14@gmail.com", true));
        listaCorreos.add(new Correo(15L, "mail15@hotmail.com", false));
        listaCorreos.add(new Correo(16L, "mail16@outlook.com", false));
        listaCorreos.add(new Correo(17L, "mail17@gmail.com", false));

        listaCorreos.add(new Correo(20L, "mail20@gmail.com", true));
        listaCorreos.add(new Correo(21L, "mail21@gmail.com", true));
        listaCorreos.add(new Correo(22L, "mail22@hotmail.com", false));
        listaCorreos.add(new Correo(23L, "mail23@outlook.com", false));
        listaCorreos.add(new Correo(24L, "mail24@gmail.com", false));
        listaCorreos.add(new Correo(25L, "mail25@gmail.com", true));
        listaCorreos.add(new Correo(26L, "mail26@sofka.com.co", true));
        listaCorreos.add(new Correo(22L, "mail22@hotmail.com", false));
        listaCorreos.add(new Correo(28L, "mail28@outlook.com", false));
        listaCorreos.add(new Correo(29L, "mail29@gmail.com", false));

        return listaCorreos;
    }
}
