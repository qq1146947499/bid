/*
package java.com.bid.springcloud.service;

import com.bid.springcloud.base.ResponseBase;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@author zhoucong
@date ${date}-${time}




import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.CoOrderMain;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@FeignClient(value = "MICROSERVICECLOUD-PAY")
public interface PayServiceClient {


    // 使用订单id查找
    @PostMapping("/pay/findPayToken")
    ResponseBase findPayToken (@RequestParam("ordermainId") String  ordermainId);

}
*/
