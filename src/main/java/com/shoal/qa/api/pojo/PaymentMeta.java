package com.shoal.qa.api.pojo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(toBuilder = true)
public class PaymentMeta {

    @JsonProperty("by_order_of")
    private String byOrderOf;
    @JsonProperty("payee")
    private String payee;
    @JsonProperty("payer")
    private String payer;
    @JsonProperty("payment_method")
    private String paymentMethod;
    @JsonProperty("payment_processor")
    private String paymentProcessor;
    @JsonProperty("ppd_id")
    private String ppdId;
    @JsonProperty("reason")
    private String reason;
    @JsonProperty("reference_number")
    private String referenceNumber;

}
