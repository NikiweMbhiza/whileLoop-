/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whilelooppattern;

/**
 *
 * @author Dell-User
 */
public class WhileLoopPattern {

    public static void main(String[] args) {
    
        int row = 1;
        while (row <= 5) {
            int col = 1;
            while (col <= row) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
    
}
