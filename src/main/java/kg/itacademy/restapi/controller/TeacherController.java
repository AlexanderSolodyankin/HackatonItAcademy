package kg.itacademy.restapi.controller;


import kg.itacademy.restapi.entity.Teachar;
import kg.itacademy.restapi.service.TeacharService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {

    @Autowired
   private TeacharService teacharService;

    @GetMapping
    public List<Teachar> getAll(){return teacharService.getAll();}

    @GetMapping("/{id}")
    public Teachar getById(@PathVariable Long id){return teacharService.getById(id);}

    @PostMapping
    public Teachar seve(@RequestBody Teachar teachar){return teacharService.save(teachar);}

    @DeleteMapping
    public Teachar deleteById(@PathVariable Long id){return teacharService.deleteById(id);}
}
