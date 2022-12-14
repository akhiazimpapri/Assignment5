################1

Filename: “Appointment.java”

//define a class Appointment

public abstract class Appointment

{

//declare the class member description

    private String description;

//define the constructor

    public Appointment()

    {

//initialize description

        description = "";

    }

//define a method to set the value of description

    public void setDescription(String description)

    {

//set the value of description

        this.description = description;

    }

//define an abstact method occursOn()

    public abstract boolean occursOn(int year, int month, int day);

//define a method toString()

    public String toString()

    {

//return the value of description

        return description;

    }

}

Filename: “Monthly.java”

//define class Monthly

public class Monthly extends Appointment

{

//declare class member

    private int day;

//define constructor Monthly

    public Monthly(int day, String description)

    {

//call setDescription()

        setDescription(description);

//set day

        this.day = day;

    }

//define the method occursOn()

    public boolean occursOn(int year, int month, int day)

    {

//return the result

        return day == this.day;

    }

}

Filename: “Onetime.java”

//define class Onetime

public class Onetime extends Appointment

{

//class members

    private int year;

    private int month;

    private int day;

//define constructor Onetime()

    public Onetime(int year, int month, int day, String description)

    {

//set the value of class members

        setDescription(description);

        this.year = year;

        this.month = month;

        this.day = day;

    }

//define method occursOn()

    public boolean occursOn(int year, int month, int day)

    {

//return the result

        return year == this.year && month == this.month && day == this.day;

    }

}

Filename: “Daily.java”

//define the class Daily

public class Daily extends Appointment

{

//define the constructor

    public Daily(String description)

    {

//call setDescription()

        setDescription(description);

    }

//define the method occursOn()

    public boolean occursOn(int year, int month, int day)

    {

//return true

        return true;

    }

}

Filename: “AppointmentTester.java”

//define class AppointmentTester

public class AppointmentTester

{

//define main method

    public static void main(String[] args)

    {

//check Monthly is subclass of Appointment

        System.out.print("Monthly is subclass of Appointment: ");

        System.out.println(Monthly.class.getSuperclass() == Appointment.class);

//print the expected result

        System.out.println("Expected: true");

//check Onetime is subclass of Appointment

        System.out.print("Onetime is subclass of Appointment: ");

        System.out.println(Onetime.class.getSuperclass() == Appointment.class);

//print the expected result

        System.out.println("Expected: true");

//check Daily is subclass of Appointment

        System.out.print("Daily is subclass of Appointment: ");

        System.out.println(Daily.class.getSuperclass() == Appointment.class);

//print the expected result

        System.out.println("Expected: true");

//check whether monthy appoinment have extra fields

        System.out.print("Monthly appointments have no extra fields: ");

        System.out.println(Monthly.class.getDeclaredFields().length == 1);

//print the expected result

        System.out.println("Expected: true");

//check whether Onetime appoinment have extra fields

        System.out.print("Onetime appointments have no extra fields: ");

        System.out.println(Onetime.class.getDeclaredFields().length == 3);

//print the expected result

        System.out.println("Expected: true");

//check whether Daily appoinment have extra fields

        System.out.print("Daily appointments have no extra fields: ");

        System.out.println(Daily.class.getDeclaredFields().length == 0);

//print the expected result

        System.out.println("Expected: true");

//define the object of Monthly

        Appointment obj = new Monthly(15, "pay the bills");

//checking themonthly  appointment

        System.out.println("Checking Monthly appointment: " + obj);

//print the expected result

        System.out.println("Expected: pay the bills");

//call occursOn to check the date

        System.out.println(obj.occursOn(2016, 8, 15));

//print the expected result

        System.out.println("Expected: true");

//define the object of Onetime

        obj = new Onetime(2016, 11, 1, "Dentist appointment.");

//checking the one time appointment

        System.out.println("Checking onetime appointment: " + obj);

//print the expected result

        System.out.println("Expected: Dentist appointment.");

//call occursOn to check the date

        System.out.println(obj.occursOn(2016, 11, 1));

//print the expected result

        System.out.println("Expected: true");

//define the object of Daily

        obj = new Daily("walk the dog.");

//checking the daily appointment

        System.out.println("Checking daily appointment: " + obj);

        System.out.println("Expected: walk the dog");

//call occursOn to check the date

        System.out.println(obj.occursOn(2016, 12, 25));

//print the expected result

        System.out.println("Expected: true");

    }

}



