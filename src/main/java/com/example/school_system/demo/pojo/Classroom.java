package com.example.school_system.demo.pojo;

public class Classroom {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classroom.id
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classroom.classroom_name
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    private String classroomName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classroom.classroom_type
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    private String classroomType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classroom.people_num
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    private Integer peopleNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classroom.academy_name
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    private String academyName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classroom.id
     *
     * @return the value of classroom.id
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classroom.id
     *
     * @param id the value for classroom.id
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classroom.classroom_name
     *
     * @return the value of classroom.classroom_name
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public String getClassroomName() {
        return classroomName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classroom.classroom_name
     *
     * @param classroomName the value for classroom.classroom_name
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName == null ? null : classroomName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classroom.classroom_type
     *
     * @return the value of classroom.classroom_type
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public String getClassroomType() {
        return classroomType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classroom.classroom_type
     *
     * @param classroomType the value for classroom.classroom_type
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public void setClassroomType(String classroomType) {
        this.classroomType = classroomType == null ? null : classroomType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classroom.people_num
     *
     * @return the value of classroom.people_num
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public Integer getPeopleNum() {
        return peopleNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classroom.people_num
     *
     * @param peopleNum the value for classroom.people_num
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classroom.academy_name
     *
     * @return the value of classroom.academy_name
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public String getAcademyName() {
        return academyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classroom.academy_name
     *
     * @param academyName the value for classroom.academy_name
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public void setAcademyName(String academyName) {
        this.academyName = academyName == null ? null : academyName.trim();
    }
}