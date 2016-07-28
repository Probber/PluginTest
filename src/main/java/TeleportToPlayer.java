import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * A Command that teleports you to a player
 */
public class TeleportToPlayer implements CommandExecutor {

    //When command gets executed
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        String user = args[0];

        if (!user.isEmpty()){

            Target theTarget = new Target(user);

            //Check if its a player
            if (sender instanceof Player) {

                Player target = theTarget.getTarget();

                if (target == null) {
                    return false;
                } else {
                    ((Player) sender).teleport(target);
                    return true;
                }

            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
