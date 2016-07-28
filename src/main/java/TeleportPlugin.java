/**
 * Main Class of the Plugin
 */

import org.bukkit.plugin.java.JavaPlugin;

public class TeleportPlugin extends JavaPlugin {

    //Fires when the plugin gets enabled
    @Override
    public void onEnable() {
        //Register the command
        this.getCommand("tp2").setExecutor(new TeleportToPlayer());
        this.getCommand("tpp").setExecutor(new TPPlayer());
    }

    //Fires when the plugin gets disabled
    @Override
    public void onDisable() {


    }

    public static void main(String [ ] args){


    }

}
