class Keishou2 {

  public static void main(String[] args) {
    MemberKeishou mk = new MemberKeishou();

    System.out.println(mk.getName());
  }
}

class Member {

  private String name;

  public Member() {
    this.setName("継承");
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}

class MemberKeishou extends Member {

  private int age;

  public MemberKeishou() {
    this.setAge(30);
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }
}
