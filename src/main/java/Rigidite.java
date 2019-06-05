import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class Rigidite {

    private List<App> rigidites = new ArrayList<App>();


    public void addApp(App app){
        rigidites.add(app);

    }


    public double getAllRigidite() {
        double acc = 0;
        int size = rigidites.size();

        for (int i = 0; i < size; i++) {
            acc += rigidites.get(i).getAppRigidite();
        }

        return acc/size;
    }


}
