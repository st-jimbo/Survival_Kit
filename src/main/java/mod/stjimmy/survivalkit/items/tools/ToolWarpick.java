package mod.stjimmy.survivalkit.items.tools;

import mod.stjimmy.survivalkit.Main;
import mod.stjimmy.survivalkit.init.ModItems;
import mod.stjimmy.survivalkit.util.IHasModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class ToolWarpick extends ItemPickaxe implements IHasModel
{
    public ToolWarpick(String name, ToolMaterial material)
    {
        super(material);
        this.attackDamage = 4.0F + material.getAttackDamage();
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.tabMod);

        ModItems.ITEMS.add(this);
    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        return true;
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        super.addInformation(stack, worldIn, tooltip, flagIn);

        tooltip.add("\u00A76Effective at both mining and combat");
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
