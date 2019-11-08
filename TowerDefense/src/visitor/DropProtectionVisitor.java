package visitor;

import DropItems.DropProtection;
import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import enemies.Enemy;
import towers.Tower;

public class DropProtectionVisitor extends Visitor{
	
	protected DropProtection item;
	
	public DropProtectionVisitor(DropProtection drop) {
		this.item=drop;
	}

	public void visit(Tower t) {
		t.buff(item);
	}
	
		
	public void visit(Enemy t) {}

	public void visit(MapItemHole h) {}

	public void visit(MapItemSpikeTrap s) {}

}
