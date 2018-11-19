
package com.test.gen;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "employee_name",
    "employee_salary",
    "employee_age",
    "profile_image"
})
public class Employee {

    @JsonProperty("id")
    private String id;
    @JsonProperty("employee_name")
    private String employeeName;
    @JsonProperty("employee_salary")
    private String employeeSalary;
    @JsonProperty("employee_age")
    private String employeeAge;
    @JsonProperty("profile_image")
    private String profileImage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("employee_name")
    public String getEmployeeName() {
        return employeeName;
    }

    @JsonProperty("employee_name")
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @JsonProperty("employee_salary")
    public String getEmployeeSalary() {
        return employeeSalary;
    }

    @JsonProperty("employee_salary")
    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @JsonProperty("employee_age")
    public String getEmployeeAge() {
        return employeeAge;
    }

    @JsonProperty("employee_age")
    public void setEmployeeAge(String employeeAge) {
        this.employeeAge = employeeAge;
    }

    @JsonProperty("profile_image")
    public String getProfileImage() {
        return profileImage;
    }

    @JsonProperty("profile_image")
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Employee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("employeeName");
        sb.append('=');
        sb.append(((this.employeeName == null)?"<null>":this.employeeName));
        sb.append(',');
        sb.append("employeeSalary");
        sb.append('=');
        sb.append(((this.employeeSalary == null)?"<null>":this.employeeSalary));
        sb.append(',');
        sb.append("employeeAge");
        sb.append('=');
        sb.append(((this.employeeAge == null)?"<null>":this.employeeAge));
        sb.append(',');
        sb.append("profileImage");
        sb.append('=');
        sb.append(((this.profileImage == null)?"<null>":this.profileImage));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.employeeName == null)? 0 :this.employeeName.hashCode()));
        result = ((result* 31)+((this.employeeAge == null)? 0 :this.employeeAge.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.profileImage == null)? 0 :this.profileImage.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.employeeSalary == null)? 0 :this.employeeSalary.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Employee) == false) {
            return false;
        }
        Employee rhs = ((Employee) other);
        return (((((((this.employeeName == rhs.employeeName)||((this.employeeName!= null)&&this.employeeName.equals(rhs.employeeName)))&&((this.employeeAge == rhs.employeeAge)||((this.employeeAge!= null)&&this.employeeAge.equals(rhs.employeeAge))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.profileImage == rhs.profileImage)||((this.profileImage!= null)&&this.profileImage.equals(rhs.profileImage))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.employeeSalary == rhs.employeeSalary)||((this.employeeSalary!= null)&&this.employeeSalary.equals(rhs.employeeSalary))));
    }

}
