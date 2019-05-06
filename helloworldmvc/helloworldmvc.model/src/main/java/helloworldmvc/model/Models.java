package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Models {

    // private final String FileName = wh.txt;
    private String        HelloWorldMessage = null;
    private static Models instance          = null;

    private BufferedReader br;

    Models() throws FileNotFoundException, IOException {
        this.readFile();

    }

    private void readFile() throws FileNotFoundException, IOException {
        final File file = new File("C:/Users/elise/Desktop/wh.txt");
        this.br = new BufferedReader(new FileReader(file));
        final String message = this.br.readLine();
        this.HelloWorldMessage = message;

    }

    public String getHelloWorldMessage() {
        return this.HelloWorldMessage;
    }

    public void setHelloWorldMessage(final String helloWorldMessage) {
        this.HelloWorldMessage = helloWorldMessage;
    }

    public static Models getInstance() {
        return Models.instance;
    }

    public static void setInstance(final Models instance) {
        Models.instance = instance;
    }

}
