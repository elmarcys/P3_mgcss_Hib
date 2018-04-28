package casospoliciales;
// Generated 05-abr-2018 15:42:40 by Hibernate Tools 4.3.1



/**
 * Experto generated by hbm2java
 */
public class Experto  implements java.io.Serializable {


     private String codexperto;
     private String nombre;
     private String pais;
     private Character sexo;
     private String especialidad;

    public Experto() {
    }

	
    public Experto(String codexperto, String nombre, String pais, String especialidad) {
        this.codexperto = codexperto;
        this.nombre = nombre;
        this.pais = pais;
        this.especialidad = especialidad;
    }
    public Experto(String codexperto, String nombre, String pais, Character sexo, String especialidad) {
       this.codexperto = codexperto;
       this.nombre = nombre;
       this.pais = pais;
       this.sexo = sexo;
       this.especialidad = especialidad;
    }
   
    public String getCodexperto() {
        return this.codexperto;
    }
    
    public void setCodexperto(String codexperto) {
        this.codexperto = codexperto;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Character getSexo() {
        return this.sexo;
    }
    
    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }
    public String getEspecialidad() {
        return this.especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "\t Codigo: " + codexperto + ", Nombre: " + nombre + ", Pais: " +pais + ", Sexo: " 
                + sexo + ", Especialidad: " + especialidad ;
    }




}


