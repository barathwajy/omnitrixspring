package com.example.omnitrix.subscribe;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="subscriber_data")
public class Subscribedata {
	
    @Column(name = "dateofjoining") 
	String DateofJoining;
	
	@Id
    @Column(name = "customerid") 
	String CustomerID;
	
    @Column(name = "tenureinmonths") 
	Integer TenureinMonths;
    
    @Column(name = "offer")
	String Offer;
    
    @Column(name = "phoneservice")
	String PhoneService;
    
    @Column(name = "multiplelines")
	String MultipleLines;
    
    @Column(name = "internetservice")
	String InternetService;
    
    @Column(name = "internettype")
	String InternetType;
    
    @Column(name = "onlinesecurity")
	String OnlineSecurity;
    
    @Column(name = "onlinebackup")
	String OnlineBackup;
    
    @Column(name = "deviceprotectionplan")
	String DeviceProtectionPlan;
    
    @Column(name = "premiumtechsupport")
	String PremiumTechSupport;
    
    @Column(name = "streamingtv")
	String StreamingTV;
    
    @Column(name = "streamingmovies")
	String StreamingMovies;
    
    @Column(name = "streamingmusic")
	String StreamingMusic;
    
    @Column(name = "unlimiteddata")
	String UnlimitedData;
    
    @Column(name = "contract")
	String Contract;
    
    @Column(name = "monthlycharge")
	Double MonthlyCharge;
    
    @Column(name = "totalcharges")
	Double TotalCharges;
    
    @Column(name = "totalrefunds")
	Double TotalRefunds;
    
    @Column(name = "totalextradatacharges")
	Double TotalExtraDataCharges;
    
    @Column(name = "totallongdistancecharges")
	Double TotalLongDistanceCharges;
    
    @Column(name = "totalrevenue")
	Double TotalRevenue;
    
    @Column(name = "customerstatus")
	String CustomerStatus;
    
    @Column(name = "churncategory",columnDefinition="TEXT")
	String ChurnCategory;
    
