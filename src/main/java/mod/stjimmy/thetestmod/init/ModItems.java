package mod.stjimmy.thetestmod.init;

import java.util.ArrayList;
import java.util.List;

import mod.stjimmy.thetestmod.items.ItemBase;
import mod.stjimmy.thetestmod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Materials
    public static final Item.ToolMaterial MATERIAL_SCRAP = EnumHelper.addToolMaterial("materialScrap", 1, 96, 4.0F, 2.0F, 12);
    public static final Item.ToolMaterial MATERIAL_SCRAP_SPEAR = EnumHelper.addToolMaterial("materialScrapSpear", 1, 132, 4.0F, 1.0F, 12);

    // Items
    public static final Item SCRAP_METAL = new ItemBase("scrap_metal");

    // Tools
    public static final ItemSword SCRAP_SWORD = new ToolSword("scrap_sword", MATERIAL_SCRAP);
    public static final ItemSword SCRAP_SPEAR = new ToolSword("scrap_spear", MATERIAL_SCRAP_SPEAR);

}
