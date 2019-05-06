package helloworldmvc.model;

import java.io.FileNotFoundException;
import java.io.IOException;

import helloworldmvc.Contract.IModel;

public class Model implements IModel {

    protected Models models;

    public String getHelloWorld() {
        final Models model = new Models();
        String line = "";
        try {
            line = model.readFile();
        } catch (final FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return line;

    }

}
