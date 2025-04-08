package com.dao;

import com.entity.KaokeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KaokeView;

/**
 * 考核 Dao 接口
 *
 * @author 
 */
public interface KaokeDao extends BaseMapper<KaokeEntity> {

   List<KaokeView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
