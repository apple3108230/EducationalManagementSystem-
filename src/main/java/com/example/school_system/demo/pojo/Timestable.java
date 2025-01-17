package com.example.school_system.demo.pojo;

import com.example.school_system.demo.utils.StringUtil;

public class Timestable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column timestable.id
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column timestable.class_name
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    private String className;

    private Course course;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column timestable.time
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    private String time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column timestable.classroom_name
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    private String classroomName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column timestable.weeks
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    private String weeks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column timestable.term
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    private String term;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column timestable.notice
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    private String notice;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column timestable.id
     *
     * @return the value of timestable.id
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column timestable.id
     *
     * @param id the value for timestable.id
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column timestable.class_name
     *
     * @return the value of timestable.class_name
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column timestable.class_name
     *
     * @param className the value for timestable.class_name
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column timestable.time
     *
     * @return the value of timestable.time
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column timestable.time
     *
     * @param time the value for timestable.time
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column timestable.classroom_name
     *
     * @return the value of timestable.classroom_name
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public String getClassroomName() {
        return classroomName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column timestable.classroom_name
     *
     * @param classroomName the value for timestable.classroom_name
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName == null ? null : classroomName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column timestable.weeks
     *
     * @return the value of timestable.weeks
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public String getWeeks() {
        return weeks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column timestable.weeks
     *
     * @param weeks the value for timestable.weeks
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public void setWeeks(String weeks) {
        this.weeks = weeks == null ? null : weeks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column timestable.term
     *
     * @return the value of timestable.term
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public String getTerm() {
        return term;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column timestable.term
     *
     * @param term the value for timestable.term
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column timestable.notice
     *
     * @return the value of timestable.notice
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public String getNotice() {
        return notice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column timestable.notice
     *
     * @param notice the value for timestable.notice
     *
     * @mbg.generated Tue Mar 19 16:34:36 CST 2019
     */
    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }

    public TimestableVo toTimestablePo(){
        TimestableVo timestableVo =new TimestableVo();
        timestableVo.setId(getId());
        timestableVo.setClassName(getClassName());
        timestableVo.setClassroomName(getClassroomName());
        timestableVo.setNotice(getNotice());
        timestableVo.setTerm(getTerm());
        timestableVo.setTime(getTime());
        timestableVo.setWeeks(getWeeks());
        timestableVo.setTeacherName(getCourse().getTeacherName());
        timestableVo.setCourseName(getCourse().getCourseName());
        return timestableVo;
    }
}