package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.com.kodilla.hibernate.manytomany.facade.Company;
import com.kodilla.hibernate.com.kodilla.hibernate.manytomany.facade.CompanyFacade;
import com.kodilla.hibernate.com.kodilla.hibernate.manytomany.facade.Employee;
import com.kodilla.hibernate.com.kodilla.hibernate.manytomany.facade.dao.CompanyDao;
import com.kodilla.hibernate.com.kodilla.hibernate.manytomany.facade.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyFacade companyFacade;


    @Test
    public void findCompanyTest(){

        Company company1 = new Company("Software Machine");
        Company company2 = new Company("Data Maesters");
        Company company3 = new Company("Grey Matter");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        try{
            companyFacade.findCompanyWithPhaseInName("ma");
        } catch (SecurityException e){

        }
    }

    @Test
    public void findEmployeeTest(){

        Employee employee1 = new Employee("Aleksandra","Radzikowska");
        Employee employee2 = new Employee("Sebastian","Deoniziak");
        Employee employee3 = new Employee("Julia","Frączek");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        try{
            companyFacade.findEmployeeWithPhaseInLastName("olk");
        } catch (SecurityException e){

        }
    }
}
