package cn.ekgc.addrbook.transport;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "addrbook-provider")
@RequestMapping("/user/trans")
public interface UserTransport {
}
