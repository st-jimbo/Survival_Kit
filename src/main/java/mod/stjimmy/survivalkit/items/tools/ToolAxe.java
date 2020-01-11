package mod.stjimmy.survivalkit.items.tools;

import mod.stjimmy.survivalkit.Main;
import mod.stjimmy.survivalkit.init.ModItems;
import mod.stjimmy.survivalkit.util.IHasModel;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel
{
    public ToolAxe(String name, ToolMaterial material)
    {
        super(material, 6.0F, -3.0F);
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
