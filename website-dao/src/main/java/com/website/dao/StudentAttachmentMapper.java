package com.website.dao;

import com.website.pojo.StudentAttachment;
import com.website.pojo.StudentAttachmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentAttachmentMapper {
    long countByExample(StudentAttachmentExample example);

    int deleteByExample(StudentAttachmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StudentAttachment record);

    int insertSelective(StudentAttachment record);

    List<StudentAttachment> selectByExample(StudentAttachmentExample example);

    StudentAttachment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StudentAttachment record, @Param("example") StudentAttachmentExample example);

    int updateByExample(@Param("record") StudentAttachment record, @Param("example") StudentAttachmentExample example);

    int updateByPrimaryKeySelective(StudentAttachment record);

    int updateByPrimaryKey(StudentAttachment record);
}