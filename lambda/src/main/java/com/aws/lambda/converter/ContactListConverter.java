package com.aws.lambda.converter;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;
import com.aws.lambda.data.Contact;
//import com.aws.lambda.enums.ContactType;
//import java.util.ArrayList;
import java.util.List;

public class ContactListConverter implements DynamoDBTypeConverter<List<Contact>, List<Contact>> {

    @Override
    public List<Contact> convert(List<Contact> contacts) {
        return contacts.stream().map(contact -> {
            contact.setContactType(contact.getContactType());
            return contact;
        }).toList();
    }

    @Override
    public List<Contact> unconvert(List<Contact> contacts) {
        return contacts.stream().map(contact -> {
            contact.setContactType(contact.getContactType());
            return contact;
        }).toList();
    }
}
