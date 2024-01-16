package com.aws.lambda.data;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import com.aws.lambda.enums.ContactType;
import com.aws.lambda.converter.ContactTypeConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
public class Contact {
    @DynamoDBTypeConverted(converter = ContactTypeConverter.class)
    private ContactType contactType;
    private String contactAddress;
    private Boolean active;
}
