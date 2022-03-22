package app.chat;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> malasPalbras = Arrays.asList("chch","mierda","pirobo","conchetumare","hpta","malparido","culicagado","pendejo","vrga","coño");
        System.out.println("Ingrese una frase con mínimo 10 malas palabras");
        String ingreso = sc.nextLine();
        Mono<String> monoIngreso= Mono.just(ingreso);
        //Flux<String> palabras = monoIngreso.map(palabra -> System.out.println(palabra));
        monoIngreso.subscribe(palabra -> System.out.println(palabra));

        List<String> palabras =  Arrays.asList(ingreso.split(" "));
        Flux<String> palabrasFlujo = Flux.fromIterable(palabras);
        Flux<String> cambioPals = palabrasFlujo.map(p -> malasPalbras.contains(p)?p.replace(p,"****"):p);
        cambioPals.subscribe(x-> System.out.print(x+ " "));

    }
}
