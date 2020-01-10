package mod.stjimmy.thetestmod.items.tools;

import mod.stjimmy.thetestmod.Main;
import mod.stjimmy.thetestmod.init.ModItems;
import mod.stjimmy.thetestmod.util.IHasModel;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel
{
    public ToolPickaxe(String name, ToolMaterial material)
    {
        super(material);
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
