package com.app.chapin.persistence.respository;

import com.app.chapin.persistence.models.Lecciones;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LeccionRepository extends JpaRepository<Lecciones, Integer> {

    public boolean existsById(Integer id);

    public Lecciones findByQuiz(Integer id);

    public List<Lecciones> findAllByTipoLeccion(String tipoLeccion);
}
