package cn.idas_ouc.member.dao;

import cn.idas_ouc.member.entity.MenuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 菜单表
 * 
 * @author wuboxin
 * @email wuboxin98@outlook.com
 * @date 2023-09-04 22:28:16
 */
@Mapper
public interface MenuDao extends BaseMapper<MenuEntity> {

    List<MenuEntity> findListByUserId(@Param("userId") Long userId);
}
