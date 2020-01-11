package mod.stjimmy.survivalkit.items.tools;

import mod.stjimmy.survivalkit.Main;
import mod.stjimmy.survivalkit.init.ModItems;
import mod.stjimmy.survivalkit.util.IHasModel;

import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel
{
    public ToolSword(String name, ToolMaterial material)
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
