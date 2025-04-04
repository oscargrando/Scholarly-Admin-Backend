package org.niit_project.backend.models;

import org.niit_project.backend.entities.Admin;
import org.niit_project.backend.enums.Colors;
import org.niit_project.backend.entities.Student;

public class User {
    public enum MemberRole {admin, student}
    private String id;
    private String firstName, lastName;
    private MemberRole role;
    private Colors color;
    private String email,phoneNumber, profile;

    private String currentDeviceToken;

    public User(){}

    private User(String id, String firstName, MemberRole role, String lastName, String email, String phoneNumber, String profile, String currentDeviceToken) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentDeviceToken = currentDeviceToken;
        this.email = email;
        this.role = role;
        this.phoneNumber = phoneNumber;
        this.profile = profile;
    }

    private User(String id, String firstName, MemberRole role, String lastName, String email, String phoneNumber, String profile, Colors color, String currentDeviceToken) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.currentDeviceToken = currentDeviceToken;
        this.phoneNumber = phoneNumber;
        this.profile = profile;
        this.color = color;
    }

    public static User fromStudent(Student student){
        return new User(student.getId(), student.getFirstName(), MemberRole.student, student.getLastName(), student.getEmail(), student.getPhoneNumber(), student.getProfile(), student.getPlayerId());
    }
    public static User fromAdmin(Admin admin){
        return new User(admin.getId(), admin.getFirstName(), MemberRole.admin, admin.getLastName(), admin.getEmail(), admin.getPhoneNumber(), admin.getProfile(), admin.getColor(), admin.getPlayerId());
    }

    public Colors getColor() {
        return color == null? Colors.getRandomColor(): color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public MemberRole getRole() {
        return role;
    }

    public void setRole(MemberRole role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
