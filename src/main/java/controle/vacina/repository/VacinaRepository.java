package controle.vacina.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import controle.vacina.model.VacinaModel;

@Repository
public interface VacinaRepository extends JpaRepository<VacinaModel, Long>
{
	public List<VacinaModel> findAllByNomeVacinaContainingIgnoreCase (String nomeVacina);
}
