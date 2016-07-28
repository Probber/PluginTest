import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * A Command that is teleporting a Player to you
 */
public class TPPlayer implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {

            String user = args[0];

            if (!user.isEmpty()) {

                Target theTarget = new Target(user);
                Player targetObject = theTarget.getTarget();


                Location senderLoc = ((Player) sender).getLocation();
                targetObject.teleport(senderLoc);
                Location targetLoc = targetObject.getLocation();

                if (senderLoc == targetLoc) {
                    sender.sendMessage("You got teleported!");
                    return true;
                } else {

                    sender.sendMessage("Something went wrong");
                    return false;
                }

            } else {

                sender.sendMessage("You should type in some name to teleport to.");
                return false;
            }

        } else {

            sender.sendMessage("Dear console, please stay where you are!");
            return false;
        }
    }
}
