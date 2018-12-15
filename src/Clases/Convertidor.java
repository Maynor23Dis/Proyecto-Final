/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.lang.Integer;
/**
 *
 * @author MaynorPC
 */
public class Convertidor {
 public String intoHex(int n)
 {
 return Integer.toHexString(n).toUpperCase();
 }
 public String intoOct(int n)
 {
 return Integer.toOctalString(n);
 }
 public String intoBin(int n)
 {
 return Integer.toBinaryString(n);
 }
 
}
