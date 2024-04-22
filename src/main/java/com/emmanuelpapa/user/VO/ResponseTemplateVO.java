package com.emmanuelpapa.user.VO;

import com.emmanuelpapa.user.entity.Userr;

public class ResponseTemplateVO {
    private Userr userr;
    private Department department;

    public ResponseTemplateVO(Userr userr, Department department) {
        this.userr = userr;
        this.department = department;
    }

    public ResponseTemplateVO() {
    }

    public Userr getUserr() {
        return userr;
    }

    public void setUserr(Userr userr) {
        this.userr = userr;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ResponseTemplateVO{" +
                "userr=" + userr +
                ", department=" + department +
                '}';
    }
}
