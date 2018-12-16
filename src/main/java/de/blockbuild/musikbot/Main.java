package de.blockbuild.musikbot;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		try {
			start();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
    @Override
    public void onDisable() {
        /*if (bot != null) {
            chatManager.clearCache();
            bot.shutdown();
            */
        }
	
    private void start() {
        //initInstances();
        Bukkit.getScheduler().runTaskLater(this, () -> {
            if (true /*mcbConfigsManager.setupConfigurations()*/ ) {
                //bot = new Bot(this, eventWaiter);
            	System.out.println("Musik Bot wird gestartet");
            } else {
                this.getServer().shutdown();
            }
        }, 1L);
        //Bukkit.getScheduler().runTaskLater(this, () ->
        //        Bukkit.getPluginManager().callEvent(new StartEvent(this)), 20L);

    }
}
