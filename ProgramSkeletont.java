public class ProgramSkeletont implements Comparable {

    private String name;

    public ProgramSkeletont() {
        super();

    }

    @Override
    public String toString() {

        return "man" + this.getName() + " " + "age" + this.getAge();
    }

    private int age;

    public ProgramSkeletont(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        ProgramSkeletont p = (ProgramSkeletont) obj;
        return this.name.equals(p.name) && this.age == p.age;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return this.name.hashCode() + this.age;
    }

    @Override
    public int compareTo(Object o) {

        ProgramSkeletont p = (ProgramSkeletont) o;
        int temp = this.age - p.age;
        return temp == 0 ? this.name.compareTo(p.name) : temp;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
