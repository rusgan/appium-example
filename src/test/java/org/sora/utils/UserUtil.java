package org.sora.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import org.sora.dataproviders.User;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static org.sora.utils.Crypto.getSecureRandom;
import static org.sora.utils.DidUtil.generateUserDDO;
import static org.sora.utils.MnemonicUtil.*;

public class UserUtil {

    public static User initRandomUser(){

        Faker faker = new Faker();
        User user = new User();

        user.setFirstName(faker.name().firstName())
                .setLastName(faker.name().lastName())
                .setPhone(faker.phoneNumber().cellPhone())
                .setCountry(faker.address().country())
                .setPassphrase(generateMnemonic(getSecureRandom(20)));
        generateUserDDO(user);
        return user;
    }
}