package com.bid.springcloud.DTD;/*
@author zhoucong
@date ${date}-${time}

*/

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * co_order_dmand
 * cp_college_info
 * co_order_process
 * co_order_main
 *
 */
@Data
public class OrderDTD{



    private String processId;

    private String orderMainId;

    /**
     * 1
     */
    private String orderBidType;

    private String sourceCollegeId;

    private String processName;

    private Date processTime;

    private String auditResult;

    private String remark;






    private String orderCode;

    @NotBlank(message="申购主题不能为空")
    private String orderTitle;

    private String deviceType;

    private String foundsSubject;

    private String foundsCode;

    /**
     * ʹ
     */
    private String usingCorrency;

    private String isDeliver;




    @DateTimeFormat(pattern="yyyy-MM-dd")
    private String deliverTime;


    private String isTax;

    private String isInvoice;

    private String deliverPlace;

    private String isImplemented;

    private String budget;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String adviceExpiredTime;

    /**
     * 1:
     */
    private String orderType;

    /**
     * 1
     */

    private String currentProcee;

    /**
     * 1
     */

    private String orderStatus;

    /**
     * Y:
     */
    private String isAdvanceEndbid;

    private String collegeId;

    private String collegeName;

    private String departmentId;

    private String orderUnit;

    private String orderPerson;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String orderTime;

    private String personPhone;


    private String itemNum;

    private String orderTotalAmount;

    private String readCount;

    private String bidCount;


    private String orderProcess;


    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date startBidtime;


    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endBidtime;

    private String auditSuggestion;

    private String auditUserid;

    private String auditUsername;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date auditTime;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastEndBidtime;

    private String isExtend;

    private String extendBidReason;

    private String extendUserid;

    private String extendUsername;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String chooseTime;

    private String chooseOption;

    private String chooseReason;

    private String chooseUserId;

    private String chooseUserName;

    /**
     * һ
     */

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date firstTime;

    /**
     * Y
     */
    private String firstAudit;

    private String firstAuditReason;

    /**
     * һ
     */
    private String firstAuditUserId;

    /**
     * һ
     */
    private String firstAuditUserName;

    /**
     * Y
     */
    private String secondAudit;

    private String secondAuditReason;

    private String secondAuditUserId;

    private String secondAuditUserName;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String secondTime;

    private String bidAmount;

    private String bidAmountRenminbi;

    /**
     * Y
     */
    private String isPublishBidresult;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date publishBidresultTime;

    private String publishBidresultUserid;

    private String publishBidresultUsername;

    /**
     * Y
     */
    private String bidFinished;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date stopBidTime;

    private String stopBidReason;

    private String stopBidUserid;

    private String stopBidUsername;




    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String createUserid;

    private String createUsername;

    /**
     * Y:
     */
    private String isDxCenter;

    /**
     * Y:
     */
    private String isDxCollege;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastUpdateTime;

    private String lastUpdateUserid;

    private String lastUpdateUsername;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reAuditTime;

    private String reAuditUserid;

    private String reAuditUsername;

    private String reAuditReason;

    /**
     * Y:
     */
    private String isReaudit;

    /**
     * ȷ
     */
    private String confNum;

    private String agentUserId;

    private String agentUserName;

    private String agentRealName;


    private String payType;

    private String invoiceType;

    private String deliverType;

    private String transportType;

    private String installationgSite;


    private String packLevel;

    private String accpetanceLevel;

    private String isFinanceAudit;

    private String financeAuditUserId;

    private String financeAuditUserName;

    private String financeAuditReason;

    private String isAutoSubmit;

    private String pauseReason;

    private String winningPrinciple;

    private String collegeCode;

;

    private String logoPath;

    private String inProvince;

    private String inCity;

    private String auditCompany;

    /**
     * Y:
     */
    private String isRedution;



    /**
     * Y:
     */

    private Integer sortNum8;


    private String dmainId;









    private Integer deviceId;

    private Integer orderNum;


    private String unit;

    private String inquirePrice;

    private String priceCompany;

    private String isStandard;

    private String afterService;

    /**
     * 1
     */
    private String status3;

    private String initBidId;

    private String bidId;

    /**
     * Y
     */
    private String isCheapest;

    private String initTime;

    private String initUserId;

    private String initUsername;

    private String userInitReason;

    private String closeReason;

    private String companyId;

    private String companyName;

    private String bidPrice;







    private String deliverUserid;

    private String deliverUsername;

    private String deliverRemark;

    private Date receiveTime;

    private String receiveUserid;

    private String receiveRemark;

    private String receiveUsername;

    private Date acceptionTime;

    private String acceptionUserid;

    private String acceptionUsername;

    private String acceptionRemark;

    private Date registerTime;

    private String registerUserid;

    private String registerUsername;

    private String registerRemark;

    /**
     * Y
     */
    private String buyerIsAssessed;

    /**
     * Y
     */
    private String sellerIsAssessed;







    private String diffrencesDesc;


}
