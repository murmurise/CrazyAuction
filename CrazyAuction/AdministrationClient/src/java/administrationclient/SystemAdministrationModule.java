/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrationclient;

import ejb.session.stateless.EmployeeControllerRemote;
import entity.Employee;

/**
 *
 * @author Summer
 */
public class SystemAdministrationModule {
    private EmployeeControllerRemote employeeControllerRemote;
    
    private Employee currentEmployee;

    public SystemAdministrationModule() {
    }

    public SystemAdministrationModule(EmployeeControllerRemote employeeControllerRemote, Employee currentEmployee) {
        this.employeeControllerRemote = employeeControllerRemote;
        this.currentEmployee = currentEmployee;
    }
    
    public void menuSystemAdministration(){
    
    }
}