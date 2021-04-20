package cn.ekgc.addrbook.transport;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * <b>用户功能传输层接口</b>
 */
@FeignClient(name = "addrbook-providers")
@RequestMapping("/user/trans")
public interface UserTransport {
}
