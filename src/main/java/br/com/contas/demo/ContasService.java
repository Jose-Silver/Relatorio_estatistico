package br.com.contas.demo;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
@Service
public class ContasService {

    @Autowired
    private NumerosRepository repository;

    public ResponseEntity<?> relatorio ( List<Integer> list){



    double media = calcularMedia(list);
    double desvpadrao = calcularDesvioPadrao(list, media);
    double mediana = calcularMediana(list);
    Integer quantidade_itens = list.size();
    RelatorioEstatistico relatorio = new RelatorioEstatistico(media,desvpadrao,quantidade_itens,mediana);
        return ResponseEntity.ok( relatorio);

    }


    public double calcularMedia(List<Integer> numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return (double) soma / numeros.size();
    }

    public  double calcularDesvioPadrao(List<Integer> numeros, double media) {
        double somaDiferencasQuadrado = 0;
        for (int num : numeros) {
            double diferenca = num - media;
            somaDiferencasQuadrado += diferenca * diferenca;
        }
        double variancia = somaDiferencasQuadrado / numeros.size();
        return Math.sqrt(variancia);
    }

    public  double calcularMediana(List<Integer> numeros) {
        Collections.sort(numeros);
        int tamanho = numeros.size();
        if (tamanho % 2 == 0) {
            int indiceMeio = tamanho / 2;
            return (numeros.get(indiceMeio - 1) + numeros.get(indiceMeio)) / 2.0;
        } else {
            return numeros.get(tamanho / 2);
        }
    }
}