    @Column(name = "churnreason")
	String ChurnReason;
	
    
	// Getters And Setters
	public String getDateofJoining() {
		return DateofJoining;
	}
	public void setDateofJoining(String dateofJoining) {
		DateofJoining = dateofJoining;
	}
	public String getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	public Integer getTenureinMonths() {
		return TenureinMonths;
	}
	public void setTenureinMonths(Integer tenureinMonths) {
		TenureinMonths = tenureinMonths;
	}
	public String getOffer() {
		return Offer;
	}
	public void setOffer(String offer) {
		Offer = offer;
	}
	public String getPhoneService() {
		return PhoneService;
	}
	public void setPhoneService(String phoneService) {
		PhoneService = phoneService;
	}
	public String getMultipleLines() {
		return MultipleLines;
	}
	public void setMultipleLines(String multipleLines) {
		MultipleLines = multipleLines;
	}
	public String getInternetService() {
		return InternetService;
	}
	public void setInternetService(String internetService) {
		InternetService = internetService;
	}
	public String getInternetType() {
		return InternetType;
	}
	public void setInternetType(String internetType) {
		InternetType = internetType;
	}
	public String getOnlineSecurity() {
		return OnlineSecurity;
	}
	public void setOnlineSecurity(String onlineSecurity) {
		OnlineSecurity = onlineSecurity;
	}
	public String getOnlineBackup() {
		return OnlineBackup;
	}
	public void setOnlineBackup(String onlineBackup) {
		OnlineBackup = onlineBackup;
	}
	public String getDeviceProtectionPlan() {
		return DeviceProtectionPlan;
	}
	public void setDeviceProtectionPlan(String deviceProtectionPlan) {
		DeviceProtectionPlan = deviceProtectionPlan;
	}
	public String getPremiumTechSupport() {
		return PremiumTechSupport;
	}
	public void setPremiumTechSupport(String premiumTechSupport) {
		PremiumTechSupport = premiumTechSupport;
	}
	public String getStreamingTV() {
		return StreamingTV;
	}
	public void setStreamingTV(String streamingTV) {
		StreamingTV = streamingTV;
	}
	public String getStreamingMovies() {
		return StreamingMovies;
	}
	public void setStreamingMovies(String streamingMovies) {
		StreamingMovies = streamingMovies;
	}
	public String getStreamingMusic() {
		return StreamingMusic;
	}
	public void setStreamingMusic(String streamingMusic) {
		StreamingMusic = streamingMusic;
	}
	public String getUnlimitedData() {
		return UnlimitedData;
	}
	public void setUnlimitedData(String unlimitedData) {
		UnlimitedData = unlimitedData;
	}
	public String getContract() {
		return Contract;
	}
	public void setContract(String contract) {
		Contract = contract;
	}
	public Double getMonthlyCharge() {
		return MonthlyCharge;
	}
	public void setMonthlyCharge(Double monthlyCharge) {
		MonthlyCharge = monthlyCharge;
	}
	public Double getTotalCharges() {
		return TotalCharges;
	}
	public void setTotalCharges(Double totalCharges) {
		TotalCharges = totalCharges;
	}
	public Double getTotalRefunds() {
		return TotalRefunds;
	}
	public void setTotalRefunds(Double totalRefunds) {
		TotalRefunds = totalRefunds;
	}
	public Double getTotalExtraDataCharges() {
		return TotalExtraDataCharges;
	}
	public void setTotalExtraDataCharges(Double totalExtraDataCharges) {
		TotalExtraDataCharges = totalExtraDataCharges;
	}
	public Double getTotalLongDistanceCharges() {
		return TotalLongDistanceCharges;
	}
	public void setTotalLongDistanceCharges(Double totalLongDistanceCharges) {
		TotalLongDistanceCharges = totalLongDistanceCharges;
	}
	public Double getTotalRevenue() {
		return TotalRevenue;
	}
	public void setTotalRevenue(Double totalRevenue) {
		TotalRevenue = totalRevenue;
	}
	public String getCustomerStatus() {
		return CustomerStatus;
	}
	public void setCustomerStatus(String customerStatus) {
		CustomerStatus = customerStatus;
	}
	public String getChurnCategory() {
		return ChurnCategory;
	}
	public void setChurnCategory(String churnCategory) {
		ChurnCategory = churnCategory;
	}
	public String getChurnReason() {
		return ChurnReason;
	}
	public void setChurnReason(String churnReason) {
		ChurnReason = churnReason;
	}
	// Getters And Setters
	public Subscribedata(String dateofJoining, String customerID, Integer tenureinMonths, String offer,
			String phoneService, String multipleLines, String internetService, String internetType,
			String onlineSecurity, String onlineBackup, String deviceProtectionPlan, String premiumTechSupport,
			String streamingTV, String streamingMovies, String streamingMusic, String unlimitedData, String contract,
			Double monthlyCharge, Double totalCharges, Double totalRefunds, Double totalExtraDataCharges,
			Double totalLongDistanceCharges, Double totalRevenue, String customerStatus, String churnCategory,
			String churnReason) {
		super();
		DateofJoining = dateofJoining;
		
		CustomerID = customerID;
		TenureinMonths = tenureinMonths;
		Offer = offer;
		PhoneService = phoneService;
		MultipleLines = multipleLines;
		InternetService = internetService;
		InternetType = internetType;
		OnlineSecurity = onlineSecurity;
		OnlineBackup = onlineBackup;
		DeviceProtectionPlan = deviceProtectionPlan;
		PremiumTechSupport = premiumTechSupport;
		StreamingTV = streamingTV;
		StreamingMovies = streamingMovies;
		StreamingMusic = streamingMusic;
		UnlimitedData = unlimitedData;
		Contract = contract;
		MonthlyCharge = monthlyCharge;
		TotalCharges = totalCharges;
		TotalRefunds = totalRefunds;
		TotalExtraDataCharges = totalExtraDataCharges;
		TotalLongDistanceCharges = totalLongDistanceCharges;
		TotalRevenue = totalRevenue;
		CustomerStatus = customerStatus;
		ChurnCategory = churnCategory;
		ChurnReason = churnReason;
	}
	public Subscribedata() {
		super();
	}
	
	
	
	
	
	
	
	
	
}
