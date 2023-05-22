package ma.enset.infractionservice.web.rest;

import lombok.AllArgsConstructor;
import ma.enset.infractionservice.entities.Infraction;
import ma.enset.infractionservice.repository.InfractionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class InfractionRestController {

    private InfractionRepository infractionRepository;


    @GetMapping("/infractions")
    public List<Infraction> infractionList(){
        return infractionRepository.findAll();
    }

    @GetMapping("/infractions/{id}")
    public Infraction infractionById(@PathVariable Long id){
        return infractionRepository.findById(id).get();
    }

    @PostMapping("/infractions")
    public Infraction saveInfraction(@RequestBody Infraction infraction){
        return infractionRepository.save(infraction);
    }

    @PutMapping("/infractions/{id}")
    public Infraction updateInfraction(@RequestBody Infraction infraction, @PathVariable Long id){
        infraction.setId(id);
        return infractionRepository.save(infraction);
    }
    @DeleteMapping("/infractions/{id}")
    public void deleteInfraction(@PathVariable Long id){
        infractionRepository.deleteById(id);
    }


}
