-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Sep 10, 2017 at 11:18 PM
-- Server version: 10.1.22-MariaDB
-- PHP Version: 7.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hmdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `dept_ID` int(50) NOT NULL,
  `dept_Name` varchar(500) DEFAULT NULL,
  `dept_Description` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`dept_ID`, `dept_Name`, `dept_Description`) VALUES
(1, 'Cardiology', 'Specializes in Cardiac operations'),
(2, 'Neurology', 'They take care of your brain problems.'),
(3, 'Dermatology', 'Diagnosis and treatment of skin disorders.'),
(4, 'Diabetic', 'Diagnosis Medication and Consultation to diabetic patients.'),
(5, 'Urology', 'kkdnknsff');

-- --------------------------------------------------------

--
-- Table structure for table `diagnosticsandtests`
--

CREATE TABLE `diagnosticsandtests` (
  `Service_ID` int(10) NOT NULL,
  `Service_Name` varchar(50) NOT NULL,
  `Service_Cost` varchar(10) NOT NULL,
  `Service_Description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `diagnosticsandtests`
--

INSERT INTO `diagnosticsandtests` (`Service_ID`, `Service_Name`, `Service_Cost`, `Service_Description`) VALUES
(1, 'Blood Test-Maleria', '300', 'Testing of Blood Samples to find out maleria virus in blood.'),
(2, 'Blood Test-Sickle Cell', '150', 'Testing of Blood Samples to find out RBC transformation to sickle cell in blood.'),
(3, 'Consultation', '350', 'General Checkup');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `doc_ID` int(50) NOT NULL,
  `doc_Name` varchar(100) NOT NULL,
  `doc_Email` varchar(100) NOT NULL,
  `doc_Contact` varchar(10) NOT NULL,
  `doc_Profile` varchar(100) NOT NULL,
  `doc_Department` varchar(100) NOT NULL,
  `doc_Address` varchar(100) NOT NULL,
  `doc_Password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`doc_ID`, `doc_Name`, `doc_Email`, `doc_Contact`, `doc_Profile`, `doc_Department`, `doc_Address`, `doc_Password`) VALUES
(1, 'Dr. Sunny Dhurwey', 'sunnydhurwey@gmail.com', '9009768099', 'Surgeon', 'Neurology', 'Raipur', '1921141425'),
(2, 'Dr. Abhishek Painkra', 'abhip@gmail.com', '8989785968', 'General Paractioner', 'Cardiology', 'Kunkuri', '1234567898'),
(3, 'Dr. Nishant Thapa', 'drnishant@gmail.com', '9009876765', 'Visiting Doctor', 'Diabetic', 'Raipur', 'Test@12345');

-- --------------------------------------------------------

--
-- Table structure for table `ipd`
--

