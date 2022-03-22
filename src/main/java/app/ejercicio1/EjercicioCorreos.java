package app.ejercicio1;

import app.model.Correo;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class EjercicioCorreos {

    public static void main(String[] args) {
        List<Correo> listaCorreos = ListaCorreos.getListaCorreos();
        Flux<Correo> fluxCorreos = Flux.fromIterable(listaCorreos)
                .distinct();
    }


}
