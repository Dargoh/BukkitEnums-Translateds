package rush.enums;

import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public enum InventoryName {
	
	ANVIL("Bigorna"),
	BEACON("Sinalizador"),
	BREWING("Suporte de po��es"),
	CHEST("Ba�"),
	CRAFTING("Invent�rio"), // � aquela parte do inv com 4 slots que da pra craftar
	CREATIVE("Criativo"), // N�o sei se � a melhor tradu��o
	DISPENSER("Ejetor"),
	DROPPER("Liberador"),
	ENCHANTING("Mesa de encantamentos"),
	ENDER_CHEST("Enderchest"),
	FURNACE("Fornalha"),
	HOPPER("Funil"),
	MERCHANT("Alde�o"), // N�o sei se � a melhor tradu��o
	PLAYER("Invent�rio"),
	SHULKER_BOX("Caixa de Shulker"),
	WORKBENCH("Bancada de trabalho");
	
	private String name;

	InventoryName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	} 
	
	public static InventoryName valueOf(Inventory inventory) {
		return InventoryName.valueOf(inventory.getType());
	}
	
	public static InventoryName valueOf(InventoryType inventoryType) {
		return InventoryName.valueOf(inventoryType.name());
	}
	
}