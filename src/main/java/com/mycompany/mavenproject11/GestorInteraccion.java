/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class GestorInteraccion {
    Scanner entrada;

    public GestorInteraccion() {
        entrada = new Scanner(System.in);
    }

 public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMensajePositivo() {
        String[] mensajesPositivos = {
            "¡Muy bien!",
            "¡Excelente!",
            "¡Buen trabajo!",
            "¡Sigue así!"
        };

        int indiceAleatorio = random.nextInt(mensajesPositivos.length);
        System.out.println(mensajesPositivos[indiceAleatorio]);
    }
}
