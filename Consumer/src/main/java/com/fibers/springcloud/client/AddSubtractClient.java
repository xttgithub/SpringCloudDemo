package com.fibers.springcloud.client;

import com.fibers.springcloud.service.IServiceAddSubtract;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by fibers on 2017/6/27.
 */
@FeignClient("service-add-subtract")
public interface AddSubtractClient extends IServiceAddSubtract{
}
