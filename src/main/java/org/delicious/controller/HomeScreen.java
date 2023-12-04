package org.delicious.controller;

import java.util.Scanner;

import org.delicious.view.AnimatedPrompts;
import org.delicious.view.ProgressBar;

import static org.delicious.view.AnsiColorCodes.*;

public class HomeScreen {
    public static void display(Scanner scanner) {

        while (true) {
            System.out.println(yellow + bold + """
                                    
                    ░██╗░░░░░░░██╗███████╗██╗░░░░░░█████╗░░█████╗░███╗░░░███╗███████╗░░░░░░░░████████╗░█████╗░
                    ░██║░░██╗░░██║██╔════╝██║░░░░░██╔══██╗██╔══██╗████╗░████║██╔════╝░░░░░░░░╚══██╔══╝██╔══██╗
                    ░╚██╗████╗██╔╝█████╗░░██║░░░░░██║░░╚═╝██║░░██║██╔████╔██║█████╗░░░░░░░░░░░░░██║░░░██║░░██║
                    ░░████╔═████║░██╔══╝░░██║░░░░░██║░░██╗██║░░██║██║╚██╔╝██║██╔══╝░░░░░░░░░░░░░██║░░░██║░░██║
                    ░░╚██╔╝░╚██╔╝░███████╗███████╗╚█████╔╝╚█████╔╝██║░╚═╝░██║███████╗░░░░░░░░░░░██║░░░╚█████╔╝
                    ░░░╚═╝░░░╚═╝░░╚══════╝╚══════╝░╚════╝░░╚════╝░╚═╝░░░░░╚═╝╚══════╝░░░░░░░░░░░╚═╝░░░░╚════╝░
                                    
                    ██████╗░░█████╗░██████╗░░█████╗░██╗░██████╗░░░░░░░░░██████╗██╗░░░██╗██████╗░███████╗██████╗░██╗░█████╗░██╗
                    ██╔══██╗██╔══██╗██╔══██╗██╔══██╗╚█║██╔════╝░░░░░░░░██╔════╝██║░░░██║██╔══██╗██╔════╝██╔══██╗██║██╔══██╗██║
                    ██████╔╝███████║██████╔╝███████║░╚╝╚█████╗░░░░░░░░░╚█████╗░██║░░░██║██████╦╝█████╗░░██████╔╝██║███████║██║
                    ██╔═══╝░██╔══██║██╔═══╝░██╔══██║░░░░╚═══██╗░░░░░░░░░╚═══██╗██║░░░██║██╔══██╗██╔══╝░░██╔══██╗██║██╔══██║╚═╝
                    ██║░░░░░██║░░██║██║░░░░░██║░░██║░░░██████╔╝░░░░░░░░██████╔╝╚██████╔╝██████╦╝███████╗██║░░██║██║██║░░██║██╗
                    ╚═╝░░░░░╚═╝░░╚═╝╚═╝░░░░░╚═╝░░╚═╝░░░╚═════╝░░░░░░░░░╚═════╝░░╚═════╝░╚═════╝░╚══════╝╚═╝░░╚═╝╚═╝╚═╝░░╚═╝╚═╝\s
                    """);
            System.out.println(yellow + bold + """
                    𝑾𝒉𝒆𝒓𝒆 𝒚𝒐𝒖 𝒄𝒂𝒏 𝒈𝒆𝒕 𝑷𝒂𝒑𝒂❜𝒔 𝑭𝒂𝒎𝒐𝒖𝒔 𝑺𝒖𝒃𝒔!
                                        
                    𝑷𝒍𝒆𝒂𝒔𝒆 𝒔𝒆𝒍𝒆𝒄𝒕 𝒕𝒐 𝒔𝒕𝒂𝒓𝒕 𝒂 𝒏𝒆𝒘 𝒐𝒓𝒅𝒆𝒓:
                    \s
                    1. 𝙉𝙚𝙬 𝙊𝙧𝙙𝙚𝙧
                    0. 𝙀𝙭𝙞𝙩
                    """);

            switch (userInputs(scanner)) {
                case 1 -> {
//                    progressBar();
                    OrderScreen.display(scanner);
                }
                case 0 -> {
                    System.out.println(red+ bold + """                 
                            ███╗░░██╗░█████╗░░██╗░░░░░░░██╗░░░░░███████╗██╗░░██╗██╗████████╗██╗███╗░░██╗░██████╗░░░░░░░░░░
                            ████╗░██║██╔══██╗░██║░░██╗░░██║░░░░░██╔════╝╚██╗██╔╝██║╚══██╔══╝██║████╗░██║██╔════╝░░░░░░░░░░
                            ██╔██╗██║██║░░██║░╚██╗████╗██╔╝░░░░░█████╗░░░╚███╔╝░██║░░░██║░░░██║██╔██╗██║██║░░██╗░░░░░░░░░░
                            ██║╚████║██║░░██║░░████╔═████║░░░░░░██╔══╝░░░██╔██╗░██║░░░██║░░░██║██║╚████║██║░░╚██╗░░░░░░░░░
                            ██║░╚███║╚█████╔╝░░╚██╔╝░╚██╔╝░░░░░░███████╗██╔╝╚██╗██║░░░██║░░░██║██║░╚███║╚██████╔╝██╗██╗██╗
                            ╚═╝░░╚══╝░╚════╝░░░░╚═╝░░░╚═╝░░░░░░░╚══════╝╚═╝░░╚═╝╚═╝░░░╚═╝░░░╚═╝╚═╝░░╚══╝░╚═════╝░╚═╝╚═╝╚═╝
                            """ + reset);
                    System.exit(0);
                }
                default -> {
                    System.out.println(red + bold + "Invalid Choice. Please input either 1 or 0." + reset + yellow);
                }
            }
        }
    }

    public static void progressBar() {
        try {
            String[] String = new String[0];
            ProgressBar.main(String);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int userInputs(Scanner scanner) {
        int val = scanner.nextInt();
        scanner.nextLine();
        return val;
    }

    public static int userCharInputs() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
}