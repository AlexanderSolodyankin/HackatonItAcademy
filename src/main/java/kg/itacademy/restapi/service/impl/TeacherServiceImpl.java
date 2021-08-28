package kg.itacademy.restapi.service.impl;

import kg.itacademy.restapi.entity.Teachar;
import kg.itacademy.restapi.repository.TeacharRepository;
import kg.itacademy.restapi.service.TeacharService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacharService {

    @Autowired
    private TeacharRepository teacharRepository;

    @Override
    public List<Teachar> getAll() {
        return teacharRepository.findAll();
    }

    @Override
    public Teachar getById(Long id) {
        return teacharRepository.findById(id).orElse(null);
    }

    @Override
    public Teachar save(Teachar teachar) {
        return teacharRepository.save(teachar);
    }

    @Override
    public Teachar deleteById(Long id) {
        Teachar teachar = getById(id);
        teacharRepository.deleteById(id);
        return teachar;
    }
}
