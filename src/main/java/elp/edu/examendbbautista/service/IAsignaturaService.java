package elp.edu.examendbbautista.service;



import elp.edu.examendbbautista.entity.Asignatura;

import java.util.List;

public interface IAsignaturaService {
    List<Asignatura> listaAsignaturas();

    Asignatura obtenerPorDenominacionOrSigla(String denoSig);

    Asignatura guardarAsignatura(Asignatura asignatura);
}