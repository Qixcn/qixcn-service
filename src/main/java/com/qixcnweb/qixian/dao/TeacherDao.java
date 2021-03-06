package com.qixcnweb.qixian.dao;

import com.qixcnweb.qixian.domain.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by dingxiaochi on 2018/4/3.
 */
public interface TeacherDao extends CrudRepository<Teacher, Long> {

    /** ------------------------------------------------- 增 -------------------------------------------------------- **/

    /** ------------------------------------------------- 删 -------------------------------------------------------- **/

    /** ------------------------------------------------- 改 -------------------------------------------------------- **/

    /** ------------------------------------------------- 查 -------------------------------------------------------- **/

    //根据用户ID查询教师
    Teacher findTeacherById(Integer teacherId);

    //根据学校ID查询教师
    List<Teacher> findTeacherBySchoolId(Integer schoolId);

    //根据学校ID和状态查询教师
    List<Teacher> findTeacherBySchoolIdAndStatus(Integer schoolId,Integer status);

    //根据教师ID集合查询教师
    List<Teacher> findTeacherByIdIn(List<Integer> idlIst);

}
