package mod.stjimmy.thetestmod.items.tools;

import mod.stjimmy.thetestmod.Main;
import mod.stjimmy.thetestmod.init.ModItems;
import mod.stjimmy.thetestmod.util.IHasModel;
import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel
{
    public ToolShovel(String name, ToolMaterial material)
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
