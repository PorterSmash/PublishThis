
public /*interface */class Move {
	int attackPower;
	int critChance;
	int hitChance;
	
	public Move(int atkPwr, int crtChc, int htChc) {
		attackPower = atkPwr;
		critChance = crtChc;
		hitChance = htChc;
	}
}
//shouldn't this be an interface?
