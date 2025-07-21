class Student
{
    int rno;
    String sname;
    void accept(int rno,String sname)
    {
      this.rno=rno;
      this.sname=sname;
    }
    void display()
    {
       System.out.println("rno is "+rno);
       System.out.println("name is "+sname);
    }

}