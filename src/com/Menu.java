/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.ArrayList;
import java.util.Scanner;
import linked_list.SLL;
import linked_list.SLLNode;

/**
 *
 * @author duyta
 */
public class Menu extends ArrayList<String> {

    public Menu() {
        super();
    }

    public int getUserChoice() {
        int choice = 0, i;
        //Print out options
        System.out.println();
        for (i = 0; i < this.size(); i++) {
            System.out.println((i + 1) + "-" + this.get(i));
        }
        System.out.println("Select an option: 1.." + i + ":");
        //get user choice
        Scanner sc = new Scanner(System.in);
        choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

}