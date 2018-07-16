import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public static boolean testDateValidation(String strDate)
{
    /* Check if date is 'null' */
    if (strDate.trim().equals(""))
    {
        return true;
    }
    /* Date is not 'null' */
    else
    {
        /*
         * Set preferred date format,
         * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
        SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
        sdfrmt.setLenient(false);
        /* Create Date object */
        Date javaDate = null;
        /* parse the string into date form */
        try
        {
            javaDate = sdfrmt.parse(strDate);
            System.out.println("Date after validation: " + javaDate);
        }
        /* Date format is invalid */
        catch (ParseException e)
        {
            System.out.println("The date you provided is in an " +"invalid date format.");
            return false;
        }
        /* Return 'true' - since date is in valid format */
        return true;
    }
} // end ValidateJavaDate