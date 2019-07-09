package com.imtf.poc.profile.impl;

import com.imtf.poc.core.api.CustomExtender;
import org.osgi.service.component.annotations.Component;

@Component
public class SimpleExtender implements CustomExtender {

    @Override
    public void extend() {
        // fake one
    }

}
