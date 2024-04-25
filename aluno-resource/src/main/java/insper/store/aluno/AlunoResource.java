package insper.store.aluno;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import insper.store.aluno.CustomizedException.NotFoundException;

@RestController
public class AlunoResource implements AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping("/aluno/info")
    public ResponseEntity<Map<String, String>> info() {
        return new ResponseEntity<Map<String, String>>(
            Map.ofEntries(
                Map.entry("microservice.name", AlunoApplication.class.getSimpleName()),
                Map.entry("os.arch", System.getProperty("os.arch")),
                Map.entry("os.name", System.getProperty("os.name")),
                Map.entry("os.version", System.getProperty("os.version")),
                Map.entry("file.separator", System.getProperty("file.separator")),
                Map.entry("java.class.path", System.getProperty("java.class.path")),
                Map.entry("java.home", System.getProperty("java.home")),
                Map.entry("java.vendor", System.getProperty("java.vendor")),
                Map.entry("java.vendor.url", System.getProperty("java.vendor.url")),
                Map.entry("java.version", System.getProperty("java.version")),
                Map.entry("line.separator", System.getProperty("line.separator")),
                Map.entry("path.separator", System.getProperty("path.separator")),
                Map.entry("user.dir", System.getProperty("user.dir")),
                Map.entry("user.home", System.getProperty("user.home")),
                Map.entry("user.name", System.getProperty("user.name")),
                Map.entry("jar", new java.io.File(
                    AlunoApplication.class.getProtectionDomain()
                        .getCodeSource()
                        .getLocation()
                        .getPath()
                    ).toString())
            ), HttpStatus.OK
        );
    }

    @Override
    public ResponseEntity<AlunoOut> create(AlunoIn in) {
        // parser
        Aluno aluno = AlunoParser.to(in);
        // insert using service
        aluno = alunoService.create(aluno);
        return ResponseEntity.ok(AlunoParser.to(aluno));
    }

    @Override
    public ResponseEntity<AlunoOut> read(String id) {
        // read using service
        Aluno aluno = alunoService.read(id);
        if (aluno == null) {
            throw new NotFoundException("Aluno não encontrado");
        }
        return ResponseEntity.ok(AlunoParser.to(aluno));
    }
    
}
