/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author Zhabiyan
 */
public class TestInterface {
    public static void main(String[] args) {
    // make 2 object
    Line line = new Line(13, 37, 28, 4);
    Line line2 = new Line(34, 23, 16, 9);
    // length object 1 and 2
    System.out.println("Panjang Angka Objek 1 = " + line.getLength());
    System.out.println("Panjang Angka Objek 2 = " + line2.getLength());
    System.out.println("");
    // Perbandingan
    System.out.println("Perbandingan Objek 1 > Objek 2 = " + line.isGreater(line, line2));
    System.out.println("Perbandingan Objek 1 > Objek 2 = " + line.isLess(line, line2));
    System.out.println("Perbandingan Objek 1 > Objek 2 = " + line.isEqual(line, line2));
    }
}
