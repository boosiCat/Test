package com.clg.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class UserStatis implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private String id;

    /**
     * 赠送余额
     */
    private BigDecimal nRewardAmt;

    /**
     * 充值余额
     */
    private BigDecimal nRechargeAmt;

    /**
     * 充值成功次数
     */
    private Integer nRechargeCnt;

    /**
     * 消费的赠送金额
     */
    private BigDecimal nConsumeRewardAmt;

    /**
     * 消费的充值金额
     */
    private BigDecimal nConsumeRechargeAmt;

    /**
     * 信用查询次数
     */
    private Integer nCreditQueryCnt;

    /**
     * 邀请好友数量
     */
    private Integer nInviteCnt;

    /**
     * 邀请好友赠送金额
     */
    private BigDecimal nInviteRewardAmt;

    /**
     * 奖励总金额（合伙人收益+推广奖励收益）
     */
    private BigDecimal nGeneralizeAmt;

    /**
     * 推广奖励余额
     */
    private BigDecimal nGeneralizeBalance;

    /**
     * 推广人数
     */
    private Integer nGeneralizePerCnt;

    /**
     * 推广次数
     */
    private Integer nGeneralizeCnt;

    /**
     * 消费的推广金额
     */
    private BigDecimal nConsumeGeneralizeAmt;

    /**
     * 推广奖励给上级邀请人的金额
     */
    private BigDecimal cSecondSpeadAmt;

    /**
     * 合伙人收益
     */
    private BigDecimal nPartnerSpreadReward;

    /**
     * 提现金额
     */
    private BigDecimal dWithdrawAmt;

    public UserStatis() {
    }

    public UserStatis(String id) {
        this.id = id;
    }
}