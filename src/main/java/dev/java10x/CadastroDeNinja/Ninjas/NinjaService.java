package dev.java10x.CadastroDeNinja.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //bom aq é o metodo pra listagem
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    //aq é pra listar pelo ID
    public NinjaModel listarNinjaPorID(Long id) {
        return ninjaRepository.findById(id).orElse(null);
    }

    public void deletarNinjaPorID(Long id) {
        ninjaRepository.deleteById(id);
    }
}
