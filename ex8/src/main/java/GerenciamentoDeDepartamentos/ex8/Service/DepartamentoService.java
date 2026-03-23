package GerenciamentoDeDepartamentos.ex8.Service;

import GerenciamentoDeDepartamentos.ex8.Model.DepartamentoModel;
import GerenciamentoDeDepartamentos.ex8.Repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    public List<DepartamentoModel> findAll() {
        return departamentoRepository.findAll();
    }

    public Optional<DepartamentoModel> findById(Long id) {
        return departamentoRepository.findById(id);
    }

    public DepartamentoModel salvar(DepartamentoModel departamentoModel) {
        return departamentoRepository.save(departamentoModel);
    }

    public void deletar(Long id) {
        departamentoRepository.deleteById(id);
    }
}
