package com.algaworks.osworks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudRestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;
	
	public Restaurante salvar(Restaurante restaurante) {
		//TODO - Implement Check if restaurante already exists before saving.
		return restauranteRepository.save(restaurante);
	}
	
	public void excluir(Long restauranteId) {
		//TODO - Implement Check if id doesn`t exists, throw an error
		restauranteRepository.deleteById(restauranteId);
	}
	
	
}
