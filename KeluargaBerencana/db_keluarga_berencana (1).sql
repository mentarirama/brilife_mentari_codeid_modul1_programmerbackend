-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 04, 2020 at 12:07 PM
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
-- Database: `db_keluarga_berencana`
--

-- --------------------------------------------------------

--
-- Table structure for table `list_kontrasepsi`
--

CREATE TABLE `list_kontrasepsi` (
  `id_kontrasepsi` int(10) NOT NULL,
  `nama_kontrasepsi` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `list_kontrasepsi`
--

INSERT INTO `list_kontrasepsi` (`id_kontrasepsi`, `nama_kontrasepsi`) VALUES
(1, 'Pil'),
(2, 'Kondom'),
(3, 'IUD');

-- --------------------------------------------------------

--
-- Table structure for table `list_pemakai_kontrasepsi`
--

CREATE TABLE `list_pemakai_kontrasepsi` (
  `id_list` int(10) NOT NULL,
  `id_propinsi` int(10) NOT NULL,
  `id_kontrasepsi` int(10) NOT NULL,
  `jumlah_pemakai` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `list_pemakai_kontrasepsi`
--

INSERT INTO `list_pemakai_kontrasepsi` (`id_list`, `id_propinsi`, `id_kontrasepsi`, `jumlah_pemakai`) VALUES
(1, 7, 2, 33),
(2, 2, 2, 90);

-- --------------------------------------------------------

--
-- Table structure for table `list_propinsi`
--

CREATE TABLE `list_propinsi` (
  `id_propinsi` int(10) NOT NULL,
  `nama_propinsi` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `list_propinsi`
--

INSERT INTO `list_propinsi` (`id_propinsi`, `nama_propinsi`) VALUES
(1, 'Aceh'),
(2, 'Sumatera Utara'),
(3, 'Sumatera Barat'),
(4, 'Riau'),
(5, 'KepulauanRiau'),
(6, 'Jambi'),
(7, 'Bangka Belitung'),
(8, 'Sumatera Selatan'),
(9, 'Lampung');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `list_kontrasepsi`
--
ALTER TABLE `list_kontrasepsi`
  ADD PRIMARY KEY (`id_kontrasepsi`);

--
-- Indexes for table `list_pemakai_kontrasepsi`
--
ALTER TABLE `list_pemakai_kontrasepsi`
  ADD PRIMARY KEY (`id_list`);

--
-- Indexes for table `list_propinsi`
--
ALTER TABLE `list_propinsi`
  ADD PRIMARY KEY (`id_propinsi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `list_kontrasepsi`
--
ALTER TABLE `list_kontrasepsi`
  MODIFY `id_kontrasepsi` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `list_pemakai_kontrasepsi`
--
ALTER TABLE `list_pemakai_kontrasepsi`
  MODIFY `id_list` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `list_propinsi`
--
ALTER TABLE `list_propinsi`
  MODIFY `id_propinsi` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
