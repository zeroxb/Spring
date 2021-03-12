package mx.com.gm.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



public class EncriptarPassword {
	
   public static void main(String[]args){
        
        var password = "RootmasterUser";
        var passwordEncriptado = encriptarPassword(password);
        System.out.println("Password : " + password);
        System.out.println("Password Encriptado : " + passwordEncriptado);
   }

   public static String encriptarPassword(String password){
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    return encoder.encode(password);
   }
}


