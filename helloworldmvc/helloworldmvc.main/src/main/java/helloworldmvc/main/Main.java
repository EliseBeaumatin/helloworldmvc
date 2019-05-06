package helloworldmvc.main;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class Main {

    public static void main(final String[] args) {

        final View view = new View();
        final Model model = new Model();
        final Controller controller = new Controller(view, model);
        controller.run();

    }

}
