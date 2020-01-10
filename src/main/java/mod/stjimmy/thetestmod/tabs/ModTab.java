package mod.stjimmy.thetestmod.tabs;

import mod.stjimmy.thetestmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTab extends CreativeTabs
{
    public ModTab(String label)
    {
        super("tabMod");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ModItems.SCRAP_SWORD);
    }
}
