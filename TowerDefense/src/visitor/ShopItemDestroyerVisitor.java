package visitor;

import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import ShopObjects.ShopItemDestroyer;
import enemies.Enemy;
import towers.Tower;

public class ShopItemDestroyerVisitor extends Visitor{
	protected ShopItemDestroyer destroyer;

	public void visit(Tower t) {
		t.die();
	}

	public void visit(Enemy t) {
		t.die();
	}

	public void visit(MapItemHole h) {}

	public void visit(MapItemSpikeTrap s) {}

}
