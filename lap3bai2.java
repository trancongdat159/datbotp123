//Book
package bai2;

public class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;

    public Book() {
        this.boCode = null;
        this.boTitle = null;
        this.boAuthor = null;
    }

    public Book(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }

    public Book(Book bo) {
        this.boCode = bo.boCode;
        this.boTitle = bo.boTitle;
        this.boAuthor = bo.boAuthor;
    }

    public String getBoCode() {
        return this.boCode;
    }

    public String getBoTitle() {
        return this.boTitle;
    }

    public String getBoAuthor() {
        return this.boAuthor;
    }

    public void setBoCode(String code) {
        this.boCode = code;
    }

    public void setBoTitle(String title) {
        this.boTitle = title;
    }

    public void setBoAuthor(String authorname) {
        this.boAuthor = authorname;
    }
    @Override
    public String toString() {
        return "{" +
                " boCode='" + getBoCode() + "'" +
                ", boTitle='" + getBoTitle() + "'" +
                ", boAuthor='" + getBoAuthor() + "'" +
                "}";
    }

}
//LibraryCard.java

package bai2;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class LibraryCard {
    private long lbCode;
    private String owner;
    private int borrowCount;

    public LibraryCard() {
        this.lbCode = 0;
        this.owner = null;
        this.borrowCount = 0;
    }

    public LibraryCard(long lbCode, String owner, int borrowCount) {
        this.lbCode = lbCode;
        this.owner = owner;
        this.borrowCount = borrowCount;
    }

    public long getLbCode(){
        return this.lbCode;
    }

    public String getOwner(){
        return this.owner;
    }

    public long getBorrowCount(){
        return this.borrowCount;
    }

    public void setLbCode(long code) {
        this.lbCode = code;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void checkOut(int num) {
        this.borrowCount++;
    }

    @Override
    public String toString() {
        return "{" +
                " lbCode='" + getLbCode() + "'" +
                ", owner='" + getOwner() + "'" +
                ", borrowCount='" + getBorrowCount() + "'" +
                "}";
    }

}

//Main.java

package bai2;

public class Main {
    public static void main(String[] args) {
        Book sach = new Book("a","b","c");
        System.out.println(sach.toString());
    }
}

//Student.java 
package bai2;

public class Student {
    private String stID;
    private String stName;
    private String stClass;

    public Student() {
        this.stID = null;
        this.stName = null;
        this.stClass = null;
    }

    public Student (String stID, String stName, String stClass){
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }

    public Student(Student st) {
        this.stID = st.stID;
        this.stName = st.stName;
        this.stClass = st.stClass;
    }

    public String getStID() {
        return this.stID;
    }

    public void setStID(String stID) {
        this.stID = stID;
    }

    public String getStName() {
        return this.stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStClass() {
        return this.stClass;
    }

    public void setStClass(String stClass) {
        this.stClass = stClass;
    }

    @Override
    public String toString() {
        return "{" +
                " stID='" + getStID() + "'" +
                ", stName='" + getStName() + "'" +
                ", stClass='" + getStClass() + "'" +
                "}";
    }

}
