package br.senai.sp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationExtensionsKt;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }

}

@RestController
class HomeController {
    @GetMapping("/api")
    public List<Map<String, Object>> Home() {

        List<Map<String, Object>> objetos = new ArrayList<>();

        Map<String, Object> pessoa1 = new HashMap<>();
        pessoa1.put("nome", "João");
        pessoa1.put("idade", 25);
        objetos.add(pessoa1);

        Map<String, Object> pessoa2 = new HashMap<>();
        pessoa2.put("nome", "Maria");
        pessoa2.put("idade", 30);
        objetos.add(pessoa2);

        Map<String, Object> pessoa3 = new HashMap<>();
        pessoa3.put("nome", "Carlos");
        pessoa3.put("idade", 28);
        objetos.add(pessoa3);

        return objetos;
    }
}


