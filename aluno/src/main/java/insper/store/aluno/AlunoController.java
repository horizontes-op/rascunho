package insper.store.aluno;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "store-aluno")
public interface AlunoController {

    @PostMapping("/aluno")
    public ResponseEntity<AlunoOut> create(
        @RequestBody(required = true) AlunoIn in
    );
    
    @GetMapping("/aluno/{id}")
    public ResponseEntity<AlunoOut> read(
        @PathVariable(required = true) String id
    );
}