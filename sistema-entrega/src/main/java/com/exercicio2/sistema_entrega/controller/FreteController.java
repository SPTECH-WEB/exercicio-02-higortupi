package com.exercicio2.sistema_entrega.controller;

import com.exercicio2.sistema_entrega.model.EntregaRequest;
import com.exercicio2.sistema_entrega.observer.ClienteNotificador;
import com.exercicio2.sistema_entrega.observer.InternoNotificador;
import com.exercicio2.sistema_entrega.observer.ClienteNotificador;
import com.exercicio2.sistema_entrega.observer.InternoNotificador;
import com.exercicio2.sistema_entrega.observer.ServicoNotificacao;
import com.exercicio2.sistema_entrega.service.FreteService;
import com.exercicio2.sistema_entrega.strategy.FreteStrategy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entregas")
public class FreteController {

    private final FreteService freteService = new FreteService();
    private final ServicoNotificacao notificacao = new ServicoNotificacao();

    public FreteController() {
        notificacao.adicionarObservador(new ClienteNotificador());
        notificacao.adicionarObservador(new InternoNotificador());
    }

    @PostMapping
    public ResponseEntity<String> processarEntrega(@RequestBody EntregaRequest request) {
        try {
            FreteStrategy estrategia = freteService.escolherEstrategia(request.getModalidade());
            double valor = freteService.calcularFrete(request.getPeso(), estrategia);

            String mensagem = String.format("Entrega processada com sucesso. Valor do frete: R$ %.2f", valor);
            notificacao.notificarTodos(mensagem);

            return ResponseEntity.ok(mensagem);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
