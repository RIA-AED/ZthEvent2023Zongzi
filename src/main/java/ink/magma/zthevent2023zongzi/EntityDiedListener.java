package ink.magma.zthevent2023zongzi;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.time.LocalDate;

public class EntityDiedListener implements Listener {
    CustomItems customItems = new CustomItems();

    @EventHandler
    public void onEntityDie(EntityDeathEvent event) {
        if (LocalDate.now().isAfter(LocalDate.of(2023, 6, 29))) return;

        if (event.getEntity().getType() == EntityType.ZOMBIE && Math.random() <= 0.8) {
            event.getDrops().add(customItems.nuomi);
        }

        if (event.getEntity().getType() == EntityType.CREEPER && Math.random() <= 0.5) {
            event.getDrops().add(customItems.meat);
        }

        if (event.getEntity().getType() == EntityType.SPIDER && Math.random() <= 0.5) {
            event.getDrops().add(customItems.mizhao);
        }

        if (event.getEntity().getType() == EntityType.SKELETON && Math.random() <= 0.5) {
            event.getDrops().add(customItems.dousha);
        }
    }

}
