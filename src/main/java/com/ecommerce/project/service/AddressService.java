package com.ecommerce.project.service;

import java.util.List;

import com.ecommerce.project.model.User;
import com.ecommerce.project.payload.AddressDTO;

public interface AddressService {
    AddressDTO createAddress(AddressDTO address,User user);
    List<AddressDTO> getAddresses();
     AddressDTO getAddressById(Long addressId);
    List<AddressDTO> getUserAddresses(User user);
    AddressDTO UpdateAddresses(Long addressId, AddressDTO addressDTO);
    String  deleteAddress(Long addressId);
    
}
