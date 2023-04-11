package com.contacts.MyContactList.service;

import com.contacts.MyContactList.entity.CombinedData;

public interface SavingDataService {

    public void saveData(CombinedData data);

    public void editData(CombinedData data, int pId);
}
