package com.hc.lease.postlending.service.api;

import com.hc.lease.common.core.exception.GMException;
import com.hc.lease.postlending.model.LeaseAllinpaySplitConnect;
import com.hc.lease.common.core.dao.BaseService;
import com.hc.lease.postlending.vo.FindSplitCheckMapVo;

import java.util.List;
import java.util.Map;

/**
* 通联支付（协议支付、代扣），已经超额的还款计划明细则被记录Service
* @author Tong
* @version 2018-06-25
*/

public interface LeaseAllinpaySplitConnectService extends BaseService<LeaseAllinpaySplitConnect> {

    /**
     * 查询拆分的的明细全部扣款成功的数据
     *
     * @param paramsMap
     * @return
     */
    List<FindSplitCheckMapVo> findSplitCheck(Map<String, Object> paramsMap);

    /**
     * 合同修改同时修改 拆单的还款计划主键id,
     *
     * @return
     */
    int updateRepaymentId(Map<String, Object> paramsMap) throws GMException;

}
