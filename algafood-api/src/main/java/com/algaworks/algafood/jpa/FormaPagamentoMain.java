package com.algaworks.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.FormaPagamento;
import com.algaworks.algafood.domain.repository.FormaPagamentoRepository;

public class FormaPagamentoMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		FormaPagamentoRepository todasFormasPagamento = applicationContext.getBean(FormaPagamentoRepository.class);
		List<FormaPagamento> todosPagamentos = todasFormasPagamento.listar();
		
		for(FormaPagamento formaPagamento : todosPagamentos) {
			System.out.printf("%s \n", formaPagamento.getDescricao());
		}
	}
}
