package ch10_extends_interface.starcraft;

public class Marin extends StarUnit{
    // 자식 클래스 extends 부모 클래스
    // 먼저 자식클래스들을 만들고
    // 나중에 부모클래스로 한번에 묶어 주자
    // 실력이 쌓이면 부모클래스부터 만들어도됨


    public Marin() {
        super("마린", 6, 50, 0, 4, 1, 1,50);
    }
    
    // 공격
    public void attack(StarUnit starUnit){
        // starUnit의 체력이 마린의 공격력 만큼 감소
        // 부모 필드에 private인 변수 나 메소드는 자식 객체에서 사용불가
        // public으로 선언되있는 get??()을 가져오도록 하자
        starUnit.setHp(starUnit.getHp() - this.getDamage());
    }

    public void attack(HighTemplar highTemplar){
        // this.get() = super.get() 두개는 같은말 
        highTemplar.setHp(highTemplar.getHp() - super.getDamage());
    }
    
    // 스팀팩
    public void stimpack(){
        System.out.println("으아아아!!");
        // 스팀팩을 쓰면 체력이 10감소 공격속도 2배
//        this.hp -= 10;
        this.setHp(this.getHp() - 10);
//        this.attackSpeed *= 2;
        this.setAttackSpeed(this.getAttackSpeed() * 2);
    }
    
    @Override
    public String toString() {
        return "Marin{" +
                "name='" + this.getName() + '\'' +
                ", damage=" + getDamage() +
                ", hp=" + super.getHp() +
                ", armor=" + getArmor() +
                ", attackRange=" + getAttackRange() +
                ", attackSpeed=" + getAttackSpeed() +
                ", moveSpeed=" + getMoveSpeed() +
                ", mineral=" + getMineral() +
                '}';
    }
}
