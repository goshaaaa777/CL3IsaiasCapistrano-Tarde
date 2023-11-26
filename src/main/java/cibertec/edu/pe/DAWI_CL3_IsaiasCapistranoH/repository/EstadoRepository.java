package cibertec.edu.pe.DAWI_CL3_IsaiasCapistranoH.repository;

import cibertec.edu.pe.DAWI_CL3_IsaiasCapistranoH.model.bd.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository <Estado, Integer> {
}