CREATE TABLE `ipd` (
  `ipd_ID` int(50) NOT NULL,
  `ipd_OPDID` int(50) NOT NULL,
  `ipd_Name` varchar(100) NOT NULL,
  `ipd_Company` varchar(100) NOT NULL,
  `ipd_Corporate` varchar(100) NOT NULL,
  `ipd_BloodGroup` varchar(20) NOT NULL,
  `ipd_Weight` int(5) NOT NULL,
  `ipd_MaritalStatus` varchar(10) NOT NULL,
  `ipd_DOB` date NOT NULL,
  `ipd_Gender` varchar(10) NOT NULL,
  `ipd_KinsName` varchar(100) NOT NULL,
  `ipd_Address` varchar(500) NOT NULL,
  `ipd_City` varchar(20) NOT NULL,
  `ipd_Country` varchar(20) NOT NULL,
  `ipd_Pin` int(20) NOT NULL,
  `ipd_Contact` int(11) NOT NULL,
  `ipd_Email` varchar(100) NOT NULL,
  `ipd_KinContact` int(11) NOT NULL,
  `ipd_ConsultDept` int(100) NOT NULL,
  `ipd_Consultant` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `logmaster`
--

CREATE TABLE `logmaster` (
  `log_id` int(11) NOT NULL,
  `log_date` varchar(10) DEFAULT NULL,
  `log_time` varchar(20) DEFAULT NULL,
  `log_ip_address` varchar(50) DEFAULT NULL,
  `log_device_mac_id` varchar(50) DEFAULT NULL,
  `log_username` varchar(50) DEFAULT NULL,
  `log_authority` varchar(50) DEFAULT NULL,
  `log_empID` int(10) NOT NULL,
  `log_empName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `logmaster`
--

INSERT INTO `logmaster` (`log_id`, `log_date`, `log_time`, `log_ip_address`, `log_device_mac_id`, `log_username`, `log_authority`, `log_empID`, `log_empName`) VALUES
(77, '5-5-2017', '10:53:30 AM', '127.0.1.1', 'CC-AF-78-A0-24-49', 'admin', 'Administrator', 10012017, 'Sunny Dhurwey'),
(78, '5-5-2017', '11:8:10 AM', '127.0.1.1', 'CC-AF-78-A0-24-49', 'admin', 'Administrator', 10012017, 'Sunny Dhurwey'),
(79, '5-5-2017', '11:17:0 AM', '127.0.1.1', 'CC-AF-78-A0-24-49', 'admin', 'Administrator', 10012017, 'Sunny Dhurwey'),
(80, '5-5-2017', '14:5:57 PM', '127.0.1.1', 'CC-AF-78-A0-24-49', 'admin', 'Administrator', 10012017, 'Sunny Dhurwey'),
(81, '6-5-2017', '13:5:31 PM', '127.0.1.1', NULL, 'admin', 'Administrator', 10012017, 'Sunny Dhurwey'),
(82, '6-5-2017', '13:7:14 PM', '127.0.1.1', NULL, 'admin', 'Administrator', 10012017, 'Sunny Dhurwey'),
(83, '5-6-2017', '16:57:25 PM', '127.0.1.1', 'CC-AF-78-A0-24-49', 'admin', 'Administrator', 10012017, 'Sunny Dhurwey'),
(84, '13-6-2017', '22:54:52 PM', '127.0.1.1', 'CC-AF-78-A0-24-49', 'admin', 'Administrator', 10012017, 'Sunny Dhurwey'),
(85, '24-7-2017', '12:29:56 PM', '127.0.1.1', NULL, 'admin', 'Administrator', 10012017, 'Sunny Dhurwey'),
(86, '24-7-2017', '12:43:0 PM', '127.0.1.1', NULL, 'admin', 'Administrator', 10012017, 'Sunny Dhurwey');

-- --------------------------------------------------------

--
-- Table structure for table `opd`
--

CREATE TABLE `opd` (
  `opd_ID` int(50) NOT NULL,
  `opd_Name` varchar(100) NOT NULL,
  `opd_BloodGroup` varchar(20) NOT NULL,
  `opd_MaritalStatus` varchar(10) NOT NULL,
  `opd_DOB` date NOT NULL,
  `opd_Gender` varchar(10) NOT NULL,
  `opd_KinsName` varchar(100) NOT NULL,
  `opd_Address` varchar(500) NOT NULL,
  `opd_City` varchar(20) NOT NULL,
  `opd_State` varchar(20) NOT NULL,
  `opd_Pin` int(20) NOT NULL,
  `opd_Contact` bigint(11) NOT NULL,
  `opd_Email` varchar(100) NOT NULL,
  `opd_KinsContact` bigint(11) NOT NULL,
  `opd_ConsultDept` varchar(100) NOT NULL,
  `opd_Consultant` varchar(100) NOT NULL,
  `opd_RegDate` date NOT NULL,
  `opd_RegTime` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opd`
--

INSERT INTO `opd` (`opd_ID`, `opd_Name`, `opd_BloodGroup`, `opd_MaritalStatus`, `opd_DOB`, `opd_Gender`, `opd_KinsName`, `opd_Address`, `opd_City`, `opd_State`, `opd_Pin`, `opd_Contact`, `opd_Email`, `opd_KinsContact`, `opd_ConsultDept`, `opd_Consultant`, `opd_RegDate`, `opd_RegTime`) VALUES
(1, 'Anosh Gardia', 'A+', 'Married', '1989-03-06', 'Male', 'Sunny Dhurwey', 'Mowa', 'Raipur', 'CG', 492007, 9009768099, 'sunnydhurwey@gmail.com', 9009768099, 'Diabetic', 'Dr. Nishant Thapa', '2017-02-17', '12:55:27'),
(2, 'Avinash Kujur', 'O-', 'Unmarried', '2017-03-18', 'Male', 'Nobody', 'Nowhere', 'Raipur', 'CG', 492001, 0, 'pintu@gmail.com', 0, 'Cardiology', 'Dr. Abhishek Painkra', '2017-02-19', '10:59:35'),
(3, 'Tarun', 'A+', 'Unmarried', '1992-06-01', 'Male', 'Anish', 'Teachers Colony', 'Chhindwara', 'MP', 456214, 9898568782, 'tarun@gmail.com', 7895986452, 'Cardiology', 'Dr. Abhishek Painkra', '2017-05-02', '11:18:23');

-- --------------------------------------------------------

--
-- Table structure for table `opdbilling`
--

CREATE TABLE `opdbilling` (
  `sr_no` int(50) NOT NULL,
  `bill_no` int(50) NOT NULL,
  `pat_id` int(50) NOT NULL,
  `payment_type` varchar(10) NOT NULL,
  `payment_desc` varchar(150) NOT NULL,
  `overall_total` int(10) NOT NULL,
  `tax` int(10) NOT NULL,
  `grand_total` int(10) NOT NULL,
  `bill_date` date DEFAULT NULL,
  `bill_time` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opdbilling`
--

INSERT INTO `opdbilling` (`sr_no`, `bill_no`, `pat_id`, `payment_type`, `payment_desc`, `overall_total`, `tax`, `grand_total`, `bill_date`, `bill_time`) VALUES
(1, 1, 3, 'Cash', 'Payed in full', 950, 0, 950, '2017-05-05', '11:45:24');

-- --------------------------------------------------------

--
-- Table structure for table `opdbillingcontent`
--

CREATE TABLE `opdbillingcontent` (
  `opdServiceContentID` int(11) NOT NULL,
  `opdBillNumber` int(11) DEFAULT NULL,
  `opdPatID` varchar(45) DEFAULT NULL,
  `opdPatName` varchar(45) DEFAULT NULL,
  `opdServiceDescription` varchar(100) DEFAULT NULL,
  `opdServiceCost` double DEFAULT NULL,
  `opdServiceQty` double DEFAULT NULL,
  `opdServiceTotalCost` double DEFAULT NULL,
  `opdActiveLogin` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `opdbillingcontent`
--

INSERT INTO `opdbillingcontent` (`opdServiceContentID`, `opdBillNumber`, `opdPatID`, `opdPatName`, `opdServiceDescription`, `opdServiceCost`, `opdServiceQty`, `opdServiceTotalCost`, `opdActiveLogin`) VALUES
(12, 1, '2', 'Avinash Kujur', 'Blood Test-Sickle Cell', 150, 2, 300, 'Sunny Dhurwey'),
(13, 1, '2', 'Avinash Kujur', 'Consultation', 350, 1, 350, 'Sunny Dhurwey'),
(14, 1, '3', 'Tarun', 'Blood Test-Maleria', 300, 1, 300, 'Sunny Dhurwey'),
(15, 2, '3', 'Tarun', 'Blood Test-Maleria', 300, 1, 300, 'Sunny Dhurwey'),
(16, 2, '3', 'Tarun', 'Consultation', 350, 1, 350, 'Sunny Dhurwey'),
(17, 2, '1', 'Anosh Gardia', 'Blood Test-Maleria', 300, 1, 300, 'Sunny Dhurwey');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) DEFAULT NULL,
  `emp_ID` int(10) NOT NULL,
  `emp_Name` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `authority` varchar(50) DEFAULT NULL,
  `permission_status` varchar(10) DEFAULT NULL,
  `authorizedBy` varchar(50) NOT NULL,
  `authorizationDate` varchar(50) NOT NULL,
  `authorizationMAC` varchar(50) NOT NULL,
  `authorizationTime` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `emp_ID`, `emp_Name`, `username`, `password`, `authority`, `permission_status`, `authorizedBy`, `authorizationDate`, `authorizationMAC`, `authorizationTime`) VALUES
(1, 10012017, 'Sunny Dhurwey', 'admin', 'admin', 'Administrator', 'Granted', '', '', '', ''),
(2, 100002, 'Raj', 'employee', 'employee', 'Employee', 'Granted', 'Sunny Dhurwey', '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`dept_ID`);

--
-- Indexes for table `diagnosticsandtests`
--
ALTER TABLE `diagnosticsandtests`
  ADD PRIMARY KEY (`Service_ID`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`doc_ID`);

--
-- Indexes for table `logmaster`
--
ALTER TABLE `logmaster`
  ADD PRIMARY KEY (`log_id`);

--
-- Indexes for table `opd`
--
ALTER TABLE `opd`
  ADD PRIMARY KEY (`opd_ID`);

--
-- Indexes for table `opdbilling`
--
ALTER TABLE `opdbilling`
  ADD PRIMARY KEY (`sr_no`);

--
-- Indexes for table `opdbillingcontent`
--
ALTER TABLE `opdbillingcontent`
  ADD PRIMARY KEY (`opdServiceContentID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `logmaster`
--
ALTER TABLE `logmaster`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=87;
--
-- AUTO_INCREMENT for table `opd`
--
ALTER TABLE `opd`
  MODIFY `opd_ID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `opdbilling`
--
ALTER TABLE `opdbilling`
  MODIFY `sr_no` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `opdbillingcontent`
--
ALTER TABLE `opdbillingcontent`
  MODIFY `opdServiceContentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