#################  2

        Filename: “Daily.java”

//define the class Daily

public class Daily extends Appointment

{

//define the consructor Daily

    public Daily(String description)

    {

//set the description

        setDescription(description);

    }

//define the method occursOn

    public boolean occursOn(int year, int month, int day)

    {

//return true

        return true;

    }

}

Filename: “Appointment.java”

//define the class Appointment

public abstract class Appointment

{

//declare the variable description

    private String description;

//define the constructor Appointment

    public Appointment()

    {

//set the value of description

        description = "";

    }

//method to set the description of this appointment.

    public void setDescription(String description)

    {

//set the description

        this.description = description;

    }

//method to determine if this appointment occurs on the given date.

    public abstract boolean occursOn(int year, int month, int day);

//define the method toString()

    public String toString()

    {

//return the description as a string

        return description;

    }

}

Filename: “AppointmentTester.java”

//define the method AppointmentTester

public class AppointmentTester

{

//define main method

    public static void main(String[] args)

    {

//print the message

        System.out.print("Daily is subclass of Appointment: ");

//get the super class of appoinment, if it is Daily print true, false otherwise

        System.out.println(Daily.class.getSuperclass() == Appointment.class);

//print the expected result

        System.out.println("Expected: true");

//print the message

        System.out.print("Daily appointments have no extra fields:");

// if Daily has no extra fields print true

        System.out.println(Daily.class.getDeclaredFields().length == 0);

//print the expected value

        System.out.println("Expected: true");

// Try some appointments

        Appointment obj = new Daily("walk the dog");

//print the daily appoinment

        System.out.println("Checking daily appointment: " + obj);

//print the expected appoinment

        System.out.println("Expected: walk the dog");

//call the method occursOn on a particular date. print the result

        System.out.println(obj.occursOn(2016, 12, 25));

//print the expected result

        System.out.println("Expected: true");

    }

}





#################### 2

File name: “Daily.java”

//Import necessary packages

import java.io.PrintWriter;

import java.util.Scanner;

//Create a class

public class Daily extends Appointment

{

    //Define the constructor

    public Daily() { }

    /*Define the parameterized constructor to construct a Daily Appointment */

    public Daily(String description)

    {

        setDescription(description);

    }

    /*Define a method to determines if the appointment occurs on the given date */

    public boolean occursOn(int year, int month, int day)

    {

        return true;

    }

    //Define a method to save the appointment to a PrintWriter

    public boolean save(PrintWriter outw)

    {

        try

        {

            outw.println("D " + super.toString());

        }

        catch (Exception e)

        {

            return false;

        }

        return true;

    }

    /*Define a method to load the appointment from a Scanner */

    public boolean load(Scanner scr)

    {

        try

        {

            // The D is already consumed at this point

            setDescription(scr.nextLine().trim());

        }

        catch (Exception e)

        {

            return false;

        }

        return true;

    }

}

    File name: “Monthly.java”

        //Import necessary packages

        import java.io.PrintWriter;

        import java.util.Scanner;

//Create a class

public class Monthly extends Appointment

{

    //Declare the variable

    private int aday;

    //Define the constructor

    public Monthly() { }

    /*Define a parameterized constructor to initialize appointment for a given date */

    public Monthly(int sday, String description)

    {

        setDescription(description);

        this.aday = sday;

    }

    /*Define a method to determine if the appointment occurs on the given date*/

    public boolean occursOn(int year, int month, int day)

    {

        return day == this.aday;

    }

    //Define a method to save the appointment to a PrintWriter

    public boolean save(PrintWriter outw)

    {

        try

        {

            outw.println("M " + aday + " " + super.toString());

        }

        catch (Exception ep)

        {

            return false;

        }

        return true;

    }

    /*Define a method to load the appointment from a Scanner*/

    public boolean load(Scanner scr)

    {

        try

        {

            aday = scr.nextInt();

            setDescription(scr.nextLine().trim());

        }

        catch (Exception e)

        {

            return false;

        }

        return true;

    }

}

    File name: “Onetime.java”

        //Import necessary package

        import java.io.PrintWriter;

        import java.util.Scanner;

//Create a class

public class Onetime extends Appointment

{

    //Declare necessary variables

    private int ayear;

    private int amonth;

    private int aday;

    //Define the constructor

    public Onetime() { }

    /*Define a parameterized constructor to initialize appointment for a given date */

    public Onetime(int year, int month, int day, String description)

