/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.parametros;

/**
 *
 * @author Luis
 */
public class RolParametros {
    
    public static final String OPERACION_INGRESA = "I";
    public static final String OPERACION_ACTUALIZA = "U";
    public static final String OPERACION_SELECT_ID = "SID";
    public static final String OPERACION_SELECT_POR_USUARIO = "SUSU";
    public static final String OPERACION_SELECT_TODOS = "STOD";
    public static final String OPERACION_ELIMINAR = "DEL";    
    public static final String NOMBRE_PROCEDIMIENTO = "SELECT * FROM seguridad.pa_roles(?,?,?,?,?);";
    
}
