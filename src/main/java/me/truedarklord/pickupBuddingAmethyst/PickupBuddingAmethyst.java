package me.truedarklord.pickupBuddingAmethyst;

import me.truedarklord.pickupBuddingAmethyst.listeners.BlockBreak;
import org.bukkit.plugin.java.JavaPlugin;

public final class PickupBuddingAmethyst extends JavaPlugin {

    @Override
    public void onEnable() {
        advertise();

        new BlockBreak(this);
    }

    private void advertise() {
        this.getServer().getConsoleSender().sendMessage(
                """
  
 §#00AA00================================§#ee2222

  _____ _      _                                \s
 |  __ (_)    | |                               \s
 | |__) |  ___| | ___   _ _ __                  \s
 |  ___/ |/ __| |/ / | | | '_ \\                 \s
 | |   | | (__|   <| |_| | |_) |                \s
 |_|   |_|\\___|_|\\_\\\\__,_| .__/                 \s
                         | |                    \s
  ____            _     _|_|                    \s
 |  _ \\          | |   | (_)                    \s
 | |_) |_   _  __| | __| |_ _ __   __ _         \s
 |  _ <| | | |/ _` |/ _` | | '_ \\ / _` |        \s
 | |_) | |_| | (_| | (_| | | | | | (_| |        \s
 |____/ \\__,_|\\__,_|\\__,_|_|_| |_|\\__, |     _  \s
    /\\                  | | | |    __/ |    | | \s
   /  \\   _ __ ___   ___| |_| |__ |___/_ ___| |_\s
  / /\\ \\ | '_ ` _ \\ / _ \\ __| '_ \\| | | / __| __|
 / ____ \\| | | | | |  __/ |_| | | | |_| \\__ \\ |_\s
/_/    \\_\\_| |_| |_|\\___|\\__|_| |_|\\__, |___/\\__|
                                   __/ |       \s
                                   |___/        \s
                                  
§#f5da2aBy TrueDarkLord.
§#00AA00================================
§#f5da2aFeel free to buy me a coffee:  §#00AA00|
§bhttps://ko-fi.com/truedarklord §#00AA00|
§#00AA00================================
                        """
        );
    }
}
