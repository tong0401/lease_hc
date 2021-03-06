package com.hc.lease.baseInfo.dao;

import com.hc.lease.baseInfo.model.LeaseCarColor;
import com.hc.lease.common.core.dao.BaseDao;
import com.hc.lease.common.core.exception.GMException;

import java.util.List;
import java.util.Map;

/**
 * 车辆颜色
 */
public interface LeaseCarColorMapper extends BaseDao<LeaseCarColor> {

    /**
     * 初始化编辑页面的参数
     *
     * @return
     */
    List<LeaseCarColor> insertViewParames(Map<String, Object> paramsMap) throws GMException;

    /**
     * 根据名称检测数据是否存在
     *
     * @return
     */
    List<LeaseCarColor> findByName(Map params) throws GMException;

    int disableByPrimaryKey(Map<String, Object> params)throws GMException;

    /**
     * 导出车辆录入模板需要的数据
     *
     * @return
     */
    List<String> findExportExcelModel(Map params) throws GMException;

    void updateSort(Map<String, Object> paramsMap);

    Integer findMaxNumber();
}