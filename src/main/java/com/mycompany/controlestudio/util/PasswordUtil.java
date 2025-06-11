package com.mycompany.controlestudio.util;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtil {
    
     private PasswordUtil(){
                
            } // Constructor privado
            
            public static String hashContrasena(String contrasenaPlana) {
            // El "work factor" (gensalt) define qué tan costoso es el hash.
            // Un valor entre 10 y 12 es un buen balance entre seguridad y rendimiento.
            return BCrypt.hashpw(contrasenaPlana, BCrypt.gensalt(12));
            }

            public static boolean verificarContrasena(String contrasenaPlana, String
            contrasenaHasheada) {
             try {
             return BCrypt.checkpw(contrasenaPlana, contrasenaHasheada);
             } catch (IllegalArgumentException e) {
                 
             
             // Esto puede ocurrir si el hash no es válido o es null.
             // En un sistema real, se registraría este evento.            
             System.err.println("Error al verificar contraseña: formato de hash inválido. "
            + e.getMessage());
             
                        return false;
            }
       } 
            public static void main(String[] args) {
                
            String contrasenaAdmin = "admin123";
            String hashAdmin = hashContrasena(contrasenaAdmin);
            
            System.out.println("Hash para 'admin123': " + hashAdmin);
            
            // Copia este hash para insertarlo en tu BD para el usuario 'admin'
            String contrasenaUsuario = "usuario123";
            
            String hashUsuario = hashContrasena(contrasenaUsuario);
            
            System.out.println("Hash para 'usuario123': " + hashUsuario);
            // Copia este hash para insertarlo en tu BD para el usuario 'usuario'
       }
         
}
