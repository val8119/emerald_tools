package val8119.emerald.tools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EmeraldToolsMaterial implements ToolMaterial {

    public static final EmeraldToolsMaterial INSTANCE = new EmeraldToolsMaterial();

    @Override
    public int getDurability() {
        return 1849;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.75F;
    }

    @Override
    public float getAttackDamage() {
        return 5.5F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 13;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.EMERALD);
    }

}