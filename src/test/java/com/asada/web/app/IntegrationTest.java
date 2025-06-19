package com.asada.web.app;

import com.asada.web.app.config.AsyncSyncConfiguration;
import com.asada.web.app.config.EmbeddedRedis;
import com.asada.web.app.config.EmbeddedSQL;
import com.asada.web.app.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { AsadawebappApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedSQL
public @interface IntegrationTest {
}
