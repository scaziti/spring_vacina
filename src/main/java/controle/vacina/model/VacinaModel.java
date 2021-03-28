package controle.vacina.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_vacina")
public class VacinaModel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nomeVacina;
	
	
	@OneToMany(mappedBy = "vacina", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("vacina")
	private List<UsuarioModel> usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}


	public List<UsuarioModel> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<UsuarioModel> usuario) {
		this.usuario = usuario;
	}

	
}
