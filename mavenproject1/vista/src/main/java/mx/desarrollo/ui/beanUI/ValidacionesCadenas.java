/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.ui.beanUI;

/**
 *
 * @author Johan
 */
public class ValidacionesCadenas {
    
    static boolean esCadenaSoloLetras(String cadena) {
        // Expresión regular que valida las letras del alfabeto español con acentos y ñ
        String regex = "^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]+$";
        
        // Retorna true si la cadena coincide con el patrón, false en caso contrario
        return cadena.matches(regex);
    }
    
    static String limpiarEspacios(String cadena) {
        
        return cadena.trim().replaceAll("\\s+", " ");
    }
    
    static boolean isBlank(String str) {
        return str.trim().isEmpty();
    }
}
