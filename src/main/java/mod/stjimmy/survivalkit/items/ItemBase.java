package mod.stjimmy.survivalkit.items;

import mod.stjimmy.survivalkit.Main;
import mod.stjimmy.survivalkit.init.ModItems;
import mod.stjimmy.survivalkit.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.tabMod);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
