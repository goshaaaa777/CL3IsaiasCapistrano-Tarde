package cibertec.edu.pe.DAWI_CL3_IsaiasCapistranoH.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultadoResponse {
    private boolean respuesta;
    private String mensaje;
}
