package val8119.emerald.tools;

import net.minecraft.util.registry.*;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public class EmeraldTools implements ModInitializer {

	public static final Item EMERALD_NUGGET = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("emeraldtools", "emerald_nugget"), EMERALD_NUGGET);

	}
}
