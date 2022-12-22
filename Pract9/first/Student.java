package first;

public class Student implements Comparable{
    public String Name;
    public String special;
    public int grade;
    public int groupe;
    public int idNum;
    public int mark;

    public Student(String fullName, String special, int kurs, int groupe, int idNum, int mark) {
        this.Name = fullName;
        this.special = special;
        this.grade = kurs;
        this.groupe = groupe;
        this.idNum = idNum;
        this.mark = mark;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGroupe() {
        return groupe;
    }

    public void setGroupe(int groupe) {
        this.groupe = groupe;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Object o) {
        return this.idNum - ((Student)o).idNum;
    }

    @Override
    public String toString() {
        return  "Name = " + Name +
                ", special = " + special +
                ", grade = " + grade +
                ", groupe = " + groupe +
                ", mark = " + mark +
                ", idNum = " + idNum;

    }

}
