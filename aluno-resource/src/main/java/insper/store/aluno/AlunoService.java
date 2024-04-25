package insper.store.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import insper.store.aluno.Endereco;

import lombok.NonNull;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno create(Aluno in) {
        String url = "https://viacep.com.br/ws/" + in.cep() + "/json/";
        RestTemplate restTemplate = new RestTemplate();
        Endereco endereco = restTemplate.getForObject(url, Endereco.class);
        if (endereco != null) {
            in.cidade(endereco.getLocalidade());
            in.uf(endereco.getUf());
        } 
        return alunoRepository.save(new AlunoModel(in)).to();
    }

    public Aluno read(@NonNull String id) {
        return alunoRepository.findById(id).map(AlunoModel::to).orElse(null);
    }
    
}
