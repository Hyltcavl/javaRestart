
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.util.logging.SimpleFormatter;

public abstract class LogHandler {
    // private final static Logger LOGGER = Logger.getLogger()
    private Logger logger;
    private File logFile;
    private FileHandler fh;

    // public LogHandler


    public void logThis(){
        try{
            fh = new FileHandler("logs.txt", true);
            logger = Logger.getLogger("test");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.setLevel(Level.INFO);
            logger.info("first line");
        }catch (IOException io){
            System.out.println("woops" + io);
        }
    }

    private void mkdir(){
        new File("logs").mkdir();
    }
    private void mkfile(){
        logFile = new File("logs\\logs.txt");
        try{
            boolean b = logFile.createNewFile();
            System.out.println(b);
        }catch (IOException io){
            System.out.println(io.toString());
        }

    }
}
