package com.happysg.radar.registry;

import com.happysg.radar.CreateRadar;
import com.happysg.radar.block.guidedfuze.GuidedFuzeItem;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Rarity;

public class ModItems {

    public static final ItemEntry<GuidedFuzeItem> GUIDED_FUZE = CreateRadar.REGISTRATE
            .item("guided_fuze", GuidedFuzeItem::new)
            .properties(properties -> properties.rarity(Rarity.EPIC))
            .register();

    public static void register() {
        CreateRadar.getLogger().info("Registering Items!");
    }
}
