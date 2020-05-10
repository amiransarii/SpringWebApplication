-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 10, 2020 at 04:47 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `spring_web_app_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee_table`
--

CREATE TABLE `employee_table` (
  `id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `salary` double(10,2) NOT NULL,
  `designation` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee_table`
--

INSERT INTO `employee_table` (`id`, `name`, `salary`, `designation`) VALUES
(2, 'Zeeshan Salim', 4900.00, 'Inspector'),
(3, 'Akil Khan', 45999.00, 'Up PCL'),
(4, 'Raj Kumar', 73636.00, 'Software Developer'),
(5, 'Riyaz Ahmad', 53535.00, 'Software Tester'),
(6, 'Andrew', 83838.00, 'Lecturer '),
(7, 'Rimi Sen', 377373.00, 'Actress'),
(8, 'Rafi Ahmad', 94747.00, 'Singer'),
(9, 'Salman Khan', 65467.00, 'Actor'),
(10, 'Rahul  Kumar', 54646.00, 'Student'),
(11, 'Simran', 9373.00, 'Artist'),
(12, 'Rinki', 8383.00, 'Teacher');

-- --------------------------------------------------------

--
-- Table structure for table `emp_hibernate_table`
--

CREATE TABLE `emp_hibernate_table` (
  `id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `salary` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `emp_jdbc_table`
--

CREATE TABLE `emp_jdbc_table` (
  `id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `salary` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `emp_jdbc_table`
--

INSERT INTO `emp_jdbc_table` (`id`, `name`, `salary`) VALUES
(101, 'Amir Ansari', 350000.00),
(103, 'Zeeshan Muradbadi', 99999.00),
(104, 'Ayub Khan', 88388.00),
(105, 'Rocky', 999999.00),
(106, 'Rocky', 999999.00),
(107, 'Rocky', 999999.00),
(108, 'Ram Kumar', 6363663.00);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee_table`
--
ALTER TABLE `employee_table`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `emp_hibernate_table`
--
ALTER TABLE `emp_hibernate_table`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `emp_jdbc_table`
--
ALTER TABLE `emp_jdbc_table`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee_table`
--
ALTER TABLE `employee_table`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
