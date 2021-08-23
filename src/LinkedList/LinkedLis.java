/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedList;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author MjadTech06
 */
public class LinkedLis {

    /**
     * @param args the command line arguments
     */
    static String ask;
    public static void main(String[] args) throws IOException {
    
    do{    

    Scanner scan = new Scanner(System.in);
    
    String colors[] = { "black", "yellow", "green","blue", "violet", "silver" };
    String colors2[] = { "gold", "white", "brown","blue", "gray", "silver" };
    
      LinkedList list2 = new LinkedList(Arrays.asList(colors2));
      
      Iterator iter= list2.listIterator();

      System.out.println("------------MENU----------");
      System.out.println("| 0. Exit                | ");
      System.out.println("| 1. Printlist           | ");
      System.out.println("| 2. Clearlist           | ");
      System.out.println("| 3. Insert New Item     | ");
      System.out.println("| 4. Remove Item         | ");
      System.out.println("| 5. Sortlist            | ");
      System.out.println("| 6. Update Item         | ");
      System.out.println("| 7. Find Item           | ");
      System.out.println("| 8. Get Item            | ");
      System.out.println("--------------------------");
      
      
      System.out.print("Enter your choice: ");
      int ch = scan.nextInt();
      switch(ch){
          case 1://Print List
              System.out.println("List ");
               while(iter.hasNext()){
                    System.out.print(iter.next()+" ");
                }
               System.out.println("");
              break;
              
          case 2://Clear List
              list2.clear();
              System.out.println("List "+list2);
              break;
              
          case 3://Add item to list
              Scanner s2 = new Scanner(System.in);
              System.out.print("Enter new color: ");
              String newitem = s2.next();
              list2.add(newitem);
              System.out.println("List "+list2);
              break;
              
          case 4://Remove Item
              System.out.println("List "+list2);
              Scanner s3 = new Scanner(System.in);
              System.out.print("Enter item to remove: ");
              String remitem = s3.next();
              list2.remove(remitem);
              System.out.println("List "+list2);
              break;
              
          case 5://Sort list
              Collections.sort(list2);
              System.out.println("List"+ list2);
              break;
              
          case 6://update item
              System.out.println("List"+ list2);
              Scanner s4 = new Scanner(System.in);
              System.out.print("Enter item indext to udpate: ");
              int i = s4.nextInt();
              System.out.print("Enter item to be replaced: ");
              String uitem = s4.next();
              list2.set(i,uitem);
              System.out.println("Updated List "+list2);
              break;
                
          case 7://find item
              Scanner s5 = new Scanner(System.in);
              System.out.print("Enter item to find: ");
              String find = s5.nextLine();
              boolean blelement = list2.contains(find);
              if(blelement){
                  System.out.println(find + " is existing on the list! ");
              }else{
                  System.out.println(find + " is not existing on the list! ");
              }
              break;
              
          case 8://get item
              System.out.println("List "+list2);
              Scanner s6 = new Scanner(System.in);
              System.out.print("Enter item index: ");
              int ind = s6.nextInt();
              System.out.println("Element at index "+ind+" is "+list2.get(ind));
              break;
              
          case 0:
              System.out.println("System Exit.");
              System.exit(0);
              break;
              
          default:
              System.out.println(ch + " is not belong to the option");
              break;
      }
      System.out.print("Do you want to continue?Press y to continue: ");
      
      Scanner as = new Scanner(System.in);
      ask = as.nextLine();
      }while(ask.equals("Y")|| ask.equals("y"));
    }
}
