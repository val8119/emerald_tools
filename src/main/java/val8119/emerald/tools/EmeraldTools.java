package val8119.emerald.tools;

import net.minecraft.util.registry.*;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;

public class EmeraldTools implements ModInitializer {

	public static final Item EMERALD_NUGGET = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static ToolItem EMERALD_PICKAXE = new CustomPickaxeItem(EmeraldToolsMaterial.INSTANCE, 1, 1.0F,
			new Item.Settings().group(ItemGroup.TOOLS));

	public static ToolItem EMERALD_AXE = new CustomAxeItem(EmeraldToolsMaterial.INSTANCE, 1F, 1F,
			new Item.Settings().group(ItemGroup.TOOLS));

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("emeraldtools", "emerald_nugget"), EMERALD_NUGGET);

		Registry.register(Registry.ITEM, new Identifier("emeraldtools", "emerald_pickaxe"), EMERALD_PICKAXE);

		Registry.register(Registry.ITEM, new Identifier("emeraldtools", "emerald_axe"), EMERALD_AXE);

	}
}