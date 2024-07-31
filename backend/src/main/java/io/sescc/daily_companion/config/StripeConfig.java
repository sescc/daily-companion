package io.sescc.daily_companion.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.nio.file.Paths;

import static spark.Spark.post;
import static spark.Spark.port;
import static spark.Spark.staticFiles;

import com.stripe.Stripe;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;

import io.sescc.daily_companion.util.Util;

@Configuration
public class StripeConfig {

    @Value("${stripe.test.key}")
    private String stripeKey;

    // staticFiles.externalLocation(
    //     Paths.get("public").toAbsolutePath().toString());

    // post("/create-checkout-session", (request, response) -> {
    //     String TEST_DOMAIN = "http://localhost:4242";
    //     SessionCreateParams params =
    //       SessionCreateParams.builder()
    //         .setMode(SessionCreateParams.Mode.PAYMENT)
    //         .setSuccessUrl(Util.DC_DOMAIN + "/success.html")
    //         .setCancelUrl(Util.DC_DOMAIN + "/cancel.html")
    //         .addLineItem(
    //           SessionCreateParams.LineItem.builder()
    //             .setQuantity(1L)
    //             // Provide the exact Price ID (for example, pr_1234) of the product
    //             .setPrice("{{PRICE_ID}}")
    //             .build())
    //         .build();
    //   Session session = Session.create(params);

    //   response.redirect(session.getUrl(), 303);
    //   return "";
    // });
    
}
