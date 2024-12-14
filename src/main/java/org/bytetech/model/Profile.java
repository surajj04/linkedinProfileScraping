package org.bytetech.model;

import lombok.Data;

import java.util.List;
@Data
public class Profile {
    private String name;
    private String headline;
    private String location;
    private String about;
    private List<String> experience;
    private List<String> education;
    private List<String> skills;
    private List<String> certification;


}
