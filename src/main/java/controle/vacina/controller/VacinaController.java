package controle.vacina.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import controle.vacina.model.VacinaModel;
import controle.vacina.repository.VacinaRepository;

@RestController
@RequestMapping("/vacina")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VacinaController 
{
	@Autowired
	private VacinaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<VacinaModel>> getAll()
	{
		return ResponseEntity.ok(this.repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<VacinaModel> getById (@PathVariable Long id)
	{
		return this.repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<VacinaModel> post (@RequestBody VacinaModel vacina)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(this.repository.save(vacina));
	}
}
