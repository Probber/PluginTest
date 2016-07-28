import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * Represents the target.
 */
public class Target {

    String name;

    public Target(String userName){
        name = userName;
    }

    //Gets the Player Object of the Player.
    public Player getTarget(){

        for (Player potentialTarget : Bukkit.getServer().getOnlinePlayers()){

            if (potentialTarget.getPlayerListName() == name){ //I do not know if getPlayerListName is the right thing to use...
                    return potentialTarget;
            }

        }
        return null;
    }

}
