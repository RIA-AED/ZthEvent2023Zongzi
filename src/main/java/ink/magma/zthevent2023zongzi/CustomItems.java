package ink.magma.zthevent2023zongzi;

import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class CustomItems {
    public ItemStack nuomi = new ItemStack(Material.SUGAR);
    public ItemStack meat = new ItemStack(Material.PORKCHOP);
    public ItemStack mizhao = new ItemStack(Material.SPIDER_EYE);
    public ItemStack dousha = new ItemStack(Material.BONE_MEAL);

    MiniMessage miniMessage = MiniMessage.miniMessage();


    CustomItems() {
        ItemMeta nuomiMeta = nuomi.getItemMeta();
        nuomiMeta.displayName(miniMessage.deserialize("<italic:false><#faf0de>防腐糯米</#faf0de></italic>"));
        nuomiMeta.lore(List.of(
                miniMessage.deserialize("<italic:false><gray>获得了奇怪的食材！</gray></italic>"),
                miniMessage.deserialize("<italic:false><gray>从粽子身上掉落的糯米，</gray></italic>"),
                miniMessage.deserialize("<italic:false><gray>被椰能保护着没有腐坏。</gray></italic>"),
                miniMessage.deserialize("<italic:false><gray>好像可以做成吃的。</gray></italic>"),
                miniMessage.deserialize("<italic:false><dark_gray><2023-端午></dark_gray></italic>")
        ));
        nuomi.setItemMeta(nuomiMeta);

        ItemMeta meatMeta = meat.getItemMeta();
        meatMeta.displayName(miniMessage.deserialize("<italic:false><#f5a77d>爆咸猪肉</#f5a77d></italic>"));
        meatMeta.lore(List.of(
                miniMessage.deserialize("<italic:false><gray>获得了奇怪的食材！</gray></italic>"),
                miniMessage.deserialize("<italic:false><gray>从奇怪的猪身上掉落的咸猪肉，</gray></italic>"),
                miniMessage.deserialize("<italic:false><gray>看起来随时会爆炸。</gray></italic>"),
                miniMessage.deserialize("<italic:false><gray>好像可以做成吃的。</gray></italic>"),
                miniMessage.deserialize("<italic:false><dark_gray><2023-端午></dark_gray></italic>")
        ));
        meat.setItemMeta(meatMeta);

        ItemMeta mizhaoMeta = mizhao.getItemMeta();
        mizhaoMeta.displayName(miniMessage.deserialize("<italic:false><#a3371f>怪味蜜枣</#a3371f></italic>"));
        mizhaoMeta.lore(List.of(
                miniMessage.deserialize("<italic:false><gray>获得了奇怪的食材！</gray></italic>"),
                miniMessage.deserialize("<italic:false><gray>从蜘蛛身上掉落的蜜枣，</gray></italic>"),
                miniMessage.deserialize("<italic:false><gray>让人感觉味道不太妙。</gray></italic>"),
                miniMessage.deserialize("<italic:false><gray>好像可以做成吃的。</gray></italic>"),
                miniMessage.deserialize("<italic:false><dark_gray><2023-端午></dark_gray></italic>")
        ));
        mizhao.setItemMeta(mizhaoMeta);

        ItemMeta doushaMeta = dousha.getItemMeta();
        doushaMeta.displayName(miniMessage.deserialize("<italic:false>白色豆沙</italic>"));
        doushaMeta.lore(List.of(
                miniMessage.deserialize("<italic:false><gray>获得了奇怪的食材！</gray></italic>"),
                miniMessage.deserialize("<italic:false><gray>从骷髅身上掉落的豆沙，</gray></italic>"),
                miniMessage.deserialize("<italic:false><gray>怎么一摸就掉色了？</gray></italic>"),
                miniMessage.deserialize("<italic:false><gray>好像可以做成吃的。</gray></italic>"),
                miniMessage.deserialize("<italic:false><dark_gray><2023-端午></dark_gray></italic>")
        ));
        dousha.setItemMeta(doushaMeta);
    }


}
