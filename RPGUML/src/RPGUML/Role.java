package RPGUML;
import java.util.*;

public class Role {
	 private String Name;
	    private int level;
	    private int HP;
	    
    public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

		public int getHP() {
			return HP;
		}

		public void setHP(int hP) {
			HP = hP;
		}

	public Role() {
    }
   
}