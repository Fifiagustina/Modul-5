/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Fifi Agustina
 */
public class Catch {
    
     public static void main(String[] args) {
        try
        {
            int a = 1/0;  //berpotensi untuk menimbulkan kesalahan yaitu pembagian dengan bilangan 0
            System.out.println("perintah selanjutnya");
        }
        catch(NullPointerException e)
        {
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        }
        catch(Exception e)
        {
        }
    }
    
}
