package mod.stjimmy.survivalkit.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{
    public static void init()
    {
        GameRegistry.addSmelting(ModItems.SCRAP_METAL, new ItemStack(Items.IRON_NUGGET, 1), 1.0F);
    }
}
