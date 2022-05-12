package pl.pijok.mmostats;

import org.bukkit.plugin.java.JavaPlugin;
import pl.pijok.api.Debugger;

public class MMOStats extends JavaPlugin {

    private Debugger debugger;

    @Override
    public void onEnable() {
        API.create(this);
        
        debugger = API.getDebugger();

        loadStuff(false);
    }

    @Override
    public void onDisable() {
        saveStuff();
    }

    public boolean loadStuff(boolean reload){
        try {
            if(!reload){

            }


        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void saveStuff(){
        try{

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
