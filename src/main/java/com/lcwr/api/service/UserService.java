package com.lcwr.api.service;

import com.lcwr.api.model.PostOfficeResponse;

public interface UserService {

    public PostOfficeResponse FetchPostOfficeDetailsByCity(String city);
}