    {

        setDescription(description);

        this.ayear = year;

        this.amonth = month;

        this.aday = day;

    }

    /*Define a method to determine if the appointment occurs on the given date*/

    public boolean occursOn(int year, int month, int day)

    {

        return year == this.ayear && month == this.amonth && day == this.aday;

    }

    //Define a method to save the appointment to a PrintWriter

    public boolean save(PrintWriter outw)

    {

        try

        {

            outw.println("O " + ayear + " " + amonth + " " + aday + " " + super.toString());

        }

        catch (Exception e)

        {

            return false;

        }

        return true;

    }

    /*Define a method to load the appointment from a Scanner */

    public boolean load(Scanner inp)

    {

        try

        {

            ayear = inp.nextInt();

            amonth = inp.nextInt();

            aday = inp.nextInt();

            setDescription(inp.nextLine().trim());

        }

        catch (Exception e)

        {

            return false;

        }

        return true;

    }

}



################# 3




    File name: “Appointment.java”

        //Import necessary packages

        import java.io.PrintWriter;

        import java.util.Scanner;

//Create a class

public abstract class Appointment

{

    //Declare a variable

    private String descriptions;

    /*Define the constructor to construct an appointment without a description */

    public Appointment()

    {

        descriptions = "";

    }

    //Define a method to set the description of the appointment

    public void setDescription(String description)

    {

        this.descriptions = description;

    }

    /*Define a method to determine if the appointment occurs on the given date*/

    public boolean occursOn(int year, int month, int day)

    {

        return false;

    }

    /*Define a method to convert appointment to string description*/

    public String toString()

    {

        return descriptions;

    }

    /*Declare a method to save the appointment to a PrintWriter*/

    public abstract boolean save(PrintWriter out);

    //Declare a method to load the appointment from a Scanner

    public abstract boolean load(Scanner in);

}

    File name: “AppointmentsTester.java”

        //Import necessary packages

        import java.util.Scanner;

        import java.io.PrintWriter;

        import java.io.File;

//Create a class

public class AppointmentsTester

{

    //Define the main() method

    public static void main(String[] args)

    {

        /*Execute Try statement to check the occurrence of exception*/

        try (PrintWriter outw = new PrintWriter("src/appointments.txt"))

        {

            //Create require number of objects

            Appointment dailya = new Daily("brush your teeth");

            Appointment monthlya = new Monthly(15, "pay the bills");

            Appointment onetimea = new Onetime(2016, 10, 22, "remember anniversary");

            //Print actual and expected output

            System.out.println(dailya.save(outw));

            System.out.println("Expected: true");

            System.out.println(monthlya.save(outw));

            System.out.println("Expected: true");

            System.out.println(onetimea.save(outw));

            System.out.println("Expected: true");

        }

        //Catch if exception occurs

        catch (Exception ep)

        {

            System.out.println("Error: " + ep.toString());

        }

        /*Execute Try statement to check the occurrence of exception*/

        try (Scanner in = new Scanner(new File("src/appointments.txt")))

        {

            //Read the data from a file

            String types = in.next();

            //Print actual and expected output

            System.out.println(types);

            System.out.println("Expected: D");

            Appointment daily2 = new Daily();

            System.out.println(daily2.load(in));

            System.out.println("Expected: true");

            System.out.println(daily2.toString());

            System.out.println("Expected: brush your teeth");

            types = in.next();

            System.out.println(types);

            System.out.println("Expected: M");

            Appointment monthly2 = new Monthly();

            System.out.println(monthly2.load(in));

            System.out.println("Expected: true");

            System.out.println(monthly2.toString());

            System.out.println("Expected: pay the bills");

            System.out.println(monthly2.occursOn(2016, 11, 15));

            System.out.println("Expected: true");

            types = in.next();

            System.out.println(types);

            System.out.println("Expected: O");

            Appointment onetime2 = new Onetime();

            System.out.println(onetime2.load(in));

            System.out.println("Expected: true");

            System.out.println(onetime2.toString());

            System.out.println("Expected: remember anniversary");

            System.out.println(onetime2.occursOn(2016, 10, 22));

            System.out.println("Expected: true");

            Appointment dummya = new Monthly();

            System.out.println(dummya.load(in));

            System.out.println("Expected: false");

        }

        //Catch if exception occur

        catch (Exception ep)

        {

            System.out.println("Error: " + ep.toString());

        }

    }

}
