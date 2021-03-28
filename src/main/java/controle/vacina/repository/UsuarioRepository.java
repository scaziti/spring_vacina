package controle.vacina.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import controle.vacina.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>
{
	public List<UsuarioModel> findAllByNomeContainingIgnoreCase(String nome);
}
	