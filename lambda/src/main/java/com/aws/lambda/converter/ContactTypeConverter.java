package com.aws.lambda.converter;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;
import com.aws.lambda.enums.ContactType;

public class ContactTypeConverter implements DynamoDBTypeConverter<String, ContactType> {
    @Override
    public String convert(ContactType object) {
        return object.name();
    }

    @Override
    public ContactType unconvert(String object) {
        return ContactType.valueOf(object);
    }
}
