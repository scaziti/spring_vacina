package controle.vacina.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuario")
public class UsuarioModel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 2)
	private String nome;
	
	@NotNull
	@Size(min = 5)
	@Column(unique = true)
	private String email;
	
	@NotNull
	@Size(min = 11)
	@Column(unique = true)
	private String cpf;
	
	@NotNull
	@Size(min = 10)
	private String nascimento;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@NotNull
	@Size(min = 10)
	private String primeiraDose;
	
	@NotNull
	@Size(min = 10)
	private String segundaDose;
	
	@ManyToOne
	@JsonIgnoreProperties("usuario")
	private VacinaModel vacina;
	
	// Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public VacinaModel getVacina() {
		return vacina;
	}

	public void setVacina(VacinaModel vacina) {
		this.vacina = vacina;
	}

	public String getPrimeiraDose() {
		return primeiraDose;
	}

	public void setPrimeiraDose(String primeiraDose) {
		this.primeiraDose = primeiraDose;
	}

	public String getSegundaDose() {
		return segundaDose;
	}

	public void setSegundaDose(String segundaDose) {
		this.segundaDose = segundaDose;
	}
	
}
