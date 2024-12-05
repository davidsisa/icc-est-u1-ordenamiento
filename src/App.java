import controllers.*;
import view.View;
public class App {
    public static void main(String[] args) throws Exception {
        View vista = new View();
        ShortingMethods shortingMethods = new ShortingMethods();
        SearchMethods  searchMethods = new SearchMethods();
        Controller controller=new Controller(vista,shortingMethods, searchMethods);
        controller.start();
    }
}
