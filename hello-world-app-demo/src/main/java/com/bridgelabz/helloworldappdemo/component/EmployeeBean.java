package com.bridgelabz.helloworldappdemo.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private int eid;
    private String eName;

    @Autowired
    private DepartmentBean departmentBean;
    public static  final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    public EmployeeBean() {}

    /**
     * This setter method is used for @Autowire on setter
     * @param departmentBean
     */
    @Autowired
    public EmployeeBean(DepartmentBean departmentBean) {
        logger.trace("*** AutoWiring by using @Autowire annotation on constructor ***");
        this.departmentBean = departmentBean;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public DepartmentBean getDepartmentBean() {
        return departmentBean;
    }

    public void setDepartmentBean(DepartmentBean departmentBean) {
        logger.trace("*** Autowiring by using @Autowire annotation on setter ***");
        this.departmentBean = departmentBean;
    }
    public void showEmployeeDetails() {
        logger.debug("Employee Id : {}", eid);
        logger.debug("Employee Name : {}", eName);
        departmentBean.setDeptName("Information Technology");
        logger.debug("Department : {}", departmentBean.getDeptName());
    }
}
