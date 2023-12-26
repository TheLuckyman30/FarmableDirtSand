package net.luckyman30.farmabledirtsand;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FarmableDirtSand implements ModInitializer {

	public static final String MOD_ID = "farmabledirtsand";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static void registerNewTrades () {
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
				factories -> {
					factories.add((entity, random) -> new TradeOffer(
							new ItemStack(Items.EMERALD, 5),
							new ItemStack(Items.DIRT, 20),
							20, 2, 0.0F
					));
					factories.add((entity, random) -> new TradeOffer(
							new ItemStack(Items.EMERALD,5),
							new ItemStack(Items.SAND, 20),
							20, 2, 0.0F
					));
				});
	}

	@Override
	public void onInitialize() {
		registerNewTrades();
	}
}
