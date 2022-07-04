package fighter;

public class match {

	fighter f1 ;
	fighter f2 ;
	int maxweight ;
	int minweight ;
	
	match( fighter f1, fighter f2, int minweight , int maxweight){
		this.f1 = f1 ;
		this.f2 = f2 ;
		this.maxweight = maxweight;
		this.minweight = minweight ;
	}
	
	void run() {
		if (ischeck()) {
			while (this.f1.health > 0 && this.f2.health>0 ){
				System.out.println("==== YENİ ROUND =====");
				this.f2.health =this.f1.hit(this.f2);
				if (isWin ()) {
					break ;
				}
				this.f1.health =this.f2.hit(this.f2);
				if (isWin ()) {
					break ;
				}
				System.out.println(this.f1.name + "Sağlık " + this.f1.health);
				System.out.println(this.f2.name + "Sağlık " + this.f2.health);
			}
		}else {
			System.out.println("Sporcuların Sikletleri Uymuyor ");
		}
	}


	boolean ischeck() {
	return (this.f1.weight>=minweight&& this.f1.weight<= maxweight) && (this.f2.weight>=minweight&& this.f2.weight<= maxweight);
}
	boolean isWin () {
		if (this.f1.health==0) {
			System.out.println(f2.name + "Kazandı ");
		}
		if (this.f2.health==0) {
			System.out.println(f1.name + "Kazandı ");
			return true;
		
		}
		return false ;
	}
}