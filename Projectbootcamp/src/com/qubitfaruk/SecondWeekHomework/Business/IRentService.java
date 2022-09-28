package com.qubitfaruk.SecondWeekHomework.Business;

import com.qubitfaruk.SecondWeekHomework.Entities.Concrete.Customer;
import com.qubitfaruk.SecondWeekHomework.Entities.Concrete.Hatchback;
import com.qubitfaruk.SecondWeekHomework.Entities.Concrete.Sedan;
import com.qubitfaruk.SecondWeekHomework.Entities.Concrete.Suv;

public interface IRentService {
    void dailyRent(Customer customer, Suv suv);
    void getList(Customer customer);
    void dailyRent(Customer customer, Hatchback hatchback);
    void dailyRent(Customer customer, Sedan sedan);
    void monthlyRent(Customer customer, Hatchback hatchback);
    void monthlyRent(Customer customer, Sedan sedan);
    void monthlyRent(Customer customer, Suv suv);
}
