package model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

    private String pname;

    private List<String> strList;

    private Set<String> strSet;

    private Map<String, String> strMap;


    public Person() {

    }

    public Person(String name) {
        this.pname = name;
    }

    public void sayname() {
        System.out.println("name:" + pname);
    }


    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public Set<String> getStrSet() {
        return strSet;
    }

    public void setStrSet(Set<String> strSet) {
        this.strSet = strSet;
    }

    public Map<String, String> getStrMap() {
        return strMap;
    }

    public void setStrMap(Map<String, String> strMap) {
        this.strMap = strMap;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }


}