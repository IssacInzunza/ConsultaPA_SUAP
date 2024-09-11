/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.ui;

import java.util.List;
import mx.SUAP.entidad.Profesores;
import mx.desarrollo.helper.ConsultaHelper;

/**
 *
 * @author jesus
 */
public class ConsultasBeanUI {
    static private ConsultaHelper consultaHelper;

    public ConsultasBeanUI() {
        consultaHelper = new ConsultaHelper();
    }

    public void init() {
    }

    public static void main(String[] args) {
        ConsultasBeanUI beanUI = new ConsultasBeanUI();

        List<Profesores> profesoresList = consultaHelper.getProfesores();

        // Imprimir detalles de todos los profesores
        if (profesoresList != null && !profesoresList.isEmpty()) {
            for (Profesores profesor : profesoresList) {
                System.out.println("ID: " + profesor.getIdProfesor());
                System.out.println("Nombre: " + profesor.getNombre());
                System.out.println("Apellido: " + profesor.getApellido());
                System.out.println("RFC: " + profesor.getRfc());
            }
        } else {
            System.out.println("No se encontraron profesores en la base de datos.");
        }
    }
}


