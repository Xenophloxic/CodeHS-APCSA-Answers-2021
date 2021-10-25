/**
 * 
 * The phone class represents a cellular phone.
 * 
 * Add the instance variables you think a phone would need
 */ 

public class Phone // instialize the class (i know i spelt that wrong, don't bully im tired)
{
    // Attributes
    int number;
    int email;
    // constructor
    public Phone(int number, int email)
    {
        // this.blablabla is basically just saying, take the parameters from THIS class, kinda more advanced
        this.number = number; 
        this.email = email;
        /**
        You could also do:

        public Phone(int pNumber, int eMail)
        {
            number = pNumber;
            email = eMail
        }
         */
    }
}