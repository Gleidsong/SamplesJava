package com.algaworks.osworks;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Autowired
	private CrudRestauranteService restauranteService;
	
	@GetMapping
	public List<Restaurante> lista() {
		return restauranteRepository.findAll();
	}
	
	@GetMapping("/{restauranteId}")
	public ResponseEntity<Restaurante> buscar(@PathVariable Long restauranteId) {
		Optional<Restaurante> restaurante = restauranteRepository.findById(restauranteId);
		
		if(restaurante.isPresent()) {
			return ResponseEntity.ok(restaurante.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Restaurante criar(@RequestBody Restaurante restaurante) {
		return restauranteService.salvar(restaurante);
	}
	
	@PutMapping("/{restauranteId}")
	public ResponseEntity<Restaurante> atualizar(@PathVariable Long restauranteId, @RequestBody Restaurante restaurante) {
		if (!restauranteRepository.existsById(restauranteId)) {
			return ResponseEntity.notFound().build();
		}
		restaurante.setId(restauranteId);
		restauranteService.salvar(restaurante);
		
		return ResponseEntity.ok(restaurante);
	}

	@DeleteMapping("/{restauranteId}")
	public ResponseEntity<Restaurante> excluir(@PathVariable Long restauranteId) {
		if(!restauranteRepository.existsById(restauranteId)) {
			return ResponseEntity.notFound().build();
		}
		restauranteService.excluir(restauranteId);
		return ResponseEntity.noContent().build();
	}
	
}