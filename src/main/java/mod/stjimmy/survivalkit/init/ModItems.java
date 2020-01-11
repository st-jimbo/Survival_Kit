package mod.stjimmy.survivalkit.init;

import java.util.ArrayList;
import java.util.List;

import mod.stjimmy.survivalkit.items.ItemBase;
import mod.stjimmy.survivalkit.items.tools.ToolAxe;
import mod.stjimmy.survivalkit.items.tools.ToolPickaxe;
import mod.stjimmy.survivalkit.items.tools.ToolShovel;
import mod.stjimmy.survivalkit.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Materials
    public static final Item.ToolMaterial MATERIAL_SCRAP = EnumHelper.addToolMaterial("materialScrap", 1, 96, 5.0F, 2.0F, 12);
    public static final Item.ToolMaterial MATERIAL_SCRAP_SPEAR = EnumHelper.addToolMaterial("materialScrapSpear", 1, 132, 4.0F, 1.0F, 12);

    // Items
    public static final Item SCRAP_METAL = new ItemBase("scrap_metal");

    // Tools
    public static final ItemSword SCRAP_SWORD = new ToolSword("scrap_sword", MATERIAL_SCRAP);
    public static final ItemSword SCRAP_SPEAR = new ToolSword("scrap_spear", MATERIAL_SCRAP_SPEAR);
    public static final ItemPickaxe SCRAP_PICKAXE = new ToolPickaxe("scrap_pickaxe", MATERIAL_SCRAP);
    public static final ItemSpade SCRAP_SHOVEL = new ToolShovel("scrap_shovel", MATERIAL_SCRAP);
    public static final ItemAxe SCRAP_AXE = new ToolAxe("scrap_axe", MATERIAL_SCRAP);

}