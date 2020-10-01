package labwork1;


/**
 * Class that implements the output of information about the student
 * @author Rudnev Nikita Andreevich
 * @since 2020-01-10
 * @version 3.0
 */
public class lab1 {
    /**
     *The starting point of the project that implements the output of information to the console
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Group  : 535 st 2\n");
        System.out.println("Student  : Rudnev Nikita Andreevich\n");
        System.out.println("Variant  : 9\n");
        String[] ar = {
                "$$$$$$$$        $$$$         $$              $$$ \n",
                "$$$$$$$$$       $$ $$        $$             $$ $$ \n",
                "$$      $$      $$  $$       $$            $$   $$ \n",
                "$$      $$      $$   $$      $$           $$     $$ \n",
                "$$     $$       $$    $$     $$          $$       $$ \n",
                "$$$$$$$$        $$     $$    $$         $$$$$$$$$$$$$ \n",
                "$$ $$$          $$      $$   $$        $$$$$$$$$$$$$$$ \n",
                "$$  $$$         $$       $$  $$       $$             $$ \n",
                "$$    $$$       $$        $$ $$      $$               $$ \n",
                "$$      $$$     $$         $$$$     $$                 $$ \n"
        };

        for (String s : ar) {
            System.out.print(s);
        }
    }
}