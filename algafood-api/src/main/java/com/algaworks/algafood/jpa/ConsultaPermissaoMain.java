package com.algaworks.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.PermissaoRepository;

public class ConsultaPermissaoMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		PermissaoRepository todasPermissoes = applicationContext.getBean(PermissaoRepository.class);
		List<Permissao> permissoes = todasPermissoes.listar();
		
		for(Permissao permissao : permissoes) {
			System.out.printf("%s - %s \n", permissao.getDescricao(), permissao.getNome());
		}
	}
}
