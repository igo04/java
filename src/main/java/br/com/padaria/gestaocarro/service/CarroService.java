package br.com.padaria.gestaocarro.service;

import br.com.padaria.gestaocarro.repository.CarroRepository;
import br.com.padaria.gestaocarro.domain.model.Massa;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CarroService {
    private static final CarroRepository CarroRepository = null;
    public CarroService(CarroRepository massaRepository) {
        this.CarroRepository = massaRepository;
    }

    public static Carro save(carro carro){
        return CarroRepository.save(carro);
    }

    public List<Carro> findAll(){
        return CarroRepository.findAll();
    }

    public static Carro findById(UUID id){
        return CarroRepository.findById(id).orElse(new Carro());
    }

    public void deleteById(UUID id){
        CarroRepository.deleteById(id);
    }

    public void update(UUID id, float preco) {
        CarroRepository.updateByPreco(id, preco);
    }

    public Massa findByPreco(float preco) {
        return br.com.padaria.gestaocarro.repository.CarroRepository.findByPreco(preco);
    }
}
