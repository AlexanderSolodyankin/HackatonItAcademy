package kg.itacademy.restapi.service;

import kg.itacademy.restapi.entity.Teachar;

import java.util.List;

public interface TeacharService {
    List<Teachar> getAll();
    Teachar getById(Long id);
    Teachar save(Teachar teachar);
    Teachar deleteById(Long id);

}
