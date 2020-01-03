package com.jpmc.zitcode.model;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employees {


    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    @Id
  //  @Column(name = "empNo")
    private int empno;


    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }


   // @Column(name="empName")
    private String empname;
   // @Column(name="dept")
    private String dept;
   // @Column(name="desig")
    private String desig;
  //  @Column(name = "Loc")
    private String loc;

    public Double getEmpsal() {
        return empsal;
    }

    public void setEmpsal(Double empsal) {
        this.empsal = empsal;
    }

  //  @Column(name="empSal")
    private Double empsal;


    public Employees() {
    }

    public Employees(int empNo, String name, String dept, String desig, String Loc, Double sal) {
        this.empno = empNo;
        this.empname = name;
        this.dept = dept;
        this.desig = desig;
        this.loc = Loc;
        this.empsal = sal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employees{");
        sb.append("no=").append(empno);
        sb.append(", name= ").append(empname).append(" , ");
        sb.append(", dept=").append(dept).append(", ");
        sb.append(" , desig=").append(desig).append(", ");
        sb.append(" , Loc=").append(loc).append(", ");
        sb.append(" , sal=").append(empsal);
        sb.append("}");
        return sb.toString();
    }


}
