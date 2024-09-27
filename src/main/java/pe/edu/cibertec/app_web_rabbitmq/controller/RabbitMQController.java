package pe.edu.cibertec.app_web_rabbitmq.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_web_rabbitmq.enqueue.producer.RabbitMQProducer;

@RestController
@RequiredArgsConstructor
public class RabbitMQController {

    private final RabbitMQProducer rabbitMQProducer;

    @GetMapping("/enviar")
    public String enviarMensaje(@RequestParam String mensaje) {
        rabbitMQProducer.enviarMensaje(mensaje);
        return "Mensaje enviado a RabbitMQ: " + mensaje;
    }
}
