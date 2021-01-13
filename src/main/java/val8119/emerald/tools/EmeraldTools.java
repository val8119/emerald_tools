package val8119.emerald.tools;

import net.minecraft.util.registry.*;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;

public class EmeraldTools implements ModInitializer {

	// Emerald Nugget

	public static final Item EMERALD_NUGGET = new Item(new Item.Settings().group(ItemGroup.MISC));

	// Emerald Tools

	public static ToolItem EMERALD_PICKAXE = new CustomPickaxeItem(EmeraldToolsMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));

	public static ToolItem EMERALD_AXE = new CustomAxeItem(EmeraldToolsMaterial.INSTANCE, 5F, -3F, new Item.Settings().group(ItemGroup.TOOLS));

	public static ToolItem EMERALD_SHOVEL = new ShovelItem(EmeraldToolsMaterial.INSTANCE, 1.5F, -3F, new Item.Settings().group(ItemGroup.TOOLS));

	public static ToolItem EMERALD_HOE = new CustomHoeItem(EmeraldToolsMaterial.INSTANCE, -3, 0F, new Item.Settings().group(ItemGroup.TOOLS));

	public static ToolItem EMERALD_SWORD = new SwordItem(EmeraldToolsMaterial.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));

	// Emerald Armor

	public static final ArmorMaterial CustomArmorMaterial = new EmeraldArmorMaterial();

	public static final Item EMERALD_HELMET = new ArmorItem(CustomArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));

	public static final Item EMERALD_CHESTPLATE = new ArmorItem(CustomArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));

	public static final Item EMERALD_LEGGINGS = new ArmorItem(CustomArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));

	public static final Item EMERALD_BOOTS = new ArmorItem(CustomArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

	@Override
	public void onInitialize() {

		// Emerald Nugget

		Registry.register(Registry.ITEM, new Identifier("emeraldtools", "emerald_nugget"), EMERALD_NUGGET);

		// Emerald Tools

		Registry.register(Registry.ITEM, new Identifier("emeraldtools", "emerald_pickaxe"), EMERALD_PICKAXE);

		Registry.register(Registry.ITEM, new Identifier("emeraldtools", "emerald_axe"), EMERALD_AXE);

		Registry.register(Registry.ITEM, new Identifier("emeraldtools", "emerald_shovel"), EMERALD_SHOVEL);

		Registry.register(Registry.ITEM, new Identifier("emeraldtools", "emerald_hoe"), EMERALD_HOE);

		Registry.register(Registry.ITEM, new Identifier("emeraldtools", "emerald_sword"), EMERALD_SWORD);

		// Emerald Armor

		Registry.register(Registry.ITEM, new Identifier("emeraldtools", "emerald_helmet"), EMERALD_HELMET);

		Registry.register(Registry.ITEM, new Identifier("emeraldtools", "emerald_chestplate"), EMERALD_CHESTPLATE);

		Registry.register(Registry.ITEM, new Identifier("emeraldtools", "emerald_leggings"), EMERALD_LEGGINGS);

		Registry.register(Registry.ITEM, new Identifier("emeraldtools", "emerald_boots"), EMERALD_BOOTS);

	}
}