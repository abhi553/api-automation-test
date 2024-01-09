
package com.shoal.qa.api.pojo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Getter
@Setter
@Jacksonized
@Builder(toBuilder = true)
public class Transaction {

    @JsonProperty("transaction_id")
    private String transactionId;
    @JsonProperty("account_id")
    private String accountId;
    @JsonProperty("account_owner")
    private String accountOwner;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("iso_currency_code")
    private String isoCurrencyCode;
    @JsonProperty("unofficial_currency_code")
    private String unofficialCurrencyCode;
    @JsonProperty("category")
    private String category;
    @JsonProperty("category_id")
    private String categoryId;
    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("name")
    private String name;
    @JsonProperty("merchant_name")
    private String merchantName;
    @JsonProperty("merchant_entity_id")
    private String merchantEntityId;
    @JsonProperty("logo_url")
    private String logoUrl;
    @JsonProperty("website")
    private String website;
    @JsonProperty("payment_meta")
    private PaymentMeta paymentMeta;
    @JsonProperty("payment_channel")
    private String paymentChannel;
    @JsonProperty("pending")
    private Boolean pending;
    @JsonProperty("pending_transaction_id")
    private String pendingTransactionId;
    @JsonProperty("transaction_code")
    private String transactionCode;
    @JsonProperty("transaction_type")
    private String transactionType;
    @JsonProperty("transaction_status")
    private String transactionStatus;

}
