package app.ejercicio1;

import app.model.Correo;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class EjercicioCorreos {

    public static void main(String[] args) {
        List<Correo> listaCorreos = ListaCorreos.getListaCorreos();

//        checkDistinct(listaCorreos);
        filtroDominios(listaCorreos, "gmail");
        filtroDominios(listaCorreos, "hotmail");
        filtroDominios(listaCorreos, "outlook");

    }

    public static void checkDistinct(List<Correo> listaCorreos){
        Flux<Correo> fluxCorreosDistintos = Flux.fromIterable(listaCorreos)
                .distinct();
        fluxCorreosDistintos.subscribe(System.out::println);
    }

    public static void filtroDominios(List<Correo> listaCorreos, String dominio){
        Flux<Correo> fluxFiltradoDominio = Flux.fromIterable(listaCorreos)
                .distinct()
                .filter(email -> getEmailDomain(email.getEmail()).equals(dominio.toLowerCase()));

        System.out.println(String.format("Cantidad de correos de dominio %s:",dominio.toUpperCase()));
        fluxFiltradoDominio.count().subscribe(System.out::println);
        System.out.println(String.format("Correos de dominio %s:",dominio.toUpperCase()));
        fluxFiltradoDominio.subscribe(System.out::println);
    }

    public static String getEmailDomain(String email){
        String domainExtracted = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        return domainExtracted;
    }

}
