package com.lakshmi.metro.service;
import com.lakshmi.metro.model.User;
import com.lakshmi.metro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckInOutService {

    @Autowired
    private UserRepository userRepository;

    public String checkIn(String userId, String qrCode) {
        // Validate QR code or metro card
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        if (!user.getQrCode().equals(qrCode)) {
            throw new RuntimeException("Invalid QR code");
        }
        // Save check-in time
        user.setCheckInTime(System.currentTimeMillis());
        userRepository.save(user);
        return "Check-in successful";
    }

    public String checkOut(String userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        long checkInTime = user.getCheckInTime();
        long checkOutTime = System.currentTimeMillis();
        // Calculate fare based on time and distance
        double fare = calculateFare(checkInTime, checkOutTime);
        // Send fare to Payment Service (mock)
        sendFareToPaymentService(fare);
        return "Check-out successful. Fare: " + fare;
    }

    private double calculateFare(long checkInTime, long checkOutTime) {
        // Dummy fare calculation logic
        return 10.0;
    }

    private void sendFareToPaymentService(double fare) {
        // Mock payment service call
        System.out.println("Sending fare to Payment Service: " + fare);
    }
}
