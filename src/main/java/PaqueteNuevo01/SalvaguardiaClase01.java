/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteNuevo01;

/**
 *
 * @author 1DAM
 */
public class SalvaguardiaClase01 {
    
    String Nombre;
    String Apellido;
    int Numero;
    String Email;
	
	public SalvaguardiaClase01 (String Nombre, String Apellido, int Numero, String Email) {
		
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Numero = Numero;
		this.Email = Email;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre (String Nombre) {
		this.Nombre = Nombre;
	}
	
	public String getApellido() {
		return Apellido;
	}
	
	public void setApellido (String Apellido) {
		this.Apellido = Apellido;
	}
	
	public int getNumero() {
		return Numero;
	}
	
	public void setNumero (int Numero) {
		this.Numero = Numero;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail (String Email) {
		this.Email = Email;
	}
    
}
