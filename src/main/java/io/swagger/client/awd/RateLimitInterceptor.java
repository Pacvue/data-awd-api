package io.swagger.client.awd;

import com.amazon.SellingPartnerAPIAA.RateLimitConfiguration;
import com.google.common.util.concurrent.RateLimiter;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

class RateLimitInterceptor implements Interceptor {
    RateLimiter rateLimiter;
    RateLimitConfiguration rateLimitConfiguration;

    public RateLimitInterceptor(RateLimiter rateLimiter, RateLimitConfiguration rateLimitConfiguration) {
        this.rateLimiter = rateLimiter;
        this.rateLimitConfiguration = rateLimitConfiguration;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        if (this.rateLimitConfiguration.getTimeOut() == Long.MAX_VALUE) {
            this.rateLimiter.acquire();
        } else {
            try {
                if (!this.rateLimiter.tryAcquire(this.rateLimitConfiguration.getTimeOut(), TimeUnit.MILLISECONDS)) {
                    throw new ApiException("Throttled as per the ratelimiter on client");
                }
            } catch (ApiException var3) {
                var3.printStackTrace();
            }
        }

        return chain.proceed(chain.request());
    }
}
