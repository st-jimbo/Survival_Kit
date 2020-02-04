package mod.stjimmy.survivalkit.items.tools;

import com.google.common.collect.Sets;
import mod.stjimmy.survivalkit.Main;
import mod.stjimmy.survivalkit.init.ModItems;
import mod.stjimmy.survivalkit.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

import java.util.List;
import java.util.Set;

public class ToolMaul extends ItemTool implements IHasModel
{
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet();

    public ToolMaul(String name, ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        this.attackDamage = 7.0F + material.getAttackDamage();
        this.attackSpeed = -3.0F;
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

        tooltip.add("\u00A76Slow, but hard hitting");
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
