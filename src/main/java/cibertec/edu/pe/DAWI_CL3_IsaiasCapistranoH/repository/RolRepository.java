package cibertec.edu.pe.DAWI_CL3_IsaiasCapistranoH.repository;

import cibertec.edu.pe.DAWI_CL3_IsaiasCapistranoH.model.bd.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol,
        Integer> {
    Rol findByNomrol(String nomrol);
}
