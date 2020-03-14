package schema.mapper;


import org.apache.ibatis.annotations.Param;
import schema.entity.VideoInfo;

import java.util.List;

/**
 * (VideoInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-14 02:14:05
 */
public interface VideoInfoDao{

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    VideoInfo queryById(Integer id);
    
    /**
    * 查询所有实体数据
    * @return 对象列表
    */
    List<VideoInfo> queryList();

    /**
     * 通过实体作为筛选条件查询
     *
     * @param videoInfo 实例对象
     * @return 对象列表
     */
    List<VideoInfo> queryAll(VideoInfo videoInfo);

    /**
     * 新增数据
     *
     * @param videoInfo 实例对象
     * @return 影响行数
     */
    int insertOne(VideoInfo videoInfo);

    /**
     * 修改数据
     *
     * @param videoInfo 实例对象
     * @return 影响行数
     */
    int update(VideoInfo videoInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
    
    /**
     * 批量插入数据
     *
     * @param videoInfoList 数据列表
     * @return 影响行数
     */ 
    int batchInsert(@Param("videoInfoList") List<VideoInfo> videoInfoList);
    
    /**
     * 根据主键列表批量查询数据
     *
     * @param videoInfoIdList 主键列表
     * @return 查询结果List
     */ 
    List<VideoInfo> batchQueryByIdList(@Param("videoInfoIdList") List<Integer> videoInfoIdList);
    
    /**
     * 根据主键列表批量删除数据
     *
     * @param videoInfoIdList 主键列表
     * @return 影响行数
     */ 
    int batchDeleteByIdList(@Param("videoInfoIdList") List<Integer> videoInfoIdList);
}