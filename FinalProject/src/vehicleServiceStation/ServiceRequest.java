package vehicleServiceStation;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class ServiceRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    private Date requestDate;
    private List<Service> serviceList;
    private String customerName;
    // private double lastBalance;
    private String vehicleNumber;

    public ServiceRequest() {

        this.serviceList = new ArrayList<>();
    }

    public ServiceRequest(Date requestDate, String customerName, String vehicleNumber) {
        this.requestDate = requestDate;
        this.serviceList = new ArrayList<>(); // Initialize the list here
        this.customerName = customerName;
        this.vehicleNumber = vehicleNumber;

    }

    public Date getRequestDate() {
        return requestDate;
    }

    public List<Service> getServiceList() {
        return serviceList;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void newService(Service service) {
        serviceList.add(service);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ServiceRequest other = (ServiceRequest) obj;
        if (customerName == null) {
            if (other.customerName != null)
                return false;
        } else if (!customerName.equals(other.customerName))
            return false;
        if (serviceList == null) {
            if (other.serviceList != null)
                return false;
        } else if (!serviceList.equals(other.serviceList))
            return false;
        if (vehicleNumber == null) {
            if (other.vehicleNumber != null)
                return false;
        } else if (!vehicleNumber.equals(other.vehicleNumber))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((customerName == null) ? 0 : customerName.hashCode());
        result = prime * result
                + ((serviceList == null) ? 0 : serviceList.hashCode());
        result = prime * result
                + ((vehicleNumber == null) ? 0 : vehicleNumber.hashCode());
        return result;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setServiceList(LinkedList<Service> serviceList) {
        this.serviceList = serviceList;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "ServiceRequest{" +
                "requestDate=" + sdf.format(requestDate) +
                ", serviceList=" + serviceList +
                ", customerName='" + customerName + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                '}';
    }
}
