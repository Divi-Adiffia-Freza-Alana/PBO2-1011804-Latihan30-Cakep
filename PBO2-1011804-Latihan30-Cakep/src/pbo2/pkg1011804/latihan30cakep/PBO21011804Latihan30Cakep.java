/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg1011804.latihan30cakep;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.UIManager;

import java.awt.Color;
import static java.awt.Color.red;
import java.awt.Component;
import java.util.Scanner;
import javax.swing.JFrame;


/**
 *
 * @author Freza
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan Cakep

 */
public class PBO21011804Latihan30Cakep extends JFrame {
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner (System.in);
        
        System.out.println(ANSI_RED+"Kamu"+ANSI_GREEN+" Ngerjain sendiri"+ANSI_YELLOW+" latihan 17 sampe"+ANSI_BLUE+"latihan 30 ini ?"+ANSI_RESET);
        System.out.print(ANSI_BLUE+"Jawab"+ANSI_RED+"(Yoi/Enggak) :");
        String jawab = Scanner.nextLine();
        
        if(!"ENGGAK".equals(jawab)){
            System.out.println(ANSI_RED+"Tetep cakep sih");
            System.out.println(ANSI_CYAN+"Sing penting paham konsep nya yee");
            System.out.println(ANSI_RESET+"Keep code works dude");
        }
        else{
        System.out.println(ANSI_RED+"Cakep Bener."+ANSI_PURPLE+" Good Job");
    }
    }
    
}
