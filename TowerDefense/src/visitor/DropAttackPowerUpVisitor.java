package visitor;

import Characters.Enemy;
import Characters.Tower;
import DropItems.DropAttackPowerUp;

public class DropAttackPowerUpVisitor extends Visitor{
	
	protected DropAttackPowerUp item;
	
	public DropAttackPowerUpVisitor(DropAttackPowerUp drop) {
		this.item=drop;
	}

	//Dependiendo del item deberia darle algun efecto.
	public void visit(Tower t) {
		t.buff(item);
	}
	
		
	public void visit(Enemy t) {}

}