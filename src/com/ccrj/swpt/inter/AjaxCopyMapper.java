package com.ccrj.swpt.inter;

import com.ccrj.swpt.model.AjaxCopy;
import com.ccrj.swpt.model.AjaxCopyExample;
import java.util.List;

public interface AjaxCopyMapper {
    int countByExample(AjaxCopyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AjaxCopy record);

    int insertSelective(AjaxCopy record);

    List<AjaxCopy> selectByExample(AjaxCopyExample example);

    AjaxCopy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AjaxCopy record);

    int updateByPrimaryKey(AjaxCopy record);
}