package com.clg.config.interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

/**
 * @Author cailiugen
 * @Date 2019/4/30
 */
@Configuration
public class InterceptorAdapterAdd extends WebMvcConfigurerAdapter {

    @Autowired
    private TestHandlerInterceptor testHandlerInterceptor;

    @Autowired
    private InitHandlerInterceptor initHandlerInterceptor;

    @Autowired
    private LocaleChangeInterceptor localeChangeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(testHandlerInterceptor).addPathPatterns("/test/**");
        registry.addInterceptor(initHandlerInterceptor).addPathPatterns("/**").excludePathPatterns("/other/**");
        registry.addInterceptor(localeChangeInterceptor);

    }

    /**
     * <value>/plan/addPlanNotify</value>
     * <value>/user/init</value>
     * <value>/user/login</value>
     * <value>/user/resetLoginPwd</value>
     * <value>/user/checkTelephoneIsRegister</value>
     * <value>/user/getVoiceCodeToRegister</value>
     * <value>/user/getVoiceCodeToRegister4App</value>
     * <value>/user/getTelCodeToRegister</value>
     * <value>/user/getTelCodeToRegister4App</value>
     * <value>/user/register</value>
     * <value>/user/register4App</value>
     * <value>/user/reRegister</value>
     * <value>/user/reRegister4App</value>
     * <value>/user/uploadAccessPage</value>
     * <value>/user/noviceGuide2NextStep</value>
     * <value>/bid/getBid</value>
     * <value>/iou/getPDF</value>
     * <value>/iou/getPreIOU</value>
     * <value>/iouRepair/user</value>
     * <value>/pay/getOrderId</value>
     * <value>/pay/creditNotify</value>
     * <value>/pay/skipMobileAuth</value>
     * <value>/pay/payNotify</value>
     * <value>/pay/reconciliation</value>
     * <value>/my/getSystemInfo</value>
     * <value>/my/getUnregistVisibleBid</value>
     * <value>/my/getUnregistVisibleProduct</value>
     * <value>/prod/getHomePage</value>
     * <value>/prod/getProduct</value>
     * <value>/prod/getUserHead</value>
     * <value>/wx/initMenu</value>
     * <value>/wx/service</value>
     * <value>/wx/signURL</value>
     * <value>/wx/postSignURL</value>
     * <value>/wx/long2short</value>
     * <value>/wx/addErrorLog</value>
     * <value>/wx/getMsgToSend</value>
     * <value>/wx/updateMsg</value>
     * <value>/protocol/getJuBaoXinTemplate</value>
     * <value>/protocol/getMinShiQiSuTemplate</value>
     * <value>/protocol/getSuSongTemplate</value>
     * <value>/protocol/getZhongCaiTemplate</value>
     * <value>/protocol/getZhongCaiShenQingTemplate</value>
     * <value>/protocol/getTransferEvidence</value>
     * <value>/task_abcdefg/test</value>
     * <value>/task_abcdefg/processPay</value>
     * <value>/task_abcdefg/getWechatToken</value>
     * <value>/task_abcdefg/endLoan</value>
     * <value>/task_abcdefg/pushMsg</value>
     * <value>/task_abcdefg/updateCapital</value>
     * <value>/task_abcdefg/addReconciliationVo</value>
     * <value>/task_abcdefg/reconciliation</value>
     * <value>/task_abcdefg/reconciliationByData</value>
     * <value>/task_abcdefg/reconciliationPayEco</value>
     * <value>/task_abcdefg/repayServiceFee</value>
     * <value>/task_abcdefg/updateSpecialOverdueFee</value>
     * <value>/task_abcdefg/addSendCashPay</value>
     * <value>/task_abcdefg/pushZhimaCreditData</value>
     * <value>/task_abcdefg/resetSunLenderRecommendCnt</value>
     * <value>/task_abcdefg/processEcoPayment</value>
     * <value>/ecloudSign/addTemplate</value>
     * <value>/app/getNewestVersion</value>
     * <value>/otherPlatform/getAllPlatforms</value>
     * <value>/task_abcdefg/calculateApiSuccessRate</value>
     * <value>/task_abcdefg/getMobileAuthWayStatus</value>
     * <value>/market/flowUserVisit</value>
     * <value>/market/flowUserGetSMSCode</value>
     * <value>/market/flowUserSubmit</value>
     * <value>/market/channelLogin</value>
     * <value>/market/getChannelData</value>
     * <value>/otherPlatform/getAllPlatforms</value>
     * <value>/prod/getProdPage</value>
     * <value>/bid/getBidPage</value>
     * <value>/faceId/verifyReturn</value>
     * <value>/faceId/verifyNotify</value>
     */


}
