public class six {
    public static void main(String[] args){
        try
        {
            System.out.println("try block");
            throw new NullPointerException();
        }
        catch (NumberFormatException e)
        {
            System.out.println("catch block 1");
        }
        catch (NullPointerException e)
        {
            System.out.println("catch block 2");
        }
        catch (Exception e)
        {
            System.out.println("catch block 3");
        }
        finally
        {
            System.out.println("finally block");
        }
    }
}
