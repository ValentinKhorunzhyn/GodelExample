package by.horunzhyn.godel.dto.employee;

import by.horunzhyn.godel.data.Gender;
import by.horunzhyn.godel.dto.BaseDto;
import by.horunzhyn.godel.dto.department.DepartmentDto;
import by.horunzhyn.godel.dto.jobtitle.JobTitleDto;

import java.time.LocalDate;

public class EmployeeDto extends BaseDto {

    private String firstName;
    private String lastName;
    private DepartmentDto department;
    private JobTitleDto jobTitle;
    private Gender gender;
    private LocalDate dateOfBirth;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DepartmentDto getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDto department) {
        this.department = department;
    }

    public JobTitleDto getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitleDto jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
