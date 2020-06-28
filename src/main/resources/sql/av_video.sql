/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : av_video

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 27/06/2020 18:06:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for video_info
-- ----------------------------
DROP TABLE IF EXISTS `video_info`;
CREATE TABLE `video_info` (
  `vid` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  `title` varchar(512) COLLATE utf8mb4_bin DEFAULT NULL,
  `keyword` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `channel` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `duration` double(255,0) DEFAULT NULL,
  `framerate` double(255,0) DEFAULT NULL,
  `hd` bit(1) DEFAULT NULL,
  `add_time` date DEFAULT NULL,
  `view_number` int(11) DEFAULT NULL,
  `likes` int(11) DEFAULT NULL,
  `dislikes` int(11) DEFAULT NULL,
  `video_url` varchar(512) COLLATE utf8mb4_bin DEFAULT NULL,
  `embedded_url` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `preview_url` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `preview_video_url` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `private` bit(1) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15851 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

SET FOREIGN_KEY_CHECKS = 1;
