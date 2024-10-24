# qa-notes

`java -jar .\target\damis_app.jar`

Input stream reader takes raw data and turns it into an ascii object
```java
public class App {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        LineNumberReader lnr = new LineNumberReader(isr);

        try {
            while (lnr.readLine() != null)
                ;

            System.out.println("No of lines" + lnr.getLineNumber());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
```


Gives you the number of lines in a file, can also use to write the output of something to a file

`java -jar .\target\damis_app.jar < .gitignore`

javac followed by file name will run the code, you need to be in the same directory where you saved the file to first
`javac Main.java`

Every line of code that runs inside java must be inside of a class, the nam of the java file must match the class name 

Function used to add up two numbers

```java
public class App {
    public static void main(String[] args) {
        int result = sum(4, 5);
        System.out.println("The sum is: " + result);
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
```

## System 
is a built-in Java class that contains useful members, such as out, which is short for "output". The println() method, short for "print line", is used to print a value to the screen (or a file).

You should also note that each code statement must end with a semicolon (;)

## The Print() Method
There is also a print() method, which is similar to println().

The only difference is that it does not insert a new line at the end of the output
