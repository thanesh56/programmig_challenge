import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Press Enter key:");
      String str = sc.nextLine();
      
     
      String[] jocks = {
                        "Q. Why is Cinderella so bad at soccer?\nA. Because she always runs away from the ball!",
                        "Q. Are any Halloween monsters good at math?\nA. No—unless you Count Dracula!",
                        "A few months ago, Hamas “arrested” a dolphin for being an Israeli spy. Readers of Reason magazine came up with titles for the film this action might inspire: • Orcapussy…",
                        "Spotted in the classifieds: “For sale: cemetery plot, $200, so I don’t have to spend all eternity beside my ex!”Anthony Cialella, New Castle, Pennsylvania",
                        "• I Thought He Was Going to Kill Me: One Woman’s Harrowing Misunderstanding of How Haircuts Work\n• The 100 Worst Senators\n• The World’s 10 Most Powerful Women: We Make Them Discuss Fashion and Lindsay Lohan"
                        };
      
      
      while(str.isEmpty()){
          int randomIndex = (int)(Math.random()*5);
              System.out.println(jocks[randomIndex]);
              str = sc.nextLine();
          }
           
    }
}
